import java.util.*;

/**
Напишите класс, который генерирует 15 целых 
положительных трехзначных чисел и выводит 
на экран число, сумма цифр которого была
минимальной. 

*/
public class K148{
	public static void main(String[] args){
		int min;
		int sumMin;
		int[] array = new int[15];
	 Random random = new Random();
	 int r = random.nextInt(900)+100;
	 array[0] = r;
	 min = r;
	 sumMin = min;
	 System.out.println(r);
	for(int i = 1; i<15; i++){
		r = random.nextInt(900)+100;
		array[i] = r;
		if(r<min){
			min = r;
			sumMin+=min;
			System.out.println(r);
		}
		}
		
		System.out.println(Arrays.toString(array));
		System.out.println("sumMin " + sumMin);
		
	}
}