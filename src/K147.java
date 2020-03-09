import java.util.Arrays;
import java.util.Random;
/**
Напишите класс, который генерирует 20 целых положительных
 двузначных чисел и выводит на экран число, сумма
 цифр которого была максимальной. 
 В данные был введен массив для удобства просмотра генерируемых чисел
*/

public class K147{
	public static void main(String[] args){
		Random random = new Random();
		 int r;
		 r = 10 + random.nextInt(90);
		 int[] max = new int[20];
		 max[0] = r;
		 int maximus = r;
		 int sumMax = max[0];
		 for(int i = 1; i<20; i++){
			 r = 10 + random.nextInt(90);
			 max[i] = r;
			if(r>maximus){
				maximus =r;
				sumMax+=maximus;
			}		
		 }
		 System.out.println(Arrays.toString(max));
		System.out.println("sumMax " + sumMax);
		
	}
}