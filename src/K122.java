import java.util.*;

/**
Напишите класс, который принимает с клавиатуры 15 целых чисел и
выводит на экран информацию о том, сколько из них были четными и
сколько нечетными.

*/

public class K122{
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args){
		int evenCount = 0;
		int notEvenCount = 0;
		int number;
		System.out.println("enter number");
		for(int i = 0; i<15; i++){
			number = scanner.nextInt();
			if(number % 2 == 0){
				evenCount++;
			}else if(i == 0){
				continue;
			}else {
				notEvenCount++;
			}
		}
		System.out.println("evenCount " + evenCount + " notEvenCount " + notEvenCount);
		
	}
}