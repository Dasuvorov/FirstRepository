import java.util.Scanner;

/**
Напишите класс, который принимает с клавиатуры 
целое положительное число и строит из него число с обратным порядком цифр.
Новое значение следует вывести на экран.

*/

public class K1535{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number");
		int number = scanner.nextInt();
		int resault;
		int i =1;
		int temp =0;
		String str = "";
		while(number>0){
			temp = number%10;
			number/=10;
			str+=temp;
			
		}
		System.out.println(str);
		resault = Integer.parseInt(str);
		System.out.println(resault + 1 );
	}
}