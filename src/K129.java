
/**
Определим как «красивое» целое положительное 
трехзначное число Х,
для которого выполняется следующее условие: сумма квадратов
 первой и последней цифр равна квадрату средней цифры.
Напишите класс, который выводит на экран все «красивые» числа и их
количество.
*/

public class K129{
	public static void main(String[] args){
		int i;
		int count=0;
		for(i = 100; i<1000; i++){
			int i1 = i/100;
			int i2 = (i%100)/10;
			int i3 = i%10;
			int sum = ((int)Math.pow(i1,2)) +((int)Math.pow(i3,2));
			int avergeI2 = (int)Math.pow(i2,2);
			if(sum == avergeI2){
				System.out.println(i);
				count++;
			}
			
		}
		System.out.println(count);
	}
	
}