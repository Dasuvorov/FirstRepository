import java.util.Scanner;
/**
Два положительных целых числа называются
 «родственными», если у
них есть одинаковое количество делителей.
Напишите класс, который принимает с клавиатуры 
два целых положительных числа и проверяет,
 являются ли они «родственными». 

*/

public class K1217{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number1");
		int number1 = scanner.nextInt();
		System.out.println("enter number2");
		int number2 = scanner.nextInt();
		int countNumber1=0;
		int countNumber2 =0;
			int diff;
		int big;
			if(number1 >= number2){
				big =number1;
			}else {
				big = number2;
			}
			for(int i  = 1; i< big/2 ;i++){
				if(number1 % i == 0){
					countNumber1++;
				}


			if(number2 % i == 0){
			countNumber2++;
				}
			}
		diff = countNumber1 - countNumber2;
		if(diff ==0){
	System.out.println("number1 and number2 family");
		}
		}
}
