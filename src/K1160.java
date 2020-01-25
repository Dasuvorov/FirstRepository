import java.util.Scanner;

/**
Напишите класс, который принимает с клавиатуры целое число N,
а затем выводит на экран все степени двойки от 1 до N включительно.

*/

public class K1160{
	static public void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter numbeer N");
		int n = scanner.nextInt();
		for(int i = 1; i <= n; i++){
			System.out.println("2 to the power  " + i + " equally " + (int)Math.pow(2,i));
		}
		
	}
	
}