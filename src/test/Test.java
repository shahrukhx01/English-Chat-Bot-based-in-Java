package test;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

public class Test {
	public static boolean flag=true;
	
	public boolean grammarCheck(String input){
		flag=true;
		CharStream charStream=new ANTLRStringStream(input);
		g1Lexer lexer=new g1Lexer(charStream);

		TokenStream tokenStream=new CommonTokenStream(lexer);
		g1Parser parser=new g1Parser(tokenStream);
		try {
			parser.sent();
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
				
			}
		
System.out.println(""+flag);
	return flag;
	}	
	
public static void main(String args[])
{

}


}
