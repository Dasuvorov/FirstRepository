import java.util.*;
/**
Математическая последовательность задана формулой
ее любого члена:
an = (2n-1)0·5
Напишите класс, который принимает с клавиатуры 
число членов последовательности (n) и вычисляет сумму этой последовательности. 



*/

public class K1316{
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number n");
		int n = scanner.nextInt();
		double sum = 0;
		double a = 0;
			for(int i = 1; i<=n; i++){
			a = Math.sqrt(2 *i -1);
			sum +=a; 			
		System.out.print(a + " + ");		
			}
	System.out.println();
			System.out.print(sum);
	}
}