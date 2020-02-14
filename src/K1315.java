import java.util.Scanner;
/**
Напишите класс, который принимает с клавиатуры
 двузначное положительное целое число Х, 
 составленное из разных цифр, и возвращает
сумму однозначных чисел, заключенных между
 цифрами этого числа Х
(включая сами цифры, из которых составлено число Х).
Например, и для числа 52, и для числа 25
 будет возвращено значение
14 (2 + 3 + 4 + 5 = 14). 


*/
public class K1315{
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args){
		System.out.println("enter number X");
		int x = scanner.nextInt();
		int x1 = x/10;
		int x2 = x%10;
		int min =0;
		int max = 0;
		int sum = 0;
		if(x1 > x2){
			max = x1;
			min = x2;
		}else if(x1 < x2){
			min = x1;
			max = x2;
		}
		for(int i = min; i<= max; i++){
			if(i < max){
			sum += i; 
			System.out.print(  i + " + ");
			}else {sum += i; 
			System.out.print(i);
			}
			
		}
		System.out.println(" = " + sum);
		System.out.println();
	}
}