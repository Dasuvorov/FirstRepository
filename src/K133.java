import java.util.Random;
/**
Напишите класс, который генерирует серию из 20 случайных
положительных двузначных чисел и определяет
 сумму четных значений в серии. 
*/

public class K133{
	public static void main(String[] args){
		Random random = new Random();
		int r;
		int evenSum = 0;
		for(int i = 0; i<20; i++){
			r = 10 + random.nextInt(99-10);
			//System.out.print(r + " "); 
			if(r%2 == 0){
				System.out.print(r + " ");
			evenSum += r;
			
					}
		}
			
		System.out.println();
System.out.println(evenSum);		
	}
	
}