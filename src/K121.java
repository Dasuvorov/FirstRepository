import java.util.*;


/**
Напишите класс, который принимает с клавиатуры 10 целых чисел
 и выводит на экран информацию о том, сколько из них бьmи положительными. 

*/

public class K121{
	public static void main(String[] args){
		Scanner scanner = new  Scanner(System.in);
		int number;
		int count=0;
		System.out.println("enter ten number");
		for(int i =0; i<10; i++){
		number = scanner.nextInt();
				if(number > 0){
					count++;
				}
			
			}
	System.out.println("positiv number " + count);
	}
}