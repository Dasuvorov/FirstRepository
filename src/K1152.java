import java.util.*;

/**
Напишите класс, который принимает с клавиатуры
 целое положительное число N и выводит на экран
 серию N+(N-l)+(N-2)+ ... + 1, то есть серию целых
 положительных последовательных чисел, начиная с
 введенного с клавиатуры значения и до 1 (числа при выводе на экран
должны разделяться знаком+).
*/

public class K1152{
	public static void main(String[] args){
		int n; 
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number N");
		n = scanner.nextInt();
		for(int i = n; i>= 1; i--){
			if(i > 1){
			System.out.print(i + "+");
			}else {
				System.out.print(i);
			}
		}
		
	}
}