import java.util.Random;
import java.util.Arrays;
/**
Напишите класс, который вводит с клавиатуры 15 целых 
положительных чисел, для каждого введенного
 числа класс напечатает сумму его
цифр. 
*/

public class K1519{
	static Random random  = new Random(82);
	
	
	public static void main(String[] args){
		int r;
		int count = 1;
		char[] ch;
		String str;
		int[] number;
		int sum  =0;
		while(count < 16){
			sum=0;
			System.out.print("enter number ");
			r = random.nextInt(5000);
			str = ""+ r;
			ch = str.toCharArray();
			number = new int[ch.length];
			for(int i=0; i< number.length; i++){
				number[i] = (int)ch[i] -48;
				sum+= number[i];
			}
			System.out.println("r " + r + " sum = " + sum);
			
			count++;
		}
		
		
	}
	
	
}