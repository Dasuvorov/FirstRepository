import java.util.Scanner;
/**
Назовем «дважды делимым» целое положительное число, если и оно
само, и сумма его делителей - делятся 
(без остатка, разумеется) на
количество делителей числа.
Напишите класс, который принимает с клавиатуры 
целое положительное число и проверяет, 
является ли оно· «дважды делимым». 


*/

public class K138{
	static Scanner scanner = new  Scanner(System.in);
	public static void main(String[] args){
		System.out.println(" enter number x");
		int x = scanner.nextInt();
		int sumDiff = 0;
		int countDiff = 0;

		for(int i = 1; i < x/2; i++){
			if(x%i == 0){
				System.out.println(i + " ");
				sumDiff += i;
				countDiff++;
				System.out.println(" sumDiff " + sumDiff);
				System.out.println(" countDiff " + countDiff);
			}
		}


		if((x % countDiff == 0 ) & (sumDiff % countDiff == 0)){
			System.out.println("x double differens x = " + x + " sumDiff " + sumDiff + " countDiff " + countDiff);
		}
	}
}