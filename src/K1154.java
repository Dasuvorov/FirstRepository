import java.util.Scanner;

/**
Напишите класс, который принимает с клавиатуры 
два целых положительных числа: N и М (неизвестно,
 какое из введенных чисел больше).
Класс должен вывести на экран все целые числа
 между наименьшим и
наибольшим значениями, введенными с клавиатуры. 
*/


public class K1154{
	static Scanner scanner = new Scanner(System.in);
	public static void main (String[] args){
		System.out.print("enter number N \n");
		int n = scanner.nextInt();
		System.out.println("enter number M");
		int m = scanner.nextInt();
		
		if(n >= m){
			for (int i = m; i<=n ; i++){
				if(i != n) {
				System.out.print(i + " + ");
				}else {
					System.out.print(i);
				}
				
				}
			}else {
				for (int i = n; i<=m ; i++){
				if(i != m) {
				System.out.print(i + " + ");
				}else {
					System.out.print(i);
				}
				
				}
			} 
			
		}
		
		
	}
	
	
