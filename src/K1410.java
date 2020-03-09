import java.util.Random;
import java.util.Arrays;
/**
Напишите класс, который генерирует 
25 целых положительных трехзначных 
чисел и выводит на экран порядковый номер числа, сумма
цифр которого была максимальной. 

*/

public class K1410{
	
	public static void main(String[] args){
	Random random = new Random();
			int[] array = new int[25];
			
			int count =1;
			int countMax = count;
			int r = random.nextInt(900) + 100;
			array[0] = r;
			int max = r;
			int sumMax = max;
			for(int i=1; i<25; i++){
				r = random.nextInt(900) + 100;
				array[i] = r;
				count++;
				if(r>max){
					max = r;
					countMax =count;
					sumMax += max;
					System.out.println("countMax " + countMax + " max "  + max );
				}
			}
			
		System.out.println(Arrays.toString(array));
		System.out.println();
		System.out.println("countMax " + countMax + " sumMax "  + sumMax);
		
	}
}