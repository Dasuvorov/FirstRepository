import java.util.Scanner;
/**
Напишите класс, который принимает с клавиатуры число
 для переменной Х, а затем дополнительную серию чисел,
 каждое из которых
используется для уменьшения значения переменной Х.
 Ввод чисел
должен производиться до тех пор, пока значение 
переменной Х остается положительным. 

*/

public class K1510{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter numner x");
		int x = scanner.nextInt();
		int count =0;
		while(x>0){
			System.out.println("enter numner y");
		 int y = scanner.nextInt();
			count++;
		  x-=y;	
			
		}
		if(x == 0){
		System.out.println("x equals zero " + count);
		}else {
			System.out.println("x less than zero " + count);
		}
	}
	
}
