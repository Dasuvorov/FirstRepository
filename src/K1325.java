import java.util.Random;
/**
Напишите класс, который создает серию из 25 случайных чисел из
диапазона 10 ... 99.
Класс будет выводить на экран только те числа серии, которые делятся
без остатка на первое число в серии. 

*/

public class K1325{
	public static void main(String[] args){
		Random random = new Random();
		int r =  random.nextInt(89) + 10;
		int numberOne = r;
			System.out.println(numberOne);
		for(int i = 0; i<25; i++){
			r = random.nextInt(89) + 10;
			if(r%numberOne ==0 ) {
				System.out.println(r + " / " + numberOne + " = " + (r/numberOne));
			}
		}


	}
}