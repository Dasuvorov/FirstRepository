import java.util.Scanner;

/**
Напишите класс, который принимает с клавиатуры 
целое число и подсчитывает количество нулей в этом числе.
Результат подсчета надо вывести на экран. 

*/
	public class K1530{
		public static void main(String[] args){
			Scanner scann = new Scanner(System.in);
			System.out.println("enter number");
			int number = scann.nextInt();
			int count =0;
			int temp;
			while(number>0){
				temp = number%10;
				if(temp ==0){
					count++;
				}
			number/=10;	
			}
		System.out.println("number of zero " + count);
		}
		
	}