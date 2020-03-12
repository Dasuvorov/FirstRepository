import java.util.Scanner;
/**
Напишите класс, который принимает с клавиатуры 
числа, пока не будет введено значение О.
 Для каждого введенного с клавиатуры 
 положительного числа класс должен выводить
 на экран текст Плюс, для
каждого отрицательного - текст Минус. 
*/

public class K154{
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args){
			System.out.println(" enter number ");
		int r = scanner.nextInt();
		
		while(r!=0){
			if(r>0){
				System.out.println("+");
			}else {
				System.out.println("-");
			}
			System.out.println(" enter number ");
			r = scanner.nextInt();
		}
			System.out.println("zero happened");
	}
}