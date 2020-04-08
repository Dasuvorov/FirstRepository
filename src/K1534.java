import java.util.Scanner;

/**
Напишите класс, который принимает с клавиатуры целое 
положительное число х. Класс должен определить наибольшее значение в серии
12+22+32+ .. " сумма которой не превышает X.
*/

public class K1534{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number X");
		int x = scanner.nextInt();
		int sum = 0;
		int i = 0;
		int temp = 0;
		int sumTemp =0;
		while (sum<x){
			i++;
			sumTemp = i*i;
			
			sum+= sumTemp;
			if(sum < x){
				temp = sum;
			System.out.println(i + " " + " sumTemp " + sumTemp + " sum " + sum);
			}
	}
		System.out.println();
		System.out.print("x =  " + x + " exit " + temp);
	}
	
}