import java.util.*;
/**
Напишите класс, который принимает с клавиатуры 
целое число и проверяет, на какое количество 
двузначных чисел оно делится.
Результат проверки класс должен вывести на 
экран вместе с соответствующим текстовым сообщением. 
не решил(
 */

public class K126{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	int doubleDigit = 0;
	int count =0;
	int rezault;
	int number = scanner.nextInt();
		 
			for(doubleDigit = 10; doubleDigit < 100; doubleDigit++){
					rezault = number/doubleDigit;
				if (rezault != 0) {
					count++;
					Random random = new Random();
					random.nextInt(1);

		}

			}
			
		
		
			System.out.println("number " + number  + " doubleDigit " + doubleDigit + " = " + count);
	}
	
	
	
}
