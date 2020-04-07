import java.util.Scanner;

/**
Напишите класс, который принимает с клавиатуры серию целых чисел
до тех пор, пока количество четных чисел в серии остается меньше 5. 

*/

public class K1531{
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args){
		int evenCount =0;
		int number;
		
		while(true){
			System.out.println("enter number");
			number = scanner.nextInt();
			
			if(number%2 ==0){
					evenCount++;
				
				System.out.println("evenCount + " + 1 + "  = " + evenCount);
			}
			if(evenCount == 4) {break;}

		
		}
		System.out.println("everything is ready " + evenCount);
		
	}
	
}