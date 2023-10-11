// Generated from java-escape by ANTLR 4.11.1
package com.tiendatngcs.antlr4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class StackTraceLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, Number=5, JavaWord=6, DOT=7, AT=8, CAUSED_BY=9, 
		MORE_=10, ELLIPSIS=11, COLON=12, NATIVE_METHOD=13, UNKNOWN_SOURCE=14, 
		INIT=15, NonCapitalLetter=16, CapitalLetter=17, Symbol=18, Digit=19, WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "Number", "JavaWord", "JavaCharacter", 
			"DOT", "AT", "CAUSED_BY", "MORE_", "ELLIPSIS", "COLON", "NATIVE_METHOD", 
			"UNKNOWN_SOURCE", "INIT", "NonCapitalLetter", "CapitalLetter", "Symbol", 
			"Digit", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'$'", "'.java'", null, null, "'.'", "'at'", "'Caused by:'", 
			"'more'", "'...'", "':'", "'Native Method'", "'Unknown Source'", "'<init>'", 
			null, null, "'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "Number", "JavaWord", "DOT", "AT", "CAUSED_BY", 
			"MORE_", "ELLIPSIS", "COLON", "NATIVE_METHOD", "UNKNOWN_SOURCE", "INIT", 
			"NonCapitalLetter", "CapitalLetter", "Symbol", "Digit", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public StackTraceLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "StackTrace.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0014\u0092\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0004\u00049\b\u0004\u000b\u0004\f\u0004:\u0001\u0005\u0004"+
		"\u0005>\b\u0005\u000b\u0005\f\u0005?\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006F\b\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0000\u0000\u0015\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0000\u000f\u0007\u0011\b\u0013\t\u0015\n\u0017\u000b\u0019"+
		"\f\u001b\r\u001d\u000e\u001f\u000f!\u0010#\u0011%\u0012\'\u0013)\u0014"+
		"\u0001\u0000\u0001\u0003\u0000\t\n\f\r  \u0095\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0001+\u0001\u0000\u0000\u0000\u0003-\u0001\u0000\u0000"+
		"\u0000\u0005/\u0001\u0000\u0000\u0000\u00071\u0001\u0000\u0000\u0000\t"+
		"8\u0001\u0000\u0000\u0000\u000b=\u0001\u0000\u0000\u0000\rE\u0001\u0000"+
		"\u0000\u0000\u000fG\u0001\u0000\u0000\u0000\u0011I\u0001\u0000\u0000\u0000"+
		"\u0013L\u0001\u0000\u0000\u0000\u0015W\u0001\u0000\u0000\u0000\u0017\\"+
		"\u0001\u0000\u0000\u0000\u0019`\u0001\u0000\u0000\u0000\u001bb\u0001\u0000"+
		"\u0000\u0000\u001dp\u0001\u0000\u0000\u0000\u001f\u007f\u0001\u0000\u0000"+
		"\u0000!\u0086\u0001\u0000\u0000\u0000#\u0088\u0001\u0000\u0000\u0000%"+
		"\u008a\u0001\u0000\u0000\u0000\'\u008c\u0001\u0000\u0000\u0000)\u008e"+
		"\u0001\u0000\u0000\u0000+,\u0005(\u0000\u0000,\u0002\u0001\u0000\u0000"+
		"\u0000-.\u0005)\u0000\u0000.\u0004\u0001\u0000\u0000\u0000/0\u0005$\u0000"+
		"\u00000\u0006\u0001\u0000\u0000\u000012\u0005.\u0000\u000023\u0005j\u0000"+
		"\u000034\u0005a\u0000\u000045\u0005v\u0000\u000056\u0005a\u0000\u0000"+
		"6\b\u0001\u0000\u0000\u000079\u0003\'\u0013\u000087\u0001\u0000\u0000"+
		"\u00009:\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000:;\u0001\u0000"+
		"\u0000\u0000;\n\u0001\u0000\u0000\u0000<>\u0003\r\u0006\u0000=<\u0001"+
		"\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000"+
		"?@\u0001\u0000\u0000\u0000@\f\u0001\u0000\u0000\u0000AF\u0003#\u0011\u0000"+
		"BF\u0003!\u0010\u0000CF\u0003%\u0012\u0000DF\u0003\'\u0013\u0000EA\u0001"+
		"\u0000\u0000\u0000EB\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000"+
		"ED\u0001\u0000\u0000\u0000F\u000e\u0001\u0000\u0000\u0000GH\u0005.\u0000"+
		"\u0000H\u0010\u0001\u0000\u0000\u0000IJ\u0005a\u0000\u0000JK\u0005t\u0000"+
		"\u0000K\u0012\u0001\u0000\u0000\u0000LM\u0005C\u0000\u0000MN\u0005a\u0000"+
		"\u0000NO\u0005u\u0000\u0000OP\u0005s\u0000\u0000PQ\u0005e\u0000\u0000"+
		"QR\u0005d\u0000\u0000RS\u0005 \u0000\u0000ST\u0005b\u0000\u0000TU\u0005"+
		"y\u0000\u0000UV\u0005:\u0000\u0000V\u0014\u0001\u0000\u0000\u0000WX\u0005"+
		"m\u0000\u0000XY\u0005o\u0000\u0000YZ\u0005r\u0000\u0000Z[\u0005e\u0000"+
		"\u0000[\u0016\u0001\u0000\u0000\u0000\\]\u0005.\u0000\u0000]^\u0005.\u0000"+
		"\u0000^_\u0005.\u0000\u0000_\u0018\u0001\u0000\u0000\u0000`a\u0005:\u0000"+
		"\u0000a\u001a\u0001\u0000\u0000\u0000bc\u0005N\u0000\u0000cd\u0005a\u0000"+
		"\u0000de\u0005t\u0000\u0000ef\u0005i\u0000\u0000fg\u0005v\u0000\u0000"+
		"gh\u0005e\u0000\u0000hi\u0005 \u0000\u0000ij\u0005M\u0000\u0000jk\u0005"+
		"e\u0000\u0000kl\u0005t\u0000\u0000lm\u0005h\u0000\u0000mn\u0005o\u0000"+
		"\u0000no\u0005d\u0000\u0000o\u001c\u0001\u0000\u0000\u0000pq\u0005U\u0000"+
		"\u0000qr\u0005n\u0000\u0000rs\u0005k\u0000\u0000st\u0005n\u0000\u0000"+
		"tu\u0005o\u0000\u0000uv\u0005w\u0000\u0000vw\u0005n\u0000\u0000wx\u0005"+
		" \u0000\u0000xy\u0005S\u0000\u0000yz\u0005o\u0000\u0000z{\u0005u\u0000"+
		"\u0000{|\u0005r\u0000\u0000|}\u0005c\u0000\u0000}~\u0005e\u0000\u0000"+
		"~\u001e\u0001\u0000\u0000\u0000\u007f\u0080\u0005<\u0000\u0000\u0080\u0081"+
		"\u0005i\u0000\u0000\u0081\u0082\u0005n\u0000\u0000\u0082\u0083\u0005i"+
		"\u0000\u0000\u0083\u0084\u0005t\u0000\u0000\u0084\u0085\u0005>\u0000\u0000"+
		"\u0085 \u0001\u0000\u0000\u0000\u0086\u0087\u0002az\u0000\u0087\"\u0001"+
		"\u0000\u0000\u0000\u0088\u0089\u0002AZ\u0000\u0089$\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0005_\u0000\u0000\u008b&\u0001\u0000\u0000\u0000\u008c"+
		"\u008d\u000209\u0000\u008d(\u0001\u0000\u0000\u0000\u008e\u008f\u0007"+
		"\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0091\u0006"+
		"\u0014\u0000\u0000\u0091*\u0001\u0000\u0000\u0000\u0004\u0000:?E\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}