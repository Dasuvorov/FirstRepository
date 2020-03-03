import java.util.Random;
/*
Напишите класс, который генерирует серию из 
50 случайных целых
чисел из диапазона от -40 до +40, и определяет 
наибольшее и наименьшее значение в сгенерированной серии.

*/


public class K143{
	static Random random = new Random();
	
	
	
	public static void main(String[] args){
		
		int max =0;
		int min = 0;
		int r;
		for(int i = 1; i<=50; i++){
			r = random.nextInt(81) - 40;
			if(min>r){
				min = r;
			}
			if(max <r){
				max = r;
			}
		System.out.print("[" +r + "]");
		}
		System.out.println();
		System.out.println("max " + max + " min " + min);
	}
	
}