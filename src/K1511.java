import java.util.Scanner;

/**
Напишите класс, который принимает с клавиатуры пары двузначных
целых чисел, пока не будет введена пара одинаковых чисел.
Класс должен выводить на экран сумму всех первых чисел в парах и
сумму всех вторых чисел в парах (не считая чисел, введенных в последней паре). 

*/

public class K1511{
	public static void main(String[] args){
		int x1 =0;
		int x2 = 0;
		int y1 =0;
		int y2 =0;
		int sumX1 = 0;
		int sumY1 = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number x");
		int x = scanner.nextInt();
		System.out.println("enter number y");
		int y = scanner.nextInt();
		while(x!=y){
			x1 = x/10;
			y1 = y/10;
		sumX1 += x1; 	
		sumY1 += y1;				
		System.out.println("enter number x");
		x = scanner.nextInt();
		System.out.println("enter number y");
		y = scanner.nextInt();
		}
		
		System.out.println("exit, because x equals y" + sumX1 + " " + sumY1);
	}
	
	
}