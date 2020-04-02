import java.util.Scanner;

/**
	Напишите класс, который принимает с клавиатуры целое число и выводит на экран:
• в первой строке - все четные (по значению) цифры этого числа,
через пробел;
• во второй строке - все нечетные (по значению) цифры этого числа, через пробел.
Например, для числа 765873 в первой строке будет выведена серия 6 8,
а во второй строке - 7 5 7 3. 

*/

public class K1523{
	public static void main(String[] args){
		Scanner scanner = new  Scanner(System.in);
		String number;
		System.out.println("Enter number");
		number = scanner.nextLine();
		char[] ch = number.toCharArray();
	
		int[] intNumber = new int[ch.length];
		
			int i = 0;
			while(i < ch.length){
			intNumber[i] = (int)ch[i] - 48; 		
			i++;
		}
		for(int k = 0; k< intNumber.length; k++){
		if(intNumber[k]%2 ==0){
		System.out.print(intNumber[k] + " ");
		}
		
		}
		System.out.println();
		for(int k = 0; k< intNumber.length; k++){
		if(intNumber[k]%2 !=0){
	     	System.out.print(intNumber[k] + " ");
		}
		
		}
	}
	
}