import java.util.Scanner;

/**
Напишите класс, который принимает с клавиатуры 
целое положительное число и определяет, 
является ли оно простым.
Класс должен вывести на экран соответствующее
 текстовое сообщение. 
calling Kuzia - Пускай сегодня не повезло, но игра продолжается
позвонитЕ Кузе)))
*/

public class K1216{
	static Scanner scanner = new  Scanner(System.in);
	public static void main(String[] args){
		System.out.println("enter number");
		boolean flag = false;
		int number = scanner.nextInt();
		for(int i =2; i< number; i++){
			if(number % i != 0){
				flag =true;
			}else {
				flag = false;
				break;
			}
		}
		if(flag){
			System.out.println("Simple number");
		}else{
			System.out.println("ordinary number");
		}
	}
}