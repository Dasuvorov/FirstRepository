import java.util.Scanner;

/**
Напишите класс, который принимает с клавиатуры целое 
положительное число и выводит на экран количество 
его цифр и их сумму. 

*/

public class K1514{
	public static void main(String...args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter number");
		int a = scanner.nextInt();
		String s = "" + a;
		int length = s.length();
		System.out.println(length);
		char[] ch = s.toCharArray();
		int sum = 0;
		
		int[] arrayInt = new int[ch.length]; 
		for(int i = 0; i< ch.length; i++){
			
			
		 arrayInt[i] = (int)ch[i] - 48;
		 System.out.print(arrayInt[i] + " ");
			sum+=arrayInt[i]; 
			
			
		}
			System.out.println();
		System.out.println(sum + " YOU WIN!");
		
		
		
	}
	
	
}