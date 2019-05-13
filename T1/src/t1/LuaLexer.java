// Generated from Lua.g4 by ANTLR 4.5.1
package t1;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LuaLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"And", "Or", "Break", "Do", "Else", "Elseif", "End", "False", "For", "Function", 
		"If", "In", "Local", "Nil", "Not", "Repeat", "Return", "Then", "True", 
		"Until", "While", "ParenE", "ParenD", "PontoVir", "PontoFinal", "Virgula", 
		"Pontos3", "OpAtrib", "OpRel", "Menos", "Mais", "DoisPontos", "Multiplicar", 
		"Dividir", "Modulo", "Potencia", "LetraMinuscula", "LetraMaiuscula", "Letra", 
		"Digito", "Nome", "CadeiaCaracteres", "ConstanteNumerica", "Comentario", 
		"WS"
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


	    public static String grupo= "<507087, 726523, 726588>";


	public LuaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lua.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2+\u0132\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\5\36\u00e2\n\36\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3"+
		"&\3&\3\'\3\'\3(\3(\5(\u00f9\n(\3)\3)\3*\3*\5*\u00ff\n*\3*\3*\3*\7*\u0104"+
		"\n*\f*\16*\u0107\13*\3+\3+\7+\u010b\n+\f+\16+\u010e\13+\3+\3+\3,\6,\u0113"+
		"\n,\r,\16,\u0114\3,\3,\6,\u0119\n,\r,\16,\u011a\5,\u011d\n,\3-\3-\3-\3"+
		"-\7-\u0123\n-\f-\16-\u0126\13-\3-\3-\3-\3-\3.\6.\u012d\n.\r.\16.\u012e"+
		"\3.\3.\2\2/\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\2M\2O\2Q\2S\'U(W)Y*[+\3\2\6\4\2>>@@\4\2$$"+
		"))\3\2\f\f\5\2\13\f\17\17\"\"\u013a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2"+
		"\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\3]\3\2\2\2\5a\3\2\2\2\7d\3\2\2\2\tj"+
		"\3\2\2\2\13m\3\2\2\2\rr\3\2\2\2\17y\3\2\2\2\21}\3\2\2\2\23\u0083\3\2\2"+
		"\2\25\u0087\3\2\2\2\27\u0090\3\2\2\2\31\u0093\3\2\2\2\33\u0096\3\2\2\2"+
		"\35\u009c\3\2\2\2\37\u00a0\3\2\2\2!\u00a4\3\2\2\2#\u00ab\3\2\2\2%\u00b2"+
		"\3\2\2\2\'\u00b7\3\2\2\2)\u00bc\3\2\2\2+\u00c2\3\2\2\2-\u00c8\3\2\2\2"+
		"/\u00ca\3\2\2\2\61\u00cc\3\2\2\2\63\u00ce\3\2\2\2\65\u00d0\3\2\2\2\67"+
		"\u00d2\3\2\2\29\u00d6\3\2\2\2;\u00e1\3\2\2\2=\u00e3\3\2\2\2?\u00e5\3\2"+
		"\2\2A\u00e7\3\2\2\2C\u00ea\3\2\2\2E\u00ec\3\2\2\2G\u00ee\3\2\2\2I\u00f0"+
		"\3\2\2\2K\u00f2\3\2\2\2M\u00f4\3\2\2\2O\u00f8\3\2\2\2Q\u00fa\3\2\2\2S"+
		"\u00fe\3\2\2\2U\u0108\3\2\2\2W\u0112\3\2\2\2Y\u011e\3\2\2\2[\u012c\3\2"+
		"\2\2]^\7c\2\2^_\7p\2\2_`\7f\2\2`\4\3\2\2\2ab\7q\2\2bc\7t\2\2c\6\3\2\2"+
		"\2de\7d\2\2ef\7t\2\2fg\7g\2\2gh\7c\2\2hi\7m\2\2i\b\3\2\2\2jk\7f\2\2kl"+
		"\7q\2\2l\n\3\2\2\2mn\7g\2\2no\7n\2\2op\7u\2\2pq\7g\2\2q\f\3\2\2\2rs\7"+
		"g\2\2st\7n\2\2tu\7u\2\2uv\7g\2\2vw\7k\2\2wx\7h\2\2x\16\3\2\2\2yz\7g\2"+
		"\2z{\7p\2\2{|\7f\2\2|\20\3\2\2\2}~\7h\2\2~\177\7c\2\2\177\u0080\7n\2\2"+
		"\u0080\u0081\7u\2\2\u0081\u0082\7g\2\2\u0082\22\3\2\2\2\u0083\u0084\7"+
		"h\2\2\u0084\u0085\7q\2\2\u0085\u0086\7t\2\2\u0086\24\3\2\2\2\u0087\u0088"+
		"\7h\2\2\u0088\u0089\7w\2\2\u0089\u008a\7p\2\2\u008a\u008b\7e\2\2\u008b"+
		"\u008c\7v\2\2\u008c\u008d\7k\2\2\u008d\u008e\7q\2\2\u008e\u008f\7p\2\2"+
		"\u008f\26\3\2\2\2\u0090\u0091\7k\2\2\u0091\u0092\7h\2\2\u0092\30\3\2\2"+
		"\2\u0093\u0094\7k\2\2\u0094\u0095\7p\2\2\u0095\32\3\2\2\2\u0096\u0097"+
		"\7n\2\2\u0097\u0098\7q\2\2\u0098\u0099\7e\2\2\u0099\u009a\7c\2\2\u009a"+
		"\u009b\7n\2\2\u009b\34\3\2\2\2\u009c\u009d\7p\2\2\u009d\u009e\7k\2\2\u009e"+
		"\u009f\7n\2\2\u009f\36\3\2\2\2\u00a0\u00a1\7p\2\2\u00a1\u00a2\7q\2\2\u00a2"+
		"\u00a3\7v\2\2\u00a3 \3\2\2\2\u00a4\u00a5\7t\2\2\u00a5\u00a6\7g\2\2\u00a6"+
		"\u00a7\7r\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7c\2\2\u00a9\u00aa\7v\2\2"+
		"\u00aa\"\3\2\2\2\u00ab\u00ac\7t\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7v"+
		"\2\2\u00ae\u00af\7w\2\2\u00af\u00b0\7t\2\2\u00b0\u00b1\7p\2\2\u00b1$\3"+
		"\2\2\2\u00b2\u00b3\7v\2\2\u00b3\u00b4\7j\2\2\u00b4\u00b5\7g\2\2\u00b5"+
		"\u00b6\7p\2\2\u00b6&\3\2\2\2\u00b7\u00b8\7v\2\2\u00b8\u00b9\7t\2\2\u00b9"+
		"\u00ba\7w\2\2\u00ba\u00bb\7g\2\2\u00bb(\3\2\2\2\u00bc\u00bd\7w\2\2\u00bd"+
		"\u00be\7p\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7n\2\2"+
		"\u00c1*\3\2\2\2\u00c2\u00c3\7y\2\2\u00c3\u00c4\7j\2\2\u00c4\u00c5\7k\2"+
		"\2\u00c5\u00c6\7n\2\2\u00c6\u00c7\7g\2\2\u00c7,\3\2\2\2\u00c8\u00c9\7"+
		"*\2\2\u00c9.\3\2\2\2\u00ca\u00cb\7+\2\2\u00cb\60\3\2\2\2\u00cc\u00cd\7"+
		"=\2\2\u00cd\62\3\2\2\2\u00ce\u00cf\7\60\2\2\u00cf\64\3\2\2\2\u00d0\u00d1"+
		"\7.\2\2\u00d1\66\3\2\2\2\u00d2\u00d3\7\60\2\2\u00d3\u00d4\7\60\2\2\u00d4"+
		"\u00d5\7\60\2\2\u00d58\3\2\2\2\u00d6\u00d7\7?\2\2\u00d7:\3\2\2\2\u00d8"+
		"\u00e2\t\2\2\2\u00d9\u00da\7>\2\2\u00da\u00e2\7?\2\2\u00db\u00dc\7@\2"+
		"\2\u00dc\u00e2\7?\2\2\u00dd\u00de\7\u0080\2\2\u00de\u00e2\7?\2\2\u00df"+
		"\u00e0\7?\2\2\u00e0\u00e2\7?\2\2\u00e1\u00d8\3\2\2\2\u00e1\u00d9\3\2\2"+
		"\2\u00e1\u00db\3\2\2\2\u00e1\u00dd\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2<"+
		"\3\2\2\2\u00e3\u00e4\7/\2\2\u00e4>\3\2\2\2\u00e5\u00e6\7-\2\2\u00e6@\3"+
		"\2\2\2\u00e7\u00e8\7\60\2\2\u00e8\u00e9\7\60\2\2\u00e9B\3\2\2\2\u00ea"+
		"\u00eb\7,\2\2\u00ebD\3\2\2\2\u00ec\u00ed\7\61\2\2\u00edF\3\2\2\2\u00ee"+
		"\u00ef\7\'\2\2\u00efH\3\2\2\2\u00f0\u00f1\7`\2\2\u00f1J\3\2\2\2\u00f2"+
		"\u00f3\4c|\2\u00f3L\3\2\2\2\u00f4\u00f5\4C\\\2\u00f5N\3\2\2\2\u00f6\u00f9"+
		"\5K&\2\u00f7\u00f9\5M\'\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9"+
		"P\3\2\2\2\u00fa\u00fb\4\62;\2\u00fbR\3\2\2\2\u00fc\u00ff\5O(\2\u00fe\u00fc"+
		"\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0105\3\2\2\2\u0100\u0104\5O(\2\u0102"+
		"\u0104\5Q)\2\u0103\u0100\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0102\3\2\2"+
		"\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106T"+
		"\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u010c\t\3\2\2\u0109\u010b\n\3\2\2\u010a"+
		"\u0109\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2"+
		"\2\2\u010d\u010f\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0110\t\3\2\2\u0110"+
		"V\3\2\2\2\u0111\u0113\5Q)\2\u0112\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u011c\3\2\2\2\u0116\u0118\5\63"+
		"\32\2\u0117\u0119\5Q)\2\u0118\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u0116\3\2"+
		"\2\2\u011c\u011d\3\2\2\2\u011dX\3\2\2\2\u011e\u011f\7/\2\2\u011f\u0120"+
		"\7/\2\2\u0120\u0124\3\2\2\2\u0121\u0123\n\4\2\2\u0122\u0121\3\2\2\2\u0123"+
		"\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0127\3\2"+
		"\2\2\u0126\u0124\3\2\2\2\u0127\u0128\7\f\2\2\u0128\u0129\3\2\2\2\u0129"+
		"\u012a\b-\2\2\u012aZ\3\2\2\2\u012b\u012d\t\5\2\2\u012c\u012b\3\2\2\2\u012d"+
		"\u012e\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\3\2"+
		"\2\2\u0130\u0131\b.\2\2\u0131\\\3\2\2\2\16\2\u00e1\u00f8\u00fe\u0103\u0105"+
		"\u010c\u0114\u011a\u011c\u0124\u012e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}