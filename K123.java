import java.util.*;
/**
Напишите класс, который принимает с клавиатуры 12 целых чисел и
выводит на экран информацию о том, сколько из них были больше,
чем первое число. 
*/

public class K123{
	static Scanner scanner = new  Scanner(System.in);
	public static void main(String[] args){
		System.out.println("enter number");	
		int number = scanner.nextInt();
		int count =0;
		int x;
		
		x = number;
		for(int i = 0; i< 11; i++){
		number = scanner.nextInt();
			if(x < number){
				count++;
			}
		
		}
		System.out.println("exit " + count);
	}
}
