import java.util.Scanner;
/**
Напишите класс, который принимает с клавиатуры 
целое число х, а
затем - серию из 29 дополнительных целых чисел 
(вводимых с клавиатуры).
Класс должен определить, сколько чисел в серии
были равны значению
переменной х, а сколько - были меньше значения
 переменной х. 

*/
public class K127{
	static Scanner scanner = new Scanner(System.in);
	public static void main(String... args){
		int numberX;
		System.out.println("enter number x");
		numberX = scanner.nextInt();
		int countXMoreY = 0;
		int countXEqualY =0;
		System.out.println("enter number y");
		for(int i = 0; i < 29; i++){
		int numberY = scanner.nextInt();
		if(numberX == numberY){
			countXEqualY++;
		}else if(numberX > numberY){
			countXMoreY++;
		}
		
		}
		
		System.out.println("count x equals y " + countXEqualY );
		System.out.println("count x more y " + countXMoreY);
	}
	
	
}
