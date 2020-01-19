import java.util.Scanner;

/**
Напишите класс, который принимает с клавиатуры целое положительное
число N и выводит на экран серию 1+2+3+ ... +N, то есть серию 
целых положительных последовательных чисел,
начиная с 1 и до введенного с клавиатуры значения (числа при 
выводе на экран должны разделяться знаком + ). 

*/

public class K1151{
	static Scanner scanner = new Scanner(System.in);
	public static void main(String...args){
		System.out.println("enter number N");
		int n = scanner.nextInt();
		for(int i = 1; i<=n; i++){
			if(i< n){
			System.out.print( i + "+");
			}else {
				System.out.print(i);
			}
		}
			
	}
}