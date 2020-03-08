import java.util.Scanner;

/**
Напишите класс, который принимает с клавиатуры серию из 12 целых
чисел и определяет среднее арифметическое максимума и минимума
для этой серии. 

*/

public class K145{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int s;
		int max=0;
		double resultMax=0;
		int countMax = 0;
		int countMin =0;
		int min=0;
		double resultMin = 0;
		for(int i = 1; i<=12; i++){
		
			s = scanner.nextInt();
			if(s>max){
				countMax++;
				max = s;
				resultMax+= max;
				
			}
			if(s<min){
				countMin++;
				min =s;
				resultMin+=min;
					}
			
		}
		System.out.println();
		System.out.println("middle resultMax  " +resultMax/countMax);
		System.out.println("middle resultMin  " +resultMin/countMin);
		
	}
	
}