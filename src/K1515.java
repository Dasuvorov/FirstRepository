import java.util.Scanner;

/**
Напишите класс, который принимает с клавиатуры целое 
число и выводит на экран количество четных цифр 
в нем и их сумму. 

*/
	public class K1515{
public static void main(String[] args){
		 Scanner scanner = new Scanner(System.in);
		System.out.println("enter number");
		int numberInt = scanner.nextInt();
		String temp = "" + numberInt;
		char[] ch = temp.toCharArray();
		int[] intTemp = new int[ch.length];
		int sum = 0; //summa even subnumber
		int count =0; //count event number
		for(int i = 0; i< ch.length; i++){
			
			intTemp[i]  = (int)ch[i] - 48;

			if(intTemp[i]%2==0){
			System.out.print(intTemp[i] + " ");
				count++;
				sum+=intTemp[i];
			}
}
			
		System.out.println();
	System.out.println("count " + count + " sum subNumber " + sum);
	
	
}

	}