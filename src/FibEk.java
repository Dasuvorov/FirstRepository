import java.util.Scanner;

public class FibEk{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number Fibbanachi");
		int r = scanner.nextInt();
		int[] fib = new int[r];
		fib[0] = 1;
		fib[1] = 1;
		
		for(int i = 2; i <r; i++){
			fib[i] = fib[i-2] + fib[i-1];
			}
		
		for(int x  : fib){
			System.out.print(x + " ");
		}
		
	}
	
}