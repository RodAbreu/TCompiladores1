grammar Lua;

@members {
    public static String grupo= "<507087, 726523, 726588>";
    //                            Lucas, Gabrieli e Rodrigo}

/*
    ****ANÁLISE LÉXICA - LINGUAGEM LUA****

    Necessários nesse trabalho:

    a) Palavras reservadas (todas)
    b) Símbolos reservados (todos)
    c) Nomes
    d)   Cadeias   de   caracteres   (apenas   as   versões   curtas,   sem   sequência   de   escape,   quebras   de   linha
    não permitidas)
    e)   Constantes   numéricas   (apenas   decimais,   sem   sinal,   com   dígitos   antes   e   depois   do   ponto
    decimal opcionais)

*/

//A) PALAVRAS RESERVADAS
// Podem ser encontradas em http://www.lua.org/manual/5.1/pt/manual.html#2.3

And: 'and';
Break: 'break';
Do: 'do';
Else: 'else';
Elseif: 'elseif';
End: 'end';
False: 'false';
For: 'for';
Function: 'function';
If: 'if';
In: 'in';
Local: 'local';
Nil: 'nil';
Not: 'not';
Or: 'or';
Repeat: 'repeat';
Return: 'return';
Then: 'then';
True: 'true';
Until: 'until';
While: 'while';


//B) SÍMBOLOS RESERVADOS:

ParenteseEsquerdo : '(' ;
ParenteseDireito : ')' ;
PontoVirgula : ';' ;
PontoFinal : '.' ;
Virgula : ',' ;
TresPontos : '...';
OperadorAtribuicao: '=';
OperadorRelacional: '<' | '>' | '<=' | '>=' | '~=' | '==';
Menos : '-' ;
Mais : '+' ;
DoisPontos : '..';
Multiplicar : '*' ;
Dividir : '/' ;
Modulo : '%' ;
Potencia : '^' ;

//LETRAS E NÚMEROS
// Fragments que auxiliam na construção das regras léxicas

fragment LetraMinuscula : ('a'..'z');
fragment LetraMaiuscula : ('A'..'Z');
fragment Letra: LetraMinuscula | LetraMaiuscula;
fragment Digito : ('0'..'9');


//C) NOMES DE VARIAVEIS:
//Qualquer cadeia de letras, números e sublinhado que não comece com um dígito

Nome: (Letra|'_')(Letra|'_'|Digito)* ;

//D) CADEIA DE CARACTERES:
//Apenas as versões curtas, sem sequência de escape, quebras de linha não permitidas

CadeiaCaracteres: ('\'' | '"')(~('\'' | '"'))*('\'' | '"');

//CONSTANTES NUMÉRICAS:
//Apenas decimais, sem sinal, com dígitos antes e depois do ponto decimal opcionais

ConstanteNumerica: Digito+ (PontoFinal Digito+)?;

//Ignora comentarios, comentarios na mesma linha
Comentario: '--' ~('\n')* '\n' -> skip;

// Ignora tabulações, returns e quebras de linha
WS : [ \t\r\n]+ -> skip;

/*
    ****ANÁLISE SINTÁTICA****
*/

// Baseando-nos na regra especificada no trabalho:
/* Algumas dicas:
-   Crie   uma   regra   nova,   no   início   da   gramática   (depois   dos   padrões   léxicos).   Ela   será   necessária   nos
testes:
*/
programa : trecho;

// Trecho de uma parte do programa, podendo ter quantos comandos necessários e opcional um ultimo comando
trecho : (comando (PontoVir)?)* (ultimocomando (PontoVir)?)?;

// Regra com os possiveis comandos, como laços de repetição, condicionais, entre outros
comando : listavar OpAtrib listaexp |
          chamadadefuncao |
          Do trecho End |
          Function nomedafuncao corpodafuncao |
          If  exp Then trecho (Elseif exp Then trecho)* (Else trecho)? End |
          Repeat trecho Until exp |
          For nome OpAtrib exp Virgula exp (Virgula exp)* Do trecho End |
          For listadenomes In listaexp Do trecho End|
          Local listadenomes (OpAtrib listaexp)?
          ;

// Regra contendo o ultimo comando, que seria um return ou um break
ultimocomando: Return (listaexp)? | Break;

// Regra para definir um nome de função e salvar na tabela de simbolos
nomedafuncao : nomeF {TabelaDeSimbolos.adicionarSimbolo($nomeF.text, Tipo.FUNCAO);};

// Regra para definir o formato de um nome de função
nomeF : Nome (PontoFinal Nome)? ;

// Regra que define o corpo de uma função, contendo a lista de parametros opicionais e um trecho
corpodafuncao : ParenE (listapar)? ParenD trecho End;

//Regra que define uma lista de expressões separada por uma virgula
listaexp : exp (Virgula exp)* ;

// Regras que definem uma expressão, no qual fora modificada por conter ambiguidade
// Como existia a regra "exp opBinaria exp", foi necessário tratá-la e deixar com associatividade à direita, criando "exp2"
exp : exp2 opBinaria exp | exp2;
exp2 : False | CadeiaCaracteres | constanteNumerica  | expprefixo | opUn exp2 ;

// Regra que define uma contante numérica
constanteNumerica: ConstanteNumerica ;

// Regra que define um operador unário
opUn : Menos ;

// Regra que define uma lista de parametros
listapar : listadenomes (Virgula Pontos3)? | Pontos3;

// Regra que define um nome de variavel e salva na tabela de simbolos
nome : Nome {TabelaDeSimbolos.adicionarSimbolo($Nome.text, Tipo.VARIAVEL);};

// Regra que define um formato para uma lista de nomes
listadenomes : nome (Virgula nome)*;

// Regra que define um prefixo de uma expressão
expprefixo: nome | ParenE exp ParenD | chamadadefuncao;

// Regra que define uma variavel
var : nome ;

//Regra que define uma chamada de função
chamadadefuncao :  nomedafuncao ParenE listaexp ParenD ;

// Regra que define uma lista de variaveis
listavar : var ( Virgula var) *;

//Regras que definem os operadores aritmeticos
opArit1 : Menos | Mais | DoisPontos;
opArit2: Multiplicar | Dividir | Modulo;

// Regra que define as operações binárias
opBinaria : opArit1 | opArit2 | OpRel ;

