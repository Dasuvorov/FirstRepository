import java.util.Scanner;
/**
Напишите класс, который принимает с клавиатуры целое 
число и подсчитывает сумму его цифр.
Результат подсчета должен быть выведен на экран. 
Например, для числа 534 на экран будет выведено 12. 


*/



public class K1529{
public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number");
			
		long number = scanner.nextLong();
		int sum  = 0;
		while(number > 0){
			sum+= number%10;
			number = number/10;
		}
			System.out.println("sum " + sum);

}

}
