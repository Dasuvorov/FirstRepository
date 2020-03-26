import java.util.Scanner;


/**
Напишите класс, который принимает с клавиатуры целое число
 и выводит на экран количество четных цифр в нем 
 и сумму его нечетных цифр. 
*/

public class K1516{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter integer number");
		int number = scanner.nextInt();
		String str = "" + number;
		char[] ch = str.toCharArray();
	   int[] arrayNumber = new int[ch.length];
	   int count = 0;
		int sum = 0;
		int i =0;
		while (i< ch.length){
		   arrayNumber[i] = (int)ch[i] - 48;
		   if(arrayNumber[i]%2 ==0){
			   count++;
		   }else{
			   sum+=arrayNumber[i];
				
		   }
		   i++;
	   }
	   System.out.println("even count = " + count + ", sum odd subNumber " + sum);
	}
}