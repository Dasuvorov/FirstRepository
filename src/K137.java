import java.util.Scanner;
/**
Назовем «дважды четным» целое положительное число,
\ если и оно само, и сумма его делителей - четные числа.
Напишите класс, который принимает с клавиатуры
 целое положительное число и проверяет,
 является ли оно «дважды четным». 

*/

public class K137{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number x");
		int x = scanner.nextInt();
		
		int rezaultDifferent = 0;
			for(int i = 1; i<x ; i++){
				if(x%i ==0 ){
					System.out.println(i);
				rezaultDifferent += i;
				}
			}
		
		if(x%2 ==0 & rezaultDifferent %2 == 0){
			System.out.println("x " + x +  " rezaultDifferent "  + rezaultDifferent + " double even");
		}	else	{System.out.println("x " + x +  " rezaultDifferent "  + rezaultDifferent + " not double even");
			}
	}
	
}