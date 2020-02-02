import java.util.Random;
/**
Серия случайных чисел называется «уравновешенной», 
если количество положительных и отрицательных 
чисел в серии - одинаково.
Напишите класс, который генерирует серию из 30
случайных целых
чисел из диапазона от -20 до 20 и проверяет,
 является ли серия «уравновешенной)>. 
юзаем для ненерации int k = min + r.nextInt(max - min);

*/

public class K1214{
	public static void main(String[] args){
		int min =-20;
		int max =20;
		Random random = new Random();
		int r; 
			int countPositiv =0;
			int countNegative = 0;
			
		
		for(int i = 0; i<30; i++){
			r = min + random.nextInt(max - min);
			if(r > 0){
				countPositiv++;
			}else if(r<0){
				countNegative++;
			}else {
				i--;
			}
		}
		System.out.println("Positive " + countPositiv + " negative " + countNegative);

		if(countPositiv == countNegative) {System.out.println("balanced");
		
		}
	}
	
}