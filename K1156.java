import java.util.Scanner;

/**
Напишите класс, который принимает с 
клавиатуры два целых положительных
 числа: N и М (неизвестно, какое
 из введенных чисел больше).
Класс должен вывести на экран все
 целые числа, начиная с N и заканчивая М. 


*/

public class K1156{
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args){
		int small;
		int big;
		System.out.println("enter number N");
		int n = scanner.nextInt();
		System.out.println("enter number M");
		int m = scanner.nextInt();
		
		if(n > m){
		big = n;
		small = m;
		
	}else {
		small = n;
		big = m;
	}
	
	for(int i = small; i<= big; i++){
		System.out.print(i + " ");
		
		
	}
	
	
	}
}