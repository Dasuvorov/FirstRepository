import java.util.Scanner;
/**
Напишите класс, который принимает с клавиатуры 
целое положительное число Х и выводит на экран все е
го делители (1 и само число Х
не считать делителями).
Класс должен также подсчитать количество этих
делителей и вывести
результат на экран вместе с соответствующим 
по смыслу текстовым
сообщением. 

*/

public class K1215{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number X");
		int count = 0;
		int rezault;
		int x = scanner.nextInt();
		for(int i = 2; i< x; i++){
			if(x%i == 0){
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println("x  divide = " + count);
	}
	
}