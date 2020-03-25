import java.util.Scanner;

/**
Напишите класс, который должен принимать с 
клавиатуры серию возрастающих по значению целых чисел. 
Класс должен выводить на экран количество значений в серии - за
исключением последнего введенного с клавиатуры значения. 

*/

public class K1513{
	static Scanner scanner = new Scanner(System.in);
	static int max;
	static int min;
	static int count = 0;
	static int serial(){
		
		System.out.println("enter number");
		min =scanner.nextInt();
		System.out.println("enter next");
		max =scanner.nextInt();
		while(max > min){
			count++;
			min = max;
		System.out.println("enter next");
		max =scanner.nextInt();
			
		}
		return count;
		
				
	}
	 
		 public static void main(String[] args){
			 serial();
			 
			 System.out.println("serial numbers " + count);
		 }


}