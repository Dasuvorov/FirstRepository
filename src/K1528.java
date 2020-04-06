import java.util.Scanner;

/**
Напишите класс, который принимает с клавиатуры целое
 число и подсчитывает число цифр в нем
 (количество цифр в числе).
Результат подсчета должен быть выведен на экран.
 Например, для числа 534 на экран будет выведено 3 цифры. 

*/

public class K1528{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		long number = scanner.nextLong();
		int digit =0;
			while(number >0){
				number = number/10;
				digit++;
				
			}
			
		System.out.println("gigit for number " + digit);
		
	}
	
}