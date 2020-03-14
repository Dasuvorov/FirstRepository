import java.util.Random;

public class HeadsOrTails{
	
	public static void main(String[] args){
		Random random = new Random();
		int tail = random.nextInt(3);
		
		if(tail ==1){
			System.out.println("OPEL");
		}else System.out.println("PEIIIKA");
		
		
	}

}