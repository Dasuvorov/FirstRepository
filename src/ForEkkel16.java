import java.util.Random;

public class ForEkkel16{
	public static void main(String[] args){
		Random random = new  Random();
		int r = random.nextInt(20);
		int temp = r;
		System.out.println(temp);
		for(int i = 1; i<25; i++){
				
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