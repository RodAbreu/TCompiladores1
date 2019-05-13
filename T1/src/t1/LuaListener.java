// Generated from Lua.g4 by ANTLR 4.5.1
package t1;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LuaParser}.
 */
public interface LuaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LuaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(LuaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(LuaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#trecho}.
	 * @param ctx the parse tree
	 */
	void enterTrecho(LuaParser.TrechoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#trecho}.
	 * @param ctx the parse tree
	 */
	void exitTrecho(LuaParser.TrechoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(LuaParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(LuaParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#ultimocomando}.
	 * @param ctx the parse tree
	 */
	void enterUltimocomando(LuaParser.UltimocomandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#ultimocomando}.
	 * @param ctx the parse tree
	 */
	void exitUltimocomando(LuaParser.UltimocomandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#nomedafuncao}.
	 * @param ctx the parse tree
	 */
	void enterNomedafuncao(LuaParser.NomedafuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#nomedafuncao}.
	 * @param ctx the parse tree
	 */
	void exitNomedafuncao(LuaParser.NomedafuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#nomeF}.
	 * @param ctx the parse tree
	 */
	void enterNomeF(LuaParser.NomeFContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#nomeF}.
	 * @param ctx the parse tree
	 */
	void exitNomeF(LuaParser.NomeFContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#corpodafuncao}.
	 * @param ctx the parse tree
	 */
	void enterCorpodafuncao(LuaParser.CorpodafuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#corpodafuncao}.
	 * @param ctx the parse tree
	 */
	void exitCorpodafuncao(LuaParser.CorpodafuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#listaexp}.
	 * @param ctx the parse tree
	 */
	void enterListaexp(LuaParser.ListaexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#listaexp}.
	 * @param ctx the parse tree
	 */
	void exitListaexp(LuaParser.ListaexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(LuaParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(LuaParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#exp2}.
	 * @param ctx the parse tree
	 */
	void enterExp2(LuaParser.Exp2Context ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#exp2}.
	 * @param ctx the parse tree
	 */
	void exitExp2(LuaParser.Exp2Context ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#constanteNumerica}.
	 * @param ctx the parse tree
	 */
	void enterConstanteNumerica(LuaParser.ConstanteNumericaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#constanteNumerica}.
	 * @param ctx the parse tree
	 */
	void exitConstanteNumerica(LuaParser.ConstanteNumericaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#opUn}.
	 * @param ctx the parse tree
	 */
	void enterOpUn(LuaParser.OpUnContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#opUn}.
	 * @param ctx the parse tree
	 */
	void exitOpUn(LuaParser.OpUnContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#listapar}.
	 * @param ctx the parse tree
	 */
	void enterListapar(LuaParser.ListaparContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#listapar}.
	 * @param ctx the parse tree
	 */
	void exitListapar(LuaParser.ListaparContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#nome}.
	 * @param ctx the parse tree
	 */
	void enterNome(LuaParser.NomeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#nome}.
	 * @param ctx the parse tree
	 */
	void exitNome(LuaParser.NomeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#listadenomes}.
	 * @param ctx the parse tree
	 */
	void enterListadenomes(LuaParser.ListadenomesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#listadenomes}.
	 * @param ctx the parse tree
	 */
	void exitListadenomes(LuaParser.ListadenomesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#expprefixo}.
	 * @param ctx the parse tree
	 */
	void enterExpprefixo(LuaParser.ExpprefixoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#expprefixo}.
	 * @param ctx the parse tree
	 */
	void exitExpprefixo(LuaParser.ExpprefixoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(LuaParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(LuaParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#chamadadefuncao}.
	 * @param ctx the parse tree
	 */
	void enterChamadadefuncao(LuaParser.ChamadadefuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#chamadadefuncao}.
	 * @param ctx the parse tree
	 */
	void exitChamadadefuncao(LuaParser.ChamadadefuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#listavar}.
	 * @param ctx the parse tree
	 */
	void enterListavar(LuaParser.ListavarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#listavar}.
	 * @param ctx the parse tree
	 */
	void exitListavar(LuaParser.ListavarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#opArit1}.
	 * @param ctx the parse tree
	 */
	void enterOpArit1(LuaParser.OpArit1Context ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#opArit1}.
	 * @param ctx the parse tree
	 */
	void exitOpArit1(LuaParser.OpArit1Context ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#opArit2}.
	 * @param ctx the parse tree
	 */
	void enterOpArit2(LuaParser.OpArit2Context ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#opArit2}.
	 * @param ctx the parse tree
	 */
	void exitOpArit2(LuaParser.OpArit2Context ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#opBinaria}.
	 * @param ctx the parse tree
	 */
	void enterOpBinaria(LuaParser.OpBinariaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#opBinaria}.
	 * @param ctx the parse tree
	 */
	void exitOpBinaria(LuaParser.OpBinariaContext ctx);
}