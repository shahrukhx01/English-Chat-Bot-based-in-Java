package test;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

import java.awt.Color;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

import java.lang.Math;

public class ChatBot extends JFrame implements KeyListener{

	static final String SERIAL = "serial";
	static final String SERIAL2 = ChatBot.SERIAL;
		private static final long serialVersionUID = 1L;
	JPanel p=new JPanel();
	JTextArea dialog=new JTextArea(20,50);
	JTextArea input=new JTextArea(1,50);
	JScrollPane scroll=new JScrollPane(
		dialog,
		JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
		JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
	);
	
public static	String name="Bot";
	
String[][] chatBot={
		//standard greetings
		{"hi","hello","hola","ola","howdy"},
		{"hi","hello","hey"},
		//question greetings
		{"how are you","how r you","how are u"},
		{"good","doing well"},
		
		
		
		//present indefinite
		//1.
		{"do you know me"},
		{"may be!","yes","Ofcourse"},
		//2.
		{"do you like me"},
		{"buzz off!","BIG NOO!!","Naahh :-/"},
		//3.
		{"do you play cricket"},
		{"YESSS","HAHA Ofcourse","Seriously?"},
		//4.
		{"do you love sky"},
		{"not much","yes I like sky"},
		//5.
		{"do you eat food"},
		{"yes food is good","i dont eat much food"},
		
		//present continuous
		//1.
		{"are you getting me"},
		{"yes I'm getting you!","yes I'm intelligent enough to understand"},
		{"i like cats do you"},
		{"yes"},
		//2.
		{"are you getting bore"},
		{"yes I'm getting you!","yes I'm intelligent enough to understand"},
		//3.
		{"are you arguing me"},
		{"no! Im obedient","yes I'm"},
		//4.
		{"are you getting tired"},
		{"no I'm not getting tired.","yes I'm too much tired"},
		//5.
		{"am i bothering you"},
		{"yes you are annoying","no you are a good guy!"},

		//future indefinite
				//1.
		
		//will/shall NOUN_ARRAY VERB_ANY NOUN_ARRAY
		{"will you help me"},
		{"Sure ask me!","No I'm busy right now! "},
		//2.
		{"will you learn urdu"},
		{"Of course I'll be happy to learn!","No, It's boring."},
		//3.
		{"will you teach me"},
		{"yes I would like to!","No I don't have time"},
		//4.
		{"shall i greet you"},
		{"yes I'll wait for you!","No, I don't want to."},
		//5.
		{"will you sing me"},
		{"yes there is no shame in that!","No I hate singing"},
				
				
				
				//future continuous
		//will/shall NOUN_ARRAY be VERB_ing NOUN_ARRAY		
			//1.
			{"will you be helping me"},
			{"yes of course!","No, I'm not intersted"},
							
		//
		{"what is your name"},
		{name},
		
		
		//default
		{"your english is bad","Go and learn english","Do you know english really?"}
	};
	
	
	String[][] verbs={
		{"know","play"},		{"have","like"},		{"have","know"}
	};
		
	public static void main(String[] args){
		new ChatBot();
	}
	
	public ChatBot(){
		super("Chat Bot");
		setSize(600,400);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		dialog.setEditable(false);
		input.addKeyListener(this);
	
		p.add(scroll);
		p.add(input);
		p.setBackground(new Color(255,200,0));
		add(p);
		
		setVisible(true);
	}
	
	public void keyPressed(KeyEvent e){

		if(e.getKeyCode()==KeyEvent.VK_ENTER){
			input.setEditable(false);
			//-----grab quote-----------
			String quote=input.getText();
			input.setText("");
			addText("-->You:\t"+quote);
			quote.trim();
			
			
			
			boolean result=true;
			int j=0;//which group we're checking
			if(!(chatBot[0][0].equals(quote)||chatBot[0][1].equals(quote)||chatBot[0][2].equals(quote)||chatBot[0][3].equals(quote)||chatBot[0][4].equals(quote)||chatBot[2][0].equals(quote)||chatBot[2][1].equals(quote)||chatBot[2][2].equals(quote)))
			{
			result=new Test().grammarCheck(quote);
			
			}
	
			
			while(
				quote.charAt(quote.length()-1)=='!' ||
				quote.charAt(quote.length()-1)=='.' ||
				quote.charAt(quote.length()-1)=='?'
			){
				quote=quote.substring(0,quote.length()-1);
			}
			quote.trim();
			byte response=0;
			
			
			if(result){
			while(response==0){
				if(inArray(quote.toLowerCase(),chatBot[j*2])){
					
					
					response=2;
					int r=(int)Math.floor(Math.random()*chatBot[(j*2)+1].length);
					addText("\n-->Bot\t"+chatBot[(j*2)+1][r]);
				}
				j++;
				if(j*2==chatBot.length-1 && response==0){
					response=1;
				}
			}
			}
			else{
			//-----default--------------
				int r=(int)Math.floor(Math.random()*chatBot[chatBot.length-1].length);
				addText("\n-->Bot\t"+chatBot[chatBot.length-1][r]);
			}
		
			addText("\n");
		}
	}
	
	public void keyReleased(KeyEvent e){
		if(e.getKeyCode()==KeyEvent.VK_ENTER){
			input.setEditable(true);
		}
	}
	
	public void keyTyped(KeyEvent e){}
	
	public void addText(String str){
		dialog.setText(dialog.getText()+str);
	}
	
	public boolean inArray(String in,String[] str){
		boolean match=false;
		for(int i=0;i<str.length;i++){
			if(str[i].equals(in)){
				match=true;
			}
		}
		return match;
	}
	
	public int counter(String str[]){
		int verbID=-1;
		for(int i=0;i<str.length;i++){
			for(int j=0;j<verbs.length;j++){
				if(str[i].equals(verbs[j][0])){
					verbID=j;
				}
			}
		}
		return verbID;
	}
}