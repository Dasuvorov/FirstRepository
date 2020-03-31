import java.util.Arrays;
import java.util.Scanner;
/**
Напишите класс, который принимает с клавиатуры целое 
положительное число.
Класс должен заменить его на сумму его же цифр и продолжать
 эту замену до тех пор, пока не получится однозначное 
 число. Все получающиеся значения следует вывести на экран. 

*/

public class K1521{
	static Scanner scanner = new Scanner(System.in);
public static void main(String[] args){
	int sum =10;
	while(sum>=10){
	System.out.println("enter plus integer number");
	String number = scanner.nextLine();
	char[] chNumber = number.toCharArray(); 
	int[] num = new int[chNumber.length];
		
	sum =0;
		for(int i = 0; i<num.length; i++){
			num[i] = (int)chNumber[i] -48;
			sum += num[i]; 
		}
		if(sum<=0){
			sum=10;
		}
	System.out.print(Arrays.toString(num)); 
	System.out.println( " = " + sum);

	}
		
}

}