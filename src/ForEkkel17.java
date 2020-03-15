import java.util.Random;

public class ForEkkel17{
	public static void main(String[] args){
		Random random = new  Random();
		int r = random.nextInt(20);
		int temp = r;
		System.out.println(temp);
		while(r<20){
				
			r = random.nextInt(20);
			if(r > temp){
				System.out.println(r + " more " + temp);
				
			}else if(r < temp){
				System.out.println(r + " smaller " + temp);
			}else {
				System.out.println(r + " equels " + temp);
				
			}
			
			temp = r;
		
		}
		
		System.out.println("cycle off");
	}
	
}