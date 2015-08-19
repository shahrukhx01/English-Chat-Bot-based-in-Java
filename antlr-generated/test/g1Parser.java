// $ANTLR 3.5.2 D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g 2015-06-09 12:17:16

  package test;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class g1Parser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AUXILIARY1", "AUXILIARY2", "AUXILIARY3", 
		"NOUN", "QUESTMARK", "VERB", "WS", "'be'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public g1Parser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public g1Parser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return g1Parser.tokenNames; }
	@Override public String getGrammarFileName() { return "D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g"; }



	// $ANTLR start "sent"
	// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:14:1: sent : ( prindefinite | prcontinous | findefinite | fcontinous | pt );
	public final void sent() throws RecognitionException {
		try {
			// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:14:5: ( prindefinite | prcontinous | findefinite | fcontinous | pt )
			int alt1=5;
			switch ( input.LA(1) ) {
			case AUXILIARY1:
				{
				alt1=1;
				}
				break;
			case AUXILIARY2:
				{
				alt1=2;
				}
				break;
			case AUXILIARY3:
				{
				int LA1_3 = input.LA(2);
				if ( (LA1_3==NOUN) ) {
					int LA1_5 = input.LA(3);
					if ( (LA1_5==VERB) ) {
						alt1=3;
					}
					else if ( (LA1_5==11) ) {
						alt1=4;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case NOUN:
				{
				alt1=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:14:7: prindefinite
					{
					pushFollow(FOLLOW_prindefinite_in_sent37);
					prindefinite();
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:15:5: prcontinous
					{
					pushFollow(FOLLOW_prcontinous_in_sent44);
					prcontinous();
					state._fsp--;

					}
					break;
				case 3 :
					// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:16:5: findefinite
					{
					pushFollow(FOLLOW_findefinite_in_sent52);
					findefinite();
					state._fsp--;

					}
					break;
				case 4 :
					// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:17:5: fcontinous
					{
					pushFollow(FOLLOW_fcontinous_in_sent59);
					fcontinous();
					state._fsp--;

					}
					break;
				case 5 :
					// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:18:4: pt
					{
					pushFollow(FOLLOW_pt_in_sent64);
					pt();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "sent"



	// $ANTLR start "findefinite"
	// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:20:1: findefinite : AUXILIARY3 NOUN VERB NOUN QUESTMARK ;
	public final void findefinite() throws RecognitionException {
		try {
			// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:20:12: ( AUXILIARY3 NOUN VERB NOUN QUESTMARK )
			// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:20:13: AUXILIARY3 NOUN VERB NOUN QUESTMARK
			{
			match(input,AUXILIARY3,FOLLOW_AUXILIARY3_in_findefinite70); 
			match(input,NOUN,FOLLOW_NOUN_in_findefinite73); 
			match(input,VERB,FOLLOW_VERB_in_findefinite75); 
			match(input,NOUN,FOLLOW_NOUN_in_findefinite77); 
			match(input,QUESTMARK,FOLLOW_QUESTMARK_in_findefinite79); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "findefinite"



	// $ANTLR start "prindefinite"
	// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:21:1: prindefinite : AUXILIARY1 NOUN VERB NOUN QUESTMARK ;
	public final void prindefinite() throws RecognitionException {
		try {
			// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:21:13: ( AUXILIARY1 NOUN VERB NOUN QUESTMARK )
			// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:21:16: AUXILIARY1 NOUN VERB NOUN QUESTMARK
			{
			match(input,AUXILIARY1,FOLLOW_AUXILIARY1_in_prindefinite86); 
			match(input,NOUN,FOLLOW_NOUN_in_prindefinite89); 
			match(input,VERB,FOLLOW_VERB_in_prindefinite91); 
			match(input,NOUN,FOLLOW_NOUN_in_prindefinite93); 
			match(input,QUESTMARK,FOLLOW_QUESTMARK_in_prindefinite95); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "prindefinite"



	// $ANTLR start "prcontinous"
	// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:22:1: prcontinous : AUXILIARY2 NOUN VERB NOUN QUESTMARK ;
	public final void prcontinous() throws RecognitionException {
		try {
			// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:22:12: ( AUXILIARY2 NOUN VERB NOUN QUESTMARK )
			// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:22:14: AUXILIARY2 NOUN VERB NOUN QUESTMARK
			{
			match(input,AUXILIARY2,FOLLOW_AUXILIARY2_in_prcontinous101); 
			match(input,NOUN,FOLLOW_NOUN_in_prcontinous104); 
			match(input,VERB,FOLLOW_VERB_in_prcontinous106); 
			match(input,NOUN,FOLLOW_NOUN_in_prcontinous109); 
			match(input,QUESTMARK,FOLLOW_QUESTMARK_in_prcontinous111); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "prcontinous"



	// $ANTLR start "fcontinous"
	// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:23:1: fcontinous : AUXILIARY3 NOUN 'be' VERB NOUN QUESTMARK ;
	public final void fcontinous() throws RecognitionException {
		try {
			// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:23:11: ( AUXILIARY3 NOUN 'be' VERB NOUN QUESTMARK )
			// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:23:12: AUXILIARY3 NOUN 'be' VERB NOUN QUESTMARK
			{
			match(input,AUXILIARY3,FOLLOW_AUXILIARY3_in_fcontinous116); 
			match(input,NOUN,FOLLOW_NOUN_in_fcontinous119); 
			match(input,11,FOLLOW_11_in_fcontinous121); 
			match(input,VERB,FOLLOW_VERB_in_fcontinous123); 
			match(input,NOUN,FOLLOW_NOUN_in_fcontinous125); 
			match(input,QUESTMARK,FOLLOW_QUESTMARK_in_fcontinous127); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "fcontinous"



	// $ANTLR start "pt"
	// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:24:1: pt : NOUN VERB NOUN AUXILIARY1 NOUN ;
	public final void pt() throws RecognitionException {
		try {
			// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:24:3: ( NOUN VERB NOUN AUXILIARY1 NOUN )
			// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\ChatBot\\src\\test\\g1.g:24:5: NOUN VERB NOUN AUXILIARY1 NOUN
			{
			match(input,NOUN,FOLLOW_NOUN_in_pt133); 
			match(input,VERB,FOLLOW_VERB_in_pt135); 
			match(input,NOUN,FOLLOW_NOUN_in_pt137); 
			match(input,AUXILIARY1,FOLLOW_AUXILIARY1_in_pt139); 
			match(input,NOUN,FOLLOW_NOUN_in_pt141); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "pt"

	// Delegated rules



	public static final BitSet FOLLOW_prindefinite_in_sent37 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_prcontinous_in_sent44 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_findefinite_in_sent52 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fcontinous_in_sent59 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pt_in_sent64 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUXILIARY3_in_findefinite70 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_NOUN_in_findefinite73 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_VERB_in_findefinite75 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_NOUN_in_findefinite77 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_QUESTMARK_in_findefinite79 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUXILIARY1_in_prindefinite86 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_NOUN_in_prindefinite89 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_VERB_in_prindefinite91 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_NOUN_in_prindefinite93 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_QUESTMARK_in_prindefinite95 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUXILIARY2_in_prcontinous101 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_NOUN_in_prcontinous104 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_VERB_in_prcontinous106 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_NOUN_in_prcontinous109 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_QUESTMARK_in_prcontinous111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUXILIARY3_in_fcontinous116 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_NOUN_in_fcontinous119 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_fcontinous121 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_VERB_in_fcontinous123 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_NOUN_in_fcontinous125 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_QUESTMARK_in_fcontinous127 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOUN_in_pt133 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_VERB_in_pt135 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_NOUN_in_pt137 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_AUXILIARY1_in_pt139 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_NOUN_in_pt141 = new BitSet(new long[]{0x0000000000000002L});
}
