import java.util.Scanner;
/**
Напишите класс, который принимает с клавиатуры целое число N,
а затем принимает с клавиатуры N целых чисел.
Для каждого вводимого с клавиатуры неотрицательного числа следует
вывести на экран его квадрат, а для остальных чисел - текст Пропускаем. 
*/

public class K1158{
	static Scanner scanner = new  Scanner(System.in);
	public static void main(String[] args){
		int n;
		System.out.println("enter number N");
		n = scanner.nextInt();
		int count = n;
		int tryNumber = n;
		for(int i = 1; i <= count; i++){
			System.out.println("try " + i + " to left " + tryNumber);
			n = scanner.nextInt();
				if(n > 0){
			System.out.println((int)Math.pow(n,2));
			}else {
				System.out.println("Skipping");
			}
				tryNumber--;			
		}
		
	}
}