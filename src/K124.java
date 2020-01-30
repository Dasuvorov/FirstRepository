import java.util.*;
/**
Напишите класс, который принимает с
 клавиатуры 17 целых чисел и
выводит на экран информацию о том,
 сколько из них были больше,
чем предыдущее число. 
*/

public class K124{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int digit;
		int count = 0;
		int temp;
		System.out.println("enter number");
		digit = scanner.nextInt();
		temp = digit;
		for(int i = 0; i<16; i++){
			digit = scanner.nextInt();
			if(digit > temp){
				count++;
			}
			temp = digit;
		}
		System.out.println("count  " + count);
	}
}