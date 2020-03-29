import java.util.Scanner;
/**
Напишите класс, который вводит с клавиатуры целые положительные
числа до тех пор, пока не будет введено число, сумма цифр которого
равна 5. 
*/

public class K1520{

static Scanner scanner = new  Scanner(System.in);
public static void main(String[] args){
	
	int sum = 0;
	while(sum !=5 ){
		sum =0;
		System.out.println("enter number");
		String s = scanner.nextLine();
		char[] ch = s.toCharArray();
		int[] number = new int[ch.length];	
		for(int i = 0; i<ch.length; i++){
			number[i] = (int)ch[i] - 48;
			System.out.print(number[i] + " ");
			sum +=number[i];
		}
			
		
	}
	System.out.println("sum = " + sum);
}

}