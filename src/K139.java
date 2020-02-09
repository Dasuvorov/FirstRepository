import java.util.Scanner;
/**
Два положительных целых числа называются «четно-близкими по
сумме», если сумма их общих делителей является четным числом.
Напишите класс, который принимает с клавиатуры два 
целых положительных числа и проверяет, являются ли 
они «четно-близкими по
сумме». 
*/

public class K139{
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args){
		int sumOne = 0 ;
		int sumTwo = 0;
		System.out.println("enter numberOne");
		int numberOne = scanner.nextInt();
		System.out.println("enter numberTwo");
		int numberTwo = scanner.nextInt();
		K139 n1 = new K139();
		 sumOne = n1.spendsSum(numberOne);
	
		sumTwo = n1.spendsSum(numberTwo);	
		if((sumOne + sumTwo) % 2 == 0){
			System.out.println("nearlu even");
		}
				
	}

		public int spendsSum(int number){
			int sum = 0;;
			for(int i = 1; i < number/2; i++){
				if(number%i == 0){
					sum += i;
					System.out.print(i + " ");
				}
				
			}
			System.out.println(" = " + sum);
			return sum;
		}
}