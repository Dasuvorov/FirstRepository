import java.util.Scanner;
import java.util.Arrays;
/*
Напишите класс, который принимает с клавиатуры 
три целых числа и
проверяет, являются ли они тремя последовательными 
членами арифметической прогрессии.
В случае если являются, класс должен вывести на 
экран еще 14 следующих членов этой же прогрессии; 
в ином случае - вывести на экран
соответствующее текстовое сообщение. 

*/

public class K1327{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number one");
		int one = scanner.nextInt();
		System.out.println("Enter number two");
		int two = scanner.nextInt();
		System.out.println("Enter number three");
		int three = scanner.nextInt();
			int[] array = new int[17];
		int d1;
		int d2;
		d1 = two - one;
		d2 = three - two;
		int temp = one + (2*d1);
		if(d1 == d2 & three == temp){
			array[0] = one;
			array[1] = two;
			array[2] = three;
			for(int i =3 ; i< 17; i++){
				array[i] = array[0] +(i*d1);
			
			}
			
		System.out.println(Arrays.toString(array));
		}else {
			System.out.println("this is not arifmetic progression2");
		}
	}
	
}