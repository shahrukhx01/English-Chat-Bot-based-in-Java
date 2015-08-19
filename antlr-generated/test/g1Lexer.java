// $ANTLR 3.5.2 D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g 2015-06-09 12:17:16

  package test;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class g1Lexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__11=11;
	public static final int AUXILIARY1=4;
	public static final int AUXILIARY2=5;
	public static final int AUXILIARY3=6;
	public static final int NOUN=7;
	public static final int QUESTMARK=8;
	public static final int VERB=9;
	public static final int WS=10;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public g1Lexer() {} 
	public g1Lexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public g1Lexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g"; }

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:11:7: ( 'be' )
			// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:11:9: 'be'
			{
			match("be"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__11"

	// $ANTLR start "AUXILIARY1"
	public final void mAUXILIARY1() throws RecognitionException {
		try {
			int _type = AUXILIARY1;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:25:11: ( ( 'do' | 'does' ) )
			// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:25:13: ( 'do' | 'does' )
			{
			// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:25:13: ( 'do' | 'does' )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='d') ) {
				int LA1_1 = input.LA(2);
				if ( (LA1_1=='o') ) {
					int LA1_2 = input.LA(3);
					if ( (LA1_2=='e') ) {
						alt1=2;
					}

					else {
						alt1=1;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:25:14: 'do'
					{
					match("do"); 

					}
					break;
				case 2 :
					// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:25:19: 'does'
					{
					match("does"); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AUXILIARY1"

	// $ANTLR start "AUXILIARY2"
	public final void mAUXILIARY2() throws RecognitionException {
		try {
			int _type = AUXILIARY2;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:26:11: ( ( 'are' | 'is' | 'am' ) )
			// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:26:13: ( 'are' | 'is' | 'am' )
			{
			// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:26:13: ( 'are' | 'is' | 'am' )
			int alt2=3;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='a') ) {
				int LA2_1 = input.LA(2);
				if ( (LA2_1=='r') ) {
					alt2=1;
				}
				else if ( (LA2_1=='m') ) {
					alt2=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA2_0=='i') ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:26:14: 'are'
					{
					match("are"); 

					}
					break;
				case 2 :
					// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:26:20: 'is'
					{
					match("is"); 

					}
					break;
				case 3 :
					// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:26:25: 'am'
					{
					match("am"); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AUXILIARY2"

	// $ANTLR start "AUXILIARY3"
	public final void mAUXILIARY3() throws RecognitionException {
		try {
			int _type = AUXILIARY3;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:27:11: ( ( 'will' | 'shall' ) )
			// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:27:13: ( 'will' | 'shall' )
			{
			// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:27:13: ( 'will' | 'shall' )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='w') ) {
				alt3=1;
			}
			else if ( (LA3_0=='s') ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:27:14: 'will'
					{
					match("will"); 

					}
					break;
				case 2 :
					// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:27:21: 'shall'
					{
					match("shall"); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AUXILIARY3"

	// $ANTLR start "NOUN"
	public final void mNOUN() throws RecognitionException {
		try {
			int _type = NOUN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:28:5: ( ( 'you' | 'me' | 'they' | 'we' | 'he' | 'she' | 'us' | 'food' | 'there' | 'bore' | 'sky' | 'tired' | 'i' | 'them' | 'cats' ) )
			// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:28:6: ( 'you' | 'me' | 'they' | 'we' | 'he' | 'she' | 'us' | 'food' | 'there' | 'bore' | 'sky' | 'tired' | 'i' | 'them' | 'cats' )
			{
			// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:28:6: ( 'you' | 'me' | 'they' | 'we' | 'he' | 'she' | 'us' | 'food' | 'there' | 'bore' | 'sky' | 'tired' | 'i' | 'them' | 'cats' )
			int alt4=15;
			switch ( input.LA(1) ) {
			case 'y':
				{
				alt4=1;
				}
				break;
			case 'm':
				{
				alt4=2;
				}
				break;
			case 't':
				{
				int LA4_3 = input.LA(2);
				if ( (LA4_3=='h') ) {
					int LA4_12 = input.LA(3);
					if ( (LA4_12=='e') ) {
						switch ( input.LA(4) ) {
						case 'y':
							{
							alt4=3;
							}
							break;
						case 'r':
							{
							alt4=9;
							}
							break;
						case 'm':
							{
							alt4=14;
							}
							break;
						default:
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 4, 16, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 12, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA4_3=='i') ) {
					alt4=12;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'w':
				{
				alt4=4;
				}
				break;
			case 'h':
				{
				alt4=5;
				}
				break;
			case 's':
				{
				int LA4_6 = input.LA(2);
				if ( (LA4_6=='h') ) {
					alt4=6;
				}
				else if ( (LA4_6=='k') ) {
					alt4=11;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'u':
				{
				alt4=7;
				}
				break;
			case 'f':
				{
				alt4=8;
				}
				break;
			case 'b':
				{
				alt4=10;
				}
				break;
			case 'i':
				{
				alt4=13;
				}
				break;
			case 'c':
				{
				alt4=15;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:28:7: 'you'
					{
					match("you"); 

					}
					break;
				case 2 :
					// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:28:13: 'me'
					{
					match("me"); 

					}
					break;
				case 3 :
					// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:28:18: 'they'
					{
					match("they"); 

					}
					break;
				case 4 :
					// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:28:25: 'we'
					{
					match("we"); 

					}
					break;
				case 5 :
					// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:28:30: 'he'
					{
					match("he"); 

					}
					break;
				case 6 :
					// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:28:35: 'she'
					{
					match("she"); 

					}
					break;
				case 7 :
					// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:28:41: 'us'
					{
					match("us"); 

					}
					break;
				case 8 :
					// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:28:46: 'food'
					{
					match("food"); 

					}
					break;
				case 9 :
					// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:28:53: 'there'
					{
					match("there"); 

					}
					break;
				case 10 :
					// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:28:61: 'bore'
					{
					match("bore"); 

					}
					break;
				case 11 :
					// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:28:68: 'sky'
					{
					match("sky"); 

					}
					break;
				case 12 :
					// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:28:74: 'tired'
					{
					match("tired"); 

					}
					break;
				case 13 :
					// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:28:82: 'i'
					{
					match('i'); 
					}
					break;
				case 14 :
					// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:28:86: 'them'
					{
					match("them"); 

					}
					break;
				case 15 :
					// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:28:93: 'cats'
					{
					match("cats"); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOUN"

	// $ANTLR start "VERB"
	public final void mVERB() throws RecognitionException {
		try {
			int _type = VERB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:29:5: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
			// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:29:6: ( 'a' .. 'z' | 'A' .. 'Z' )+
			{
			// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:29:6: ( 'a' .. 'z' | 'A' .. 'Z' )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= 'A' && LA5_0 <= 'Z')||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VERB"

	// $ANTLR start "QUESTMARK"
	public final void mQUESTMARK() throws RecognitionException {
		try {
			int _type = QUESTMARK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:31:10: ( '?' )
			// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:31:11: '?'
			{
			match('?'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUESTMARK"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:32:3: ( ( ' ' )+ )
			// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:32:5: ( ' ' )+
			{
			// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:32:5: ( ' ' )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==' ') ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:32:5: ' '
					{
					match(' '); 
					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
			}

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:1:8: ( T__11 | AUXILIARY1 | AUXILIARY2 | AUXILIARY3 | NOUN | VERB | QUESTMARK | WS )
		int alt7=8;
		alt7 = dfa7.predict(input);
		switch (alt7) {
			case 1 :
				// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:1:10: T__11
				{
				mT__11(); 

				}
				break;
			case 2 :
				// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:1:16: AUXILIARY1
				{
				mAUXILIARY1(); 

				}
				break;
			case 3 :
				// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:1:27: AUXILIARY2
				{
				mAUXILIARY2(); 

				}
				break;
			case 4 :
				// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:1:38: AUXILIARY3
				{
				mAUXILIARY3(); 

				}
				break;
			case 5 :
				// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:1:49: NOUN
				{
				mNOUN(); 

				}
				break;
			case 6 :
				// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:1:54: VERB
				{
				mVERB(); 

				}
				break;
			case 7 :
				// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:1:59: QUESTMARK
				{
				mQUESTMARK(); 

				}
				break;
			case 8 :
				// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:1:69: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA7 dfa7 = new DFA7(this);
	static final String DFA7_eotS =
		"\1\uffff\3\16\1\27\11\16\3\uffff\1\44\1\16\1\47\1\16\2\51\1\uffff\1\16"+
		"\1\27\3\16\1\27\2\16\2\27\2\16\1\uffff\2\16\1\uffff\1\51\1\uffff\2\16"+
		"\3\27\4\16\1\27\1\47\1\75\1\16\1\27\1\16\1\27\1\16\2\27\1\uffff\1\75\2"+
		"\27";
	static final String DFA7_eofS =
		"\101\uffff";
	static final String DFA7_minS =
		"\1\40\1\145\1\157\1\155\1\101\1\145\1\150\1\157\1\145\1\150\1\145\1\163"+
		"\1\157\1\141\3\uffff\1\101\1\162\1\101\1\145\2\101\1\uffff\1\154\1\101"+
		"\1\141\1\171\1\165\1\101\1\145\1\162\2\101\1\157\1\164\1\uffff\1\145\1"+
		"\163\1\uffff\1\101\1\uffff\2\154\3\101\1\155\1\145\1\144\1\163\3\101\1"+
		"\154\1\101\1\145\1\101\1\144\2\101\1\uffff\3\101";
	static final String DFA7_maxS =
		"\1\172\2\157\1\162\1\172\1\151\1\153\1\157\1\145\1\151\1\145\1\163\1\157"+
		"\1\141\3\uffff\1\172\1\162\1\172\1\145\2\172\1\uffff\1\154\1\172\1\145"+
		"\1\171\1\165\1\172\1\145\1\162\2\172\1\157\1\164\1\uffff\1\145\1\163\1"+
		"\uffff\1\172\1\uffff\2\154\3\172\1\171\1\145\1\144\1\163\3\172\1\154\1"+
		"\172\1\145\1\172\1\144\2\172\1\uffff\3\172";
	static final String DFA7_acceptS =
		"\16\uffff\1\6\1\7\1\10\6\uffff\1\5\14\uffff\1\1\2\uffff\1\2\1\uffff\1"+
		"\3\23\uffff\1\4\3\uffff";
	static final String DFA7_specialS =
		"\101\uffff}>";
	static final String[] DFA7_transitionS = {
			"\1\20\36\uffff\1\17\1\uffff\32\16\6\uffff\1\3\1\1\1\15\1\2\1\16\1\14"+
			"\1\16\1\12\1\4\3\16\1\10\5\16\1\6\1\11\1\13\1\16\1\5\1\16\1\7\1\16",
			"\1\21\11\uffff\1\22",
			"\1\23",
			"\1\25\4\uffff\1\24",
			"\32\16\6\uffff\22\16\1\26\7\16",
			"\1\31\3\uffff\1\30",
			"\1\32\2\uffff\1\33",
			"\1\34",
			"\1\35",
			"\1\36\1\37",
			"\1\40",
			"\1\41",
			"\1\42",
			"\1\43",
			"",
			"",
			"",
			"\32\16\6\uffff\32\16",
			"\1\45",
			"\32\16\6\uffff\4\16\1\46\25\16",
			"\1\50",
			"\32\16\6\uffff\32\16",
			"\32\16\6\uffff\32\16",
			"",
			"\1\52",
			"\32\16\6\uffff\32\16",
			"\1\53\3\uffff\1\54",
			"\1\55",
			"\1\56",
			"\32\16\6\uffff\32\16",
			"\1\57",
			"\1\60",
			"\32\16\6\uffff\32\16",
			"\32\16\6\uffff\32\16",
			"\1\61",
			"\1\62",
			"",
			"\1\63",
			"\1\64",
			"",
			"\32\16\6\uffff\32\16",
			"",
			"\1\65",
			"\1\66",
			"\32\16\6\uffff\32\16",
			"\32\16\6\uffff\32\16",
			"\32\16\6\uffff\32\16",
			"\1\71\4\uffff\1\70\6\uffff\1\67",
			"\1\72",
			"\1\73",
			"\1\74",
			"\32\16\6\uffff\32\16",
			"\32\16\6\uffff\32\16",
			"\32\16\6\uffff\32\16",
			"\1\76",
			"\32\16\6\uffff\32\16",
			"\1\77",
			"\32\16\6\uffff\32\16",
			"\1\100",
			"\32\16\6\uffff\32\16",
			"\32\16\6\uffff\32\16",
			"",
			"\32\16\6\uffff\32\16",
			"\32\16\6\uffff\32\16",
			"\32\16\6\uffff\32\16"
	};

	static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
	static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
	static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
	static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
	static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
	static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
	static final short[][] DFA7_transition;

	static {
		int numStates = DFA7_transitionS.length;
		DFA7_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
		}
	}

	protected class DFA7 extends DFA {

		public DFA7(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 7;
			this.eot = DFA7_eot;
			this.eof = DFA7_eof;
			this.min = DFA7_min;
			this.max = DFA7_max;
			this.accept = DFA7_accept;
			this.special = DFA7_special;
			this.transition = DFA7_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__11 | AUXILIARY1 | AUXILIARY2 | AUXILIARY3 | NOUN | VERB | QUESTMARK | WS );";
		}
	}

}
