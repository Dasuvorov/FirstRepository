import java.util.Scanner;

/**

Напишите класс, который принимает с клавиатуры значения, пока их
сумма остается меньше 150. По окончании ввода следует вывести на
экран информацию о количестве введенных значений и их сумме. 
*/

public class K158{
		static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args){
	System.out.println("enter number");
	 int sc = scanner.nextInt();
	 int sum = sc;
	 int count = 1;
	 while(sum<150){
		 System.out.println("enter number");
		 sc = scanner.nextInt();
		 count++;
		 sum += sc;
	 }
			
		System.out.println("count " + count + " sum " +sum);			
		
	}
	
}