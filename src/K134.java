import java.util.Scanner;
/**
Напишите класс, который принимает с клавиатуры положительное
целое число и выводит на экран все его делители.
Кроме того, класс должен определять количество и сумму делителей и
выводить результаты на экран. 

*/

public class K134{
	static Scanner scan = new  Scanner(System.in);
	public static void main(String[] args){
		System.out.println(" enter number devidend");
		int devidend = scan.nextInt();
		int countDevider = 0;
		int rezauls = 0;
		for(int i = devidend; i >=1; i--){
			if(devidend%i == 0){
				countDevider++;
				rezauls += i;
				System.out.print(i+ " ");
			}
		}
		
		System.out.println();
	System.out.println("countDevider " + countDevider + " rezauls " + rezauls);
	}
}