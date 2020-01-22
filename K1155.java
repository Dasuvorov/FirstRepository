import java.util.Scanner;

/**
Напишите класс, который принимает с клавиатуры два 
целых положительных числа: N и М (неизвестно, какое 
из введенных чисел больше).
Класс должен вывести на экран все четные числа между
 наименьшим и
наибольшим значениями, введенными с клавиатуры. 

*/

public class K1155{
	static Scanner scanner = new Scanner(System.in);
	 
	 
	
	
	public static void main(String[] args){
		System.out.println("enter number N");
		int n = scanner.nextInt();
		System.out.println("enter number M");
		int m = scanner.nextInt();
		
		if(n>m){
			for (int i = m; i<=n; i++){
								if(i%2 ==0 ){
					System.out.print(i+ " ");
				}else{
					i++; 
					System.out.print(i +" ");
			
			
			}
				
					}
				
			}else if(n<m){
						for (int i = n; i<=m; i++){
								if(i%2 ==0 ){
					System.out.print(i+ " ");
				}else{
					i++; 
					System.out.print(i +" ");
			
			
			}
				
					}
			}
		
	}
	
}
	
