import java.util.Scanner;

/**
Напишите класс, который принимает с клавиатуры целое число и определяет, 
является ли оно точным квадратом целого числа. 
*/

public class K1536{
	static Scanner  scanner = new Scanner(System.in);
		static int i = 0;
		static boolean  b = false;
		public static boolean posasatic(int num){
	 while(num > i){
				
			if(i *	 i == num){
				b = true;
				break;
			}else{
				b = false;
			}
			i++;
		}
		return b;
			
		}
	public static void main(String[] args){
		System.out.println("enter number");
		int number = scanner.nextInt();
			posasatic(number);
		

		if(b){
		System.out.println("Yes  " + number + " = " + i + " * " + i);	
		}else{
			System.out.println("No  " + number );
		}
	}

}