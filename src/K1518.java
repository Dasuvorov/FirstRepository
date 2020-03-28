import java.util.Scanner;

/**
Напишите класс, который принимает с клавиатуры целое
число и выводит на экран все числа, которые можно
 получить из введенного за
счет «стирания последней цифры». Например, для введенного числа
52435 будут выведены на экран 5243, 524, 52, 5, О.

*/

public class K1518{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number x");
		int x = scanner.nextInt();
		while(x>0){
			x/=10;
			System.out.print(x + " ");
		}
		
	}
	
}