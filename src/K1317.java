import java.util.*;
/**
Последовательность Фибоначчи - последовательность целых чисел,
построенная по следующему правилу: каждый член последовательности,
 начиная с 3-го, равен сумме двух предыдущих. 
Напишите класс, который получает с клавиатуры два первых члена
 последовательности и целое положительное число N.
 Класс подсчитает и выведет на экран сумму первых N 
 членов последовательности Фибоначчи. 

*/

public class K1317{
	public static void main(String[] args){
		Scanner scanner = new  Scanner(System.in);
		System.out.println("enter number one");
		long one = scanner.nextLong();
		System.out.println("enter number two");
		long two = scanner.nextLong();
		System.out.println("enter sequence");
		int  sequence = scanner.nextInt();
		
		long[] arrayfib = new long[sequence];
		arrayfib[0] = one;
		arrayfib[1] = two;
			for(int i = 2; i<sequence; i++){
		arrayfib[i] = arrayfib[i-2] + arrayfib[i-1]; 
			}
	System.out.println(Arrays.toString(arrayfib));	
	}
	
}
