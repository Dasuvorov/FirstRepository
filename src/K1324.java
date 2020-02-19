import java.util.Random;
/**
Напишите класс, который создает серию из 20 случайных чисел из
диапазона 30 ... 49. Числа в серии следует вывести 
на экран в одну строку следующим образом:
• перед значениями, которые меньше первого в серии, вывести знак
«минус»;
• перед значениями, которые больше первого в серии, вывести знак
«ПЛЮС».

*/

public class K1324{
	public static void main(String[] args){
		Random random = new Random();
		int r =0;
		int max =0;
		int min = 0;
		r = 30 + random.nextInt(20);
			max = r;
			System.out.print(max + " ");
		for(int i= 1; i<20; i++){
			r = 30 + random.nextInt(20);
			if(r<max){
				System.out.print(" - " + r  );
			}else{
				System.out.print(" +" + r );
			}
			
		}
		
		
	}
}