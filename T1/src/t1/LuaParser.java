// Generated from Lua.g4 by ANTLR 4.5.1
package t1;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LuaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		And=1, Or=2, Break=3, Do=4, Else=5, Elseif=6, End=7, False=8, For=9, Function=10, 
		If=11, In=12, Local=13, Nil=14, Not=15, Repeat=16, Return=17, Then=18, 
		True=19, Until=20, While=21, ParenE=22, ParenD=23, PontoVir=24, PontoFinal=25, 
		Virgula=26, Pontos3=27, OpAtrib=28, OpRel=29, Menos=30, Mais=31, DoisPontos=32, 
		Multiplicar=33, Dividir=34, Modulo=35, Potencia=36, Nome=37, CadeiaCaracteres=38, 
		ConstanteNumerica=39, Comentario=40, WS=41;
	public static final int
		RULE_programa = 0, RULE_trecho = 1, RULE_comando = 2, RULE_ultimocomando = 3, 
		RULE_nomedafuncao = 4, RULE_nomeF = 5, RULE_corpodafuncao = 6, RULE_listaexp = 7, 
		RULE_exp = 8, RULE_exp2 = 9, RULE_constanteNumerica = 10, RULE_opUn = 11, 
		RULE_listapar = 12, RULE_nome = 13, RULE_listadenomes = 14, RULE_expprefixo = 15, 
		RULE_var = 16, RULE_chamadadefuncao = 17, RULE_listavar = 18, RULE_opArit1 = 19, 
		RULE_opArit2 = 20, RULE_opBinaria = 21;
	public static final String[] ruleNames = {
		"programa", "trecho", "comando", "ultimocomando", "nomedafuncao", "nomeF", 
		"corpodafuncao", "listaexp", "exp", "exp2", "constanteNumerica", "opUn", 
		"listapar", "nome", "listadenomes", "expprefixo", "var", "chamadadefuncao", 
		"listavar", "opArit1", "opArit2", "opBinaria"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'and'", "'or'", "'break'", "'do'", "'else'", "'elseif'", "'end'", 
		"'false'", "'for'", "'function'", "'if'", "'in'", "'local'", "'nil'", 
		"'not'", "'repeat'", "'return'", "'then'", "'true'", "'until'", "'while'", 
		"'('", "')'", "';'", "'.'", "','", "'...'", "'='", null, "'-'", "'+'", 
		"'..'", "'*'", "'/'", "'%'", "'^'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "And", "Or", "Break", "Do", "Else", "Elseif", "End", "False", "For", 
		"Function", "If", "In", "Local", "Nil", "Not", "Repeat", "Return", "Then", 
		"True", "Until", "While", "ParenE", "ParenD", "PontoVir", "PontoFinal", 
		"Virgula", "Pontos3", "OpAtrib", "OpRel", "Menos", "Mais", "DoisPontos", 
		"Multiplicar", "Dividir", "Modulo", "Potencia", "Nome", "CadeiaCaracteres", 
		"ConstanteNumerica", "Comentario", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Lua.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    public static String grupo= "<507087, 726523, 726588>";

	public LuaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public TrechoContext trecho() {
			return getRuleContext(TrechoContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			trecho();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TrechoContext extends ParserRuleContext {
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public UltimocomandoContext ultimocomando() {
			return getRuleContext(UltimocomandoContext.class,0);
		}
		public List<TerminalNode> PontoVir() { return getTokens(LuaParser.PontoVir); }
		public TerminalNode PontoVir(int i) {
			return getToken(LuaParser.PontoVir, i);
		}
		public TrechoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trecho; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterTrecho(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitTrecho(this);
		}
	}

	public final TrechoContext trecho() throws RecognitionException {
		TrechoContext _localctx = new TrechoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_trecho);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Do) | (1L << For) | (1L << Function) | (1L << If) | (1L << Local) | (1L << Repeat) | (1L << Nome))) != 0)) {
				{
				{
				setState(46);
				comando();
				setState(48);
				_la = _input.LA(1);
				if (_la==PontoVir) {
					{
					setState(47);
					match(PontoVir);
					}
				}

				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			_la = _input.LA(1);
			if (_la==Break || _la==Return) {
				{
				setState(55);
				ultimocomando();
				setState(57);
				_la = _input.LA(1);
				if (_la==PontoVir) {
					{
					setState(56);
					match(PontoVir);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComandoContext extends ParserRuleContext {
		public ListavarContext listavar() {
			return getRuleContext(ListavarContext.class,0);
		}
		public TerminalNode OpAtrib() { return getToken(LuaParser.OpAtrib, 0); }
		public ListaexpContext listaexp() {
			return getRuleContext(ListaexpContext.class,0);
		}
		public ChamadadefuncaoContext chamadadefuncao() {
			return getRuleContext(ChamadadefuncaoContext.class,0);
		}
		public TerminalNode Do() { return getToken(LuaParser.Do, 0); }
		public List<TrechoContext> trecho() {
			return getRuleContexts(TrechoContext.class);
		}
		public TrechoContext trecho(int i) {
			return getRuleContext(TrechoContext.class,i);
		}
		public TerminalNode End() { return getToken(LuaParser.End, 0); }
		public TerminalNode Function() { return getToken(LuaParser.Function, 0); }
		public NomedafuncaoContext nomedafuncao() {
			return getRuleContext(NomedafuncaoContext.class,0);
		}
		public CorpodafuncaoContext corpodafuncao() {
			return getRuleContext(CorpodafuncaoContext.class,0);
		}
		public TerminalNode If() { return getToken(LuaParser.If, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> Then() { return getTokens(LuaParser.Then); }
		public TerminalNode Then(int i) {
			return getToken(LuaParser.Then, i);
		}
		public List<TerminalNode> Elseif() { return getTokens(LuaParser.Elseif); }
		public TerminalNode Elseif(int i) {
			return getToken(LuaParser.Elseif, i);
		}
		public TerminalNode Else() { return getToken(LuaParser.Else, 0); }
		public TerminalNode Repeat() { return getToken(LuaParser.Repeat, 0); }
		public TerminalNode Until() { return getToken(LuaParser.Until, 0); }
		public TerminalNode For() { return getToken(LuaParser.For, 0); }
		public NomeContext nome() {
			return getRuleContext(NomeContext.class,0);
		}
		public List<TerminalNode> Virgula() { return getTokens(LuaParser.Virgula); }
		public TerminalNode Virgula(int i) {
			return getToken(LuaParser.Virgula, i);
		}
		public ListadenomesContext listadenomes() {
			return getRuleContext(ListadenomesContext.class,0);
		}
		public TerminalNode In() { return getToken(LuaParser.In, 0); }
		public TerminalNode Local() { return getToken(LuaParser.Local, 0); }
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitComando(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comando);
		int _la;
		try {
			setState(130);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				listavar();
				setState(62);
				match(OpAtrib);
				setState(63);
				listaexp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				chamadadefuncao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				match(Do);
				setState(67);
				trecho();
				setState(68);
				match(End);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(70);
				match(Function);
				setState(71);
				nomedafuncao();
				setState(72);
				corpodafuncao();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(74);
				match(If);
				setState(75);
				exp();
				setState(76);
				match(Then);
				setState(77);
				trecho();
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Elseif) {
					{
					{
					setState(78);
					match(Elseif);
					setState(79);
					exp();
					setState(80);
					match(Then);
					setState(81);
					trecho();
					}
					}
					setState(87);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(90);
				_la = _input.LA(1);
				if (_la==Else) {
					{
					setState(88);
					match(Else);
					setState(89);
					trecho();
					}
				}

				setState(92);
				match(End);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(94);
				match(Repeat);
				setState(95);
				trecho();
				setState(96);
				match(Until);
				setState(97);
				exp();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(99);
				match(For);
				setState(100);
				nome();
				setState(101);
				match(OpAtrib);
				setState(102);
				exp();
				setState(103);
				match(Virgula);
				setState(104);
				exp();
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Virgula) {
					{
					{
					setState(105);
					match(Virgula);
					setState(106);
					exp();
					}
					}
					setState(111);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(112);
				match(Do);
				setState(113);
				trecho();
				setState(114);
				match(End);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(116);
				match(For);
				setState(117);
				listadenomes();
				setState(118);
				match(In);
				setState(119);
				listaexp();
				setState(120);
				match(Do);
				setState(121);
				trecho();
				setState(122);
				match(End);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(124);
				match(Local);
				setState(125);
				listadenomes();
				setState(128);
				_la = _input.LA(1);
				if (_la==OpAtrib) {
					{
					setState(126);
					match(OpAtrib);
					setState(127);
					listaexp();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UltimocomandoContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(LuaParser.Return, 0); }
		public ListaexpContext listaexp() {
			return getRuleContext(ListaexpContext.class,0);
		}
		public TerminalNode Break() { return getToken(LuaParser.Break, 0); }
		public UltimocomandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ultimocomando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterUltimocomando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitUltimocomando(this);
		}
	}

	public final UltimocomandoContext ultimocomando() throws RecognitionException {
		UltimocomandoContext _localctx = new UltimocomandoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ultimocomando);
		int _la;
		try {
			setState(137);
			switch (_input.LA(1)) {
			case Return:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(Return);
				setState(134);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << False) | (1L << ParenE) | (1L << Menos) | (1L << Nome) | (1L << CadeiaCaracteres) | (1L << ConstanteNumerica))) != 0)) {
					{
					setState(133);
					listaexp();
					}
				}

				}
				break;
			case Break:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(Break);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NomedafuncaoContext extends ParserRuleContext {
		public NomeFContext nomeF;
		public NomeFContext nomeF() {
			return getRuleContext(NomeFContext.class,0);
		}
		public NomedafuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nomedafuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterNomedafuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitNomedafuncao(this);
		}
	}

	public final NomedafuncaoContext nomedafuncao() throws RecognitionException {
		NomedafuncaoContext _localctx = new NomedafuncaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_nomedafuncao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			((NomedafuncaoContext)_localctx).nomeF = nomeF();
			TabelaDeSimbolos.adicionarSimbolo((((NomedafuncaoContext)_localctx).nomeF!=null?_input.getText(((NomedafuncaoContext)_localctx).nomeF.start,((NomedafuncaoContext)_localctx).nomeF.stop):null), Tipo.FUNCAO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NomeFContext extends ParserRuleContext {
		public List<TerminalNode> Nome() { return getTokens(LuaParser.Nome); }
		public TerminalNode Nome(int i) {
			return getToken(LuaParser.Nome, i);
		}
		public TerminalNode PontoFinal() { return getToken(LuaParser.PontoFinal, 0); }
		public NomeFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nomeF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterNomeF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitNomeF(this);
		}
	}

	public final NomeFContext nomeF() throws RecognitionException {
		NomeFContext _localctx = new NomeFContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_nomeF);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(Nome);
			setState(145);
			_la = _input.LA(1);
			if (_la==PontoFinal) {
				{
				setState(143);
				match(PontoFinal);
				setState(144);
				match(Nome);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CorpodafuncaoContext extends ParserRuleContext {
		public TerminalNode ParenE() { return getToken(LuaParser.ParenE, 0); }
		public TerminalNode ParenD() { return getToken(LuaParser.ParenD, 0); }
		public TrechoContext trecho() {
			return getRuleContext(TrechoContext.class,0);
		}
		public TerminalNode End() { return getToken(LuaParser.End, 0); }
		public ListaparContext listapar() {
			return getRuleContext(ListaparContext.class,0);
		}
		public CorpodafuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpodafuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterCorpodafuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitCorpodafuncao(this);
		}
	}

	public final CorpodafuncaoContext corpodafuncao() throws RecognitionException {
		CorpodafuncaoContext _localctx = new CorpodafuncaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_corpodafuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(ParenE);
			setState(149);
			_la = _input.LA(1);
			if (_la==Pontos3 || _la==Nome) {
				{
				setState(148);
				listapar();
				}
			}

			setState(151);
			match(ParenD);
			setState(152);
			trecho();
			setState(153);
			match(End);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListaexpContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> Virgula() { return getTokens(LuaParser.Virgula); }
		public TerminalNode Virgula(int i) {
			return getToken(LuaParser.Virgula, i);
		}
		public ListaexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterListaexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitListaexp(this);
		}
	}

	public final ListaexpContext listaexp() throws RecognitionException {
		ListaexpContext _localctx = new ListaexpContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_listaexp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			exp();
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Virgula) {
				{
				{
				setState(156);
				match(Virgula);
				setState(157);
				exp();
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public Exp2Context exp2() {
			return getRuleContext(Exp2Context.class,0);
		}
		public OpBinariaContext opBinaria() {
			return getRuleContext(OpBinariaContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_exp);
		try {
			setState(168);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				exp2();
				setState(164);
				opBinaria();
				setState(165);
				exp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				exp2();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp2Context extends ParserRuleContext {
		public TerminalNode False() { return getToken(LuaParser.False, 0); }
		public TerminalNode CadeiaCaracteres() { return getToken(LuaParser.CadeiaCaracteres, 0); }
		public ConstanteNumericaContext constanteNumerica() {
			return getRuleContext(ConstanteNumericaContext.class,0);
		}
		public ExpprefixoContext expprefixo() {
			return getRuleContext(ExpprefixoContext.class,0);
		}
		public OpUnContext opUn() {
			return getRuleContext(OpUnContext.class,0);
		}
		public Exp2Context exp2() {
			return getRuleContext(Exp2Context.class,0);
		}
		public Exp2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterExp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitExp2(this);
		}
	}

	public final Exp2Context exp2() throws RecognitionException {
		Exp2Context _localctx = new Exp2Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_exp2);
		try {
			setState(177);
			switch (_input.LA(1)) {
			case False:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(False);
				}
				break;
			case CadeiaCaracteres:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				match(CadeiaCaracteres);
				}
				break;
			case ConstanteNumerica:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				constanteNumerica();
				}
				break;
			case ParenE:
			case Nome:
				enterOuterAlt(_localctx, 4);
				{
				setState(173);
				expprefixo();
				}
				break;
			case Menos:
				enterOuterAlt(_localctx, 5);
				{
				setState(174);
				opUn();
				setState(175);
				exp2();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstanteNumericaContext extends ParserRuleContext {
		public TerminalNode ConstanteNumerica() { return getToken(LuaParser.ConstanteNumerica, 0); }
		public ConstanteNumericaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constanteNumerica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterConstanteNumerica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitConstanteNumerica(this);
		}
	}

	public final ConstanteNumericaContext constanteNumerica() throws RecognitionException {
		ConstanteNumericaContext _localctx = new ConstanteNumericaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_constanteNumerica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(ConstanteNumerica);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpUnContext extends ParserRuleContext {
		public TerminalNode Menos() { return getToken(LuaParser.Menos, 0); }
		public OpUnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opUn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOpUn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOpUn(this);
		}
	}

	public final OpUnContext opUn() throws RecognitionException {
		OpUnContext _localctx = new OpUnContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_opUn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(Menos);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListaparContext extends ParserRuleContext {
		public ListadenomesContext listadenomes() {
			return getRuleContext(ListadenomesContext.class,0);
		}
		public TerminalNode Virgula() { return getToken(LuaParser.Virgula, 0); }
		public TerminalNode Pontos3() { return getToken(LuaParser.Pontos3, 0); }
		public ListaparContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listapar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterListapar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitListapar(this);
		}
	}

	public final ListaparContext listapar() throws RecognitionException {
		ListaparContext _localctx = new ListaparContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_listapar);
		int _la;
		try {
			setState(189);
			switch (_input.LA(1)) {
			case Nome:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				listadenomes();
				setState(186);
				_la = _input.LA(1);
				if (_la==Virgula) {
					{
					setState(184);
					match(Virgula);
					setState(185);
					match(Pontos3);
					}
				}

				}
				break;
			case Pontos3:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				match(Pontos3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NomeContext extends ParserRuleContext {
		public Token Nome;
		public TerminalNode Nome() { return getToken(LuaParser.Nome, 0); }
		public NomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nome; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterNome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitNome(this);
		}
	}

	public final NomeContext nome() throws RecognitionException {
		NomeContext _localctx = new NomeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_nome);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			((NomeContext)_localctx).Nome = match(Nome);
			TabelaDeSimbolos.adicionarSimbolo((((NomeContext)_localctx).Nome!=null?((NomeContext)_localctx).Nome.getText():null), Tipo.VARIAVEL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListadenomesContext extends ParserRuleContext {
		public List<NomeContext> nome() {
			return getRuleContexts(NomeContext.class);
		}
		public NomeContext nome(int i) {
			return getRuleContext(NomeContext.class,i);
		}
		public List<TerminalNode> Virgula() { return getTokens(LuaParser.Virgula); }
		public TerminalNode Virgula(int i) {
			return getToken(LuaParser.Virgula, i);
		}
		public ListadenomesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listadenomes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterListadenomes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitListadenomes(this);
		}
	}

	public final ListadenomesContext listadenomes() throws RecognitionException {
		ListadenomesContext _localctx = new ListadenomesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_listadenomes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			nome();
			setState(199);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(195);
					match(Virgula);
					setState(196);
					nome();
					}
					} 
				}
				setState(201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpprefixoContext extends ParserRuleContext {
		public NomeContext nome() {
			return getRuleContext(NomeContext.class,0);
		}
		public TerminalNode ParenE() { return getToken(LuaParser.ParenE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode ParenD() { return getToken(LuaParser.ParenD, 0); }
		public ChamadadefuncaoContext chamadadefuncao() {
			return getRuleContext(ChamadadefuncaoContext.class,0);
		}
		public ExpprefixoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expprefixo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterExpprefixo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitExpprefixo(this);
		}
	}

	public final ExpprefixoContext expprefixo() throws RecognitionException {
		ExpprefixoContext _localctx = new ExpprefixoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expprefixo);
		try {
			setState(208);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				nome();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				match(ParenE);
				setState(204);
				exp();
				setState(205);
				match(ParenD);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
				chamadadefuncao();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public NomeContext nome() {
			return getRuleContext(NomeContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			nome();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChamadadefuncaoContext extends ParserRuleContext {
		public NomedafuncaoContext nomedafuncao() {
			return getRuleContext(NomedafuncaoContext.class,0);
		}
		public TerminalNode ParenE() { return getToken(LuaParser.ParenE, 0); }
		public ListaexpContext listaexp() {
			return getRuleContext(ListaexpContext.class,0);
		}
		public TerminalNode ParenD() { return getToken(LuaParser.ParenD, 0); }
		public ChamadadefuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamadadefuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterChamadadefuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitChamadadefuncao(this);
		}
	}

	public final ChamadadefuncaoContext chamadadefuncao() throws RecognitionException {
		ChamadadefuncaoContext _localctx = new ChamadadefuncaoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_chamadadefuncao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			nomedafuncao();
			setState(213);
			match(ParenE);
			setState(214);
			listaexp();
			setState(215);
			match(ParenD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListavarContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<TerminalNode> Virgula() { return getTokens(LuaParser.Virgula); }
		public TerminalNode Virgula(int i) {
			return getToken(LuaParser.Virgula, i);
		}
		public ListavarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listavar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterListavar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitListavar(this);
		}
	}

	public final ListavarContext listavar() throws RecognitionException {
		ListavarContext _localctx = new ListavarContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_listavar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			var();
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Virgula) {
				{
				{
				setState(218);
				match(Virgula);
				setState(219);
				var();
				}
				}
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpArit1Context extends ParserRuleContext {
		public TerminalNode Menos() { return getToken(LuaParser.Menos, 0); }
		public TerminalNode Mais() { return getToken(LuaParser.Mais, 0); }
		public TerminalNode DoisPontos() { return getToken(LuaParser.DoisPontos, 0); }
		public OpArit1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opArit1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOpArit1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOpArit1(this);
		}
	}

	public final OpArit1Context opArit1() throws RecognitionException {
		OpArit1Context _localctx = new OpArit1Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_opArit1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Menos) | (1L << Mais) | (1L << DoisPontos))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpArit2Context extends ParserRuleContext {
		public TerminalNode Multiplicar() { return getToken(LuaParser.Multiplicar, 0); }
		public TerminalNode Dividir() { return getToken(LuaParser.Dividir, 0); }
		public TerminalNode Modulo() { return getToken(LuaParser.Modulo, 0); }
		public OpArit2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opArit2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOpArit2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOpArit2(this);
		}
	}

	public final OpArit2Context opArit2() throws RecognitionException {
		OpArit2Context _localctx = new OpArit2Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_opArit2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Multiplicar) | (1L << Dividir) | (1L << Modulo))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpBinariaContext extends ParserRuleContext {
		public OpArit1Context opArit1() {
			return getRuleContext(OpArit1Context.class,0);
		}
		public OpArit2Context opArit2() {
			return getRuleContext(OpArit2Context.class,0);
		}
		public TerminalNode OpRel() { return getToken(LuaParser.OpRel, 0); }
		public OpBinariaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opBinaria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOpBinaria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOpBinaria(this);
		}
	}

	public final OpBinariaContext opBinaria() throws RecognitionException {
		OpBinariaContext _localctx = new OpBinariaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_opBinaria);
		try {
			setState(232);
			switch (_input.LA(1)) {
			case Menos:
			case Mais:
			case DoisPontos:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				opArit1();
				}
				break;
			case Multiplicar:
			case Dividir:
			case Modulo:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				opArit2();
				}
				break;
			case OpRel:
				enterOuterAlt(_localctx, 3);
				{
				setState(231);
				match(OpRel);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3+\u00ed\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3\3\5\3"+
		"\63\n\3\7\3\65\n\3\f\3\16\38\13\3\3\3\3\3\5\3<\n\3\5\3>\n\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\7\4V\n\4\f\4\16\4Y\13\4\3\4\3\4\5\4]\n\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4n\n\4\f\4\16\4q\13\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0083\n"+
		"\4\5\4\u0085\n\4\3\5\3\5\5\5\u0089\n\5\3\5\5\5\u008c\n\5\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\5\7\u0094\n\7\3\b\3\b\5\b\u0098\n\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\7\t\u00a1\n\t\f\t\16\t\u00a4\13\t\3\n\3\n\3\n\3\n\3\n\5\n\u00ab\n"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b4\n\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\16\5\16\u00bd\n\16\3\16\5\16\u00c0\n\16\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\7\20\u00c8\n\20\f\20\16\20\u00cb\13\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\5\21\u00d3\n\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\7\24\u00df\n\24\f\24\16\24\u00e2\13\24\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\27\5\27\u00eb\n\27\3\27\2\2\30\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,\2\4\3\2 \"\3\2#%\u00f8\2.\3\2\2\2\4\66\3\2\2\2\6"+
		"\u0084\3\2\2\2\b\u008b\3\2\2\2\n\u008d\3\2\2\2\f\u0090\3\2\2\2\16\u0095"+
		"\3\2\2\2\20\u009d\3\2\2\2\22\u00aa\3\2\2\2\24\u00b3\3\2\2\2\26\u00b5\3"+
		"\2\2\2\30\u00b7\3\2\2\2\32\u00bf\3\2\2\2\34\u00c1\3\2\2\2\36\u00c4\3\2"+
		"\2\2 \u00d2\3\2\2\2\"\u00d4\3\2\2\2$\u00d6\3\2\2\2&\u00db\3\2\2\2(\u00e3"+
		"\3\2\2\2*\u00e5\3\2\2\2,\u00ea\3\2\2\2./\5\4\3\2/\3\3\2\2\2\60\62\5\6"+
		"\4\2\61\63\7\32\2\2\62\61\3\2\2\2\62\63\3\2\2\2\63\65\3\2\2\2\64\60\3"+
		"\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67=\3\2\2\28\66\3\2\2\2"+
		"9;\5\b\5\2:<\7\32\2\2;:\3\2\2\2;<\3\2\2\2<>\3\2\2\2=9\3\2\2\2=>\3\2\2"+
		"\2>\5\3\2\2\2?@\5&\24\2@A\7\36\2\2AB\5\20\t\2B\u0085\3\2\2\2C\u0085\5"+
		"$\23\2DE\7\6\2\2EF\5\4\3\2FG\7\t\2\2G\u0085\3\2\2\2HI\7\f\2\2IJ\5\n\6"+
		"\2JK\5\16\b\2K\u0085\3\2\2\2LM\7\r\2\2MN\5\22\n\2NO\7\24\2\2OW\5\4\3\2"+
		"PQ\7\b\2\2QR\5\22\n\2RS\7\24\2\2ST\5\4\3\2TV\3\2\2\2UP\3\2\2\2VY\3\2\2"+
		"\2WU\3\2\2\2WX\3\2\2\2X\\\3\2\2\2YW\3\2\2\2Z[\7\7\2\2[]\5\4\3\2\\Z\3\2"+
		"\2\2\\]\3\2\2\2]^\3\2\2\2^_\7\t\2\2_\u0085\3\2\2\2`a\7\22\2\2ab\5\4\3"+
		"\2bc\7\26\2\2cd\5\22\n\2d\u0085\3\2\2\2ef\7\13\2\2fg\5\34\17\2gh\7\36"+
		"\2\2hi\5\22\n\2ij\7\34\2\2jo\5\22\n\2kl\7\34\2\2ln\5\22\n\2mk\3\2\2\2"+
		"nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2\2qo\3\2\2\2rs\7\6\2\2st\5\4\3\2"+
		"tu\7\t\2\2u\u0085\3\2\2\2vw\7\13\2\2wx\5\36\20\2xy\7\16\2\2yz\5\20\t\2"+
		"z{\7\6\2\2{|\5\4\3\2|}\7\t\2\2}\u0085\3\2\2\2~\177\7\17\2\2\177\u0082"+
		"\5\36\20\2\u0080\u0081\7\36\2\2\u0081\u0083\5\20\t\2\u0082\u0080\3\2\2"+
		"\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084?\3\2\2\2\u0084C\3\2\2"+
		"\2\u0084D\3\2\2\2\u0084H\3\2\2\2\u0084L\3\2\2\2\u0084`\3\2\2\2\u0084e"+
		"\3\2\2\2\u0084v\3\2\2\2\u0084~\3\2\2\2\u0085\7\3\2\2\2\u0086\u0088\7\23"+
		"\2\2\u0087\u0089\5\20\t\2\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\u008c\3\2\2\2\u008a\u008c\7\5\2\2\u008b\u0086\3\2\2\2\u008b\u008a\3\2"+
		"\2\2\u008c\t\3\2\2\2\u008d\u008e\5\f\7\2\u008e\u008f\b\6\1\2\u008f\13"+
		"\3\2\2\2\u0090\u0093\7\'\2\2\u0091\u0092\7\33\2\2\u0092\u0094\7\'\2\2"+
		"\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\r\3\2\2\2\u0095\u0097\7"+
		"\30\2\2\u0096\u0098\5\32\16\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2\2\2"+
		"\u0098\u0099\3\2\2\2\u0099\u009a\7\31\2\2\u009a\u009b\5\4\3\2\u009b\u009c"+
		"\7\t\2\2\u009c\17\3\2\2\2\u009d\u00a2\5\22\n\2\u009e\u009f\7\34\2\2\u009f"+
		"\u00a1\5\22\n\2\u00a0\u009e\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3"+
		"\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\21\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5"+
		"\u00a6\5\24\13\2\u00a6\u00a7\5,\27\2\u00a7\u00a8\5\22\n\2\u00a8\u00ab"+
		"\3\2\2\2\u00a9\u00ab\5\24\13\2\u00aa\u00a5\3\2\2\2\u00aa\u00a9\3\2\2\2"+
		"\u00ab\23\3\2\2\2\u00ac\u00b4\7\n\2\2\u00ad\u00b4\7(\2\2\u00ae\u00b4\5"+
		"\26\f\2\u00af\u00b4\5 \21\2\u00b0\u00b1\5\30\r\2\u00b1\u00b2\5\24\13\2"+
		"\u00b2\u00b4\3\2\2\2\u00b3\u00ac\3\2\2\2\u00b3\u00ad\3\2\2\2\u00b3\u00ae"+
		"\3\2\2\2\u00b3\u00af\3\2\2\2\u00b3\u00b0\3\2\2\2\u00b4\25\3\2\2\2\u00b5"+
		"\u00b6\7)\2\2\u00b6\27\3\2\2\2\u00b7\u00b8\7 \2\2\u00b8\31\3\2\2\2\u00b9"+
		"\u00bc\5\36\20\2\u00ba\u00bb\7\34\2\2\u00bb\u00bd\7\35\2\2\u00bc\u00ba"+
		"\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00c0\7\35\2\2"+
		"\u00bf\u00b9\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0\33\3\2\2\2\u00c1\u00c2"+
		"\7\'\2\2\u00c2\u00c3\b\17\1\2\u00c3\35\3\2\2\2\u00c4\u00c9\5\34\17\2\u00c5"+
		"\u00c6\7\34\2\2\u00c6\u00c8\5\34\17\2\u00c7\u00c5\3\2\2\2\u00c8\u00cb"+
		"\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\37\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cc\u00d3\5\34\17\2\u00cd\u00ce\7\30\2\2\u00ce\u00cf"+
		"\5\22\n\2\u00cf\u00d0\7\31\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00d3\5$\23\2"+
		"\u00d2\u00cc\3\2\2\2\u00d2\u00cd\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3!\3"+
		"\2\2\2\u00d4\u00d5\5\34\17\2\u00d5#\3\2\2\2\u00d6\u00d7\5\n\6\2\u00d7"+
		"\u00d8\7\30\2\2\u00d8\u00d9\5\20\t\2\u00d9\u00da\7\31\2\2\u00da%\3\2\2"+
		"\2\u00db\u00e0\5\"\22\2\u00dc\u00dd\7\34\2\2\u00dd\u00df\5\"\22\2\u00de"+
		"\u00dc\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2"+
		"\2\2\u00e1\'\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e4\t\2\2\2\u00e4)\3"+
		"\2\2\2\u00e5\u00e6\t\3\2\2\u00e6+\3\2\2\2\u00e7\u00eb\5(\25\2\u00e8\u00eb"+
		"\5*\26\2\u00e9\u00eb\7\37\2\2\u00ea\u00e7\3\2\2\2\u00ea\u00e8\3\2\2\2"+
		"\u00ea\u00e9\3\2\2\2\u00eb-\3\2\2\2\30\62\66;=W\\o\u0082\u0084\u0088\u008b"+
		"\u0093\u0097\u00a2\u00aa\u00b3\u00bc\u00bf\u00c9\u00d2\u00e0\u00ea";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}