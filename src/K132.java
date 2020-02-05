import java.util.Random;
/**
Напишите класс, который генерирует серию из 
20 случайных положительных двузначных
 чисел и определяет сумму значений в серии. 
 int k = min + r.nextInt(max - min);
*/


	public class K132{
		public static void main(String[] args){
		Random random = new Random();
			int sum = 0;
		int r;
		for (int i = 0; i<20; i++){
		r = 10 + random.nextInt(99-10);
		System.out.print(r + " ");
		sum += r;		
		
	}
	System.out.println();
	System.out.println(sum);
 }
}
