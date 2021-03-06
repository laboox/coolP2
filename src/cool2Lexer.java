// Generated from cool2.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class cool2Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__18=1, T__17=2, T__16=3, T__15=4, T__14=5, T__13=6, T__12=7, T__11=8, 
		T__10=9, T__9=10, T__8=11, T__7=12, T__6=13, T__5=14, T__4=15, T__3=16, 
		T__2=17, T__1=18, T__0=19, IF=20, FI=21, CLASS=22, ELSE=23, IN=24, INHERITS=25, 
		ISVOID=26, LET=27, LOOP=28, POOL=29, THEN=30, WHILE=31, CASE=32, ESAC=33, 
		NEW=34, OF=35, NOT=36, TRUE=37, FALSE=38, INTEGER=39, TYPE=40, OBJECT=41, 
		SELF=42, SELF_TYPE=43, STRING=44, SINGLE_COMMENT=45, MULTI_COMMENT=46, 
		WS=47;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'"
	};
	public static final String[] ruleNames = {
		"T__18", "T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11", 
		"T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", 
		"T__1", "T__0", "IF", "FI", "CLASS", "ELSE", "IN", "INHERITS", "ISVOID", 
		"LET", "LOOP", "POOL", "THEN", "WHILE", "CASE", "ESAC", "NEW", "OF", "NOT", 
		"TRUE", "FALSE", "DIGIT", "INTEGER", "IDTAIL", "TYPE", "OBJECT", "SELF", 
		"SELF_TYPE", "STRING", "SINGLE_COMMENT", "MULTI_COMMENT", "WS"
	};


	public cool2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "cool2.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\61\u0133\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\""+
		"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3(\3(\3)\6)\u00ef\n)\r)\16)\u00f0\3*\7*\u00f4\n*\f*\16*\u00f7"+
		"\13*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3"+
		"/\3/\7/\u0110\n/\f/\16/\u0113\13/\3/\3/\3\60\3\60\3\60\3\60\7\60\u011b"+
		"\n\60\f\60\16\60\u011e\13\60\3\60\3\60\3\61\3\61\3\61\3\61\7\61\u0126"+
		"\n\61\f\61\16\61\u0129\13\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3"+
		"\62\2\2\63\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O\2Q)S\2U*W+Y,[-]._/a\60c\61\3\2\32\4\2"+
		"KKkk\4\2HHhh\4\2EEee\4\2NNnn\4\2CCcc\4\2UUuu\4\2GGgg\4\2PPpp\4\2JJjj\4"+
		"\2TTtt\4\2VVvv\4\2XXxx\4\2QQqq\4\2FFff\4\2RRrr\4\2YYyy\4\2WWww\3\2\62"+
		";\6\2\62;C\\aac|\3\2C\\\3\2c|\3\2$$\4\2\f\f\17\17\5\2\13\f\17\17\"\"\u0135"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2Q\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\3e\3"+
		"\2\2\2\5g\3\2\2\2\7i\3\2\2\2\tl\3\2\2\2\13n\3\2\2\2\rp\3\2\2\2\17r\3\2"+
		"\2\2\21t\3\2\2\2\23v\3\2\2\2\25x\3\2\2\2\27z\3\2\2\2\31|\3\2\2\2\33~\3"+
		"\2\2\2\35\u0080\3\2\2\2\37\u0083\3\2\2\2!\u0085\3\2\2\2#\u0087\3\2\2\2"+
		"%\u0089\3\2\2\2\'\u008b\3\2\2\2)\u008e\3\2\2\2+\u0091\3\2\2\2-\u0094\3"+
		"\2\2\2/\u009a\3\2\2\2\61\u009f\3\2\2\2\63\u00a2\3\2\2\2\65\u00ab\3\2\2"+
		"\2\67\u00b2\3\2\2\29\u00b6\3\2\2\2;\u00bb\3\2\2\2=\u00c0\3\2\2\2?\u00c5"+
		"\3\2\2\2A\u00cb\3\2\2\2C\u00d0\3\2\2\2E\u00d5\3\2\2\2G\u00d9\3\2\2\2I"+
		"\u00dc\3\2\2\2K\u00e0\3\2\2\2M\u00e5\3\2\2\2O\u00eb\3\2\2\2Q\u00ee\3\2"+
		"\2\2S\u00f5\3\2\2\2U\u00f8\3\2\2\2W\u00fb\3\2\2\2Y\u00fe\3\2\2\2[\u0103"+
		"\3\2\2\2]\u010d\3\2\2\2_\u0116\3\2\2\2a\u0121\3\2\2\2c\u012f\3\2\2\2e"+
		"f\7+\2\2f\4\3\2\2\2gh\7\60\2\2h\6\3\2\2\2ij\7?\2\2jk\7@\2\2k\b\3\2\2\2"+
		"lm\7.\2\2m\n\3\2\2\2no\7-\2\2o\f\3\2\2\2pq\7/\2\2q\16\3\2\2\2rs\7,\2\2"+
		"s\20\3\2\2\2tu\7<\2\2u\22\3\2\2\2vw\7*\2\2w\24\3\2\2\2xy\7B\2\2y\26\3"+
		"\2\2\2z{\7>\2\2{\30\3\2\2\2|}\7?\2\2}\32\3\2\2\2~\177\7=\2\2\177\34\3"+
		"\2\2\2\u0080\u0081\7>\2\2\u0081\u0082\7?\2\2\u0082\36\3\2\2\2\u0083\u0084"+
		"\7}\2\2\u0084 \3\2\2\2\u0085\u0086\7\61\2\2\u0086\"\3\2\2\2\u0087\u0088"+
		"\7\u0080\2\2\u0088$\3\2\2\2\u0089\u008a\7\177\2\2\u008a&\3\2\2\2\u008b"+
		"\u008c\7>\2\2\u008c\u008d\7/\2\2\u008d(\3\2\2\2\u008e\u008f\t\2\2\2\u008f"+
		"\u0090\t\3\2\2\u0090*\3\2\2\2\u0091\u0092\t\3\2\2\u0092\u0093\t\2\2\2"+
		"\u0093,\3\2\2\2\u0094\u0095\t\4\2\2\u0095\u0096\t\5\2\2\u0096\u0097\t"+
		"\6\2\2\u0097\u0098\t\7\2\2\u0098\u0099\t\7\2\2\u0099.\3\2\2\2\u009a\u009b"+
		"\t\b\2\2\u009b\u009c\t\5\2\2\u009c\u009d\t\7\2\2\u009d\u009e\t\b\2\2\u009e"+
		"\60\3\2\2\2\u009f\u00a0\t\2\2\2\u00a0\u00a1\t\t\2\2\u00a1\62\3\2\2\2\u00a2"+
		"\u00a3\t\2\2\2\u00a3\u00a4\t\t\2\2\u00a4\u00a5\t\n\2\2\u00a5\u00a6\t\b"+
		"\2\2\u00a6\u00a7\t\13\2\2\u00a7\u00a8\t\2\2\2\u00a8\u00a9\t\f\2\2\u00a9"+
		"\u00aa\t\7\2\2\u00aa\64\3\2\2\2\u00ab\u00ac\t\2\2\2\u00ac\u00ad\t\7\2"+
		"\2\u00ad\u00ae\t\r\2\2\u00ae\u00af\t\16\2\2\u00af\u00b0\t\2\2\2\u00b0"+
		"\u00b1\t\17\2\2\u00b1\66\3\2\2\2\u00b2\u00b3\t\5\2\2\u00b3\u00b4\t\b\2"+
		"\2\u00b4\u00b5\t\f\2\2\u00b58\3\2\2\2\u00b6\u00b7\t\5\2\2\u00b7\u00b8"+
		"\t\16\2\2\u00b8\u00b9\t\16\2\2\u00b9\u00ba\t\20\2\2\u00ba:\3\2\2\2\u00bb"+
		"\u00bc\t\20\2\2\u00bc\u00bd\t\16\2\2\u00bd\u00be\t\16\2\2\u00be\u00bf"+
		"\t\5\2\2\u00bf<\3\2\2\2\u00c0\u00c1\t\f\2\2\u00c1\u00c2\t\n\2\2\u00c2"+
		"\u00c3\t\b\2\2\u00c3\u00c4\t\t\2\2\u00c4>\3\2\2\2\u00c5\u00c6\t\21\2\2"+
		"\u00c6\u00c7\t\n\2\2\u00c7\u00c8\t\2\2\2\u00c8\u00c9\t\5\2\2\u00c9\u00ca"+
		"\t\b\2\2\u00ca@\3\2\2\2\u00cb\u00cc\t\4\2\2\u00cc\u00cd\t\6\2\2\u00cd"+
		"\u00ce\t\7\2\2\u00ce\u00cf\t\b\2\2\u00cfB\3\2\2\2\u00d0\u00d1\t\b\2\2"+
		"\u00d1\u00d2\t\7\2\2\u00d2\u00d3\t\6\2\2\u00d3\u00d4\t\4\2\2\u00d4D\3"+
		"\2\2\2\u00d5\u00d6\t\t\2\2\u00d6\u00d7\t\b\2\2\u00d7\u00d8\t\21\2\2\u00d8"+
		"F\3\2\2\2\u00d9\u00da\t\16\2\2\u00da\u00db\t\3\2\2\u00dbH\3\2\2\2\u00dc"+
		"\u00dd\t\t\2\2\u00dd\u00de\t\16\2\2\u00de\u00df\t\f\2\2\u00dfJ\3\2\2\2"+
		"\u00e0\u00e1\7v\2\2\u00e1\u00e2\t\13\2\2\u00e2\u00e3\t\22\2\2\u00e3\u00e4"+
		"\t\b\2\2\u00e4L\3\2\2\2\u00e5\u00e6\7h\2\2\u00e6\u00e7\t\6\2\2\u00e7\u00e8"+
		"\t\5\2\2\u00e8\u00e9\t\7\2\2\u00e9\u00ea\t\b\2\2\u00eaN\3\2\2\2\u00eb"+
		"\u00ec\t\23\2\2\u00ecP\3\2\2\2\u00ed\u00ef\5O(\2\u00ee\u00ed\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1R\3\2\2\2"+
		"\u00f2\u00f4\t\24\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3"+
		"\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6T\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8"+
		"\u00f9\t\25\2\2\u00f9\u00fa\5S*\2\u00faV\3\2\2\2\u00fb\u00fc\t\26\2\2"+
		"\u00fc\u00fd\5S*\2\u00fdX\3\2\2\2\u00fe\u00ff\7u\2\2\u00ff\u0100\7g\2"+
		"\2\u0100\u0101\7n\2\2\u0101\u0102\7h\2\2\u0102Z\3\2\2\2\u0103\u0104\7"+
		"U\2\2\u0104\u0105\7G\2\2\u0105\u0106\7N\2\2\u0106\u0107\7H\2\2\u0107\u0108"+
		"\7a\2\2\u0108\u0109\7V\2\2\u0109\u010a\7[\2\2\u010a\u010b\7R\2\2\u010b"+
		"\u010c\7G\2\2\u010c\\\3\2\2\2\u010d\u0111\7$\2\2\u010e\u0110\n\27\2\2"+
		"\u010f\u010e\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112"+
		"\3\2\2\2\u0112\u0114\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0115\7$\2\2\u0115"+
		"^\3\2\2\2\u0116\u0117\7/\2\2\u0117\u0118\7/\2\2\u0118\u011c\3\2\2\2\u0119"+
		"\u011b\n\30\2\2\u011a\u0119\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3"+
		"\2\2\2\u011c\u011d\3\2\2\2\u011d\u011f\3\2\2\2\u011e\u011c\3\2\2\2\u011f"+
		"\u0120\b\60\2\2\u0120`\3\2\2\2\u0121\u0122\7*\2\2\u0122\u0123\7,\2\2\u0123"+
		"\u0127\3\2\2\2\u0124\u0126\13\2\2\2\u0125\u0124\3\2\2\2\u0126\u0129\3"+
		"\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012a\3\2\2\2\u0129"+
		"\u0127\3\2\2\2\u012a\u012b\7,\2\2\u012b\u012c\7+\2\2\u012c\u012d\3\2\2"+
		"\2\u012d\u012e\b\61\2\2\u012eb\3\2\2\2\u012f\u0130\t\31\2\2\u0130\u0131"+
		"\3\2\2\2\u0131\u0132\b\62\2\2\u0132d\3\2\2\2\b\2\u00f0\u00f5\u0111\u011c"+
		"\u0127\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}