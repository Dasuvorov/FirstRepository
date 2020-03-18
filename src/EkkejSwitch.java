import java.util.Random;

public class EkkejSwitch{
	public static void main(String[] args){
	Random rand = new Random();
	int count = 0;
	while(count !=20){
	count++;
	int c = rand.nextInt(26) + 'a';
	System.out.print((char)c + ", " + c + ": ");
		
	switch(c){
		case 'a':
		case 'e':
		case 'i':
		case 'o':			
		case 'u': System.out.println("vovel");
		break;
		case 'y':
		case 'w':  System.out.println("conditionaly vowel");		
		break;
		default : System.out.println("consonant");
		
	}
	}
}
	
	
	
}