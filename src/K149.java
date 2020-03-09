import java.util.Random;

/**
Напишите класс, который генерирует 24 целых трехзначных
 положительных числа и выводит на экран
 порядковый номер самого большого из сгенерированных чисел. 

*/


public class K149{
	public static void main(String[] args){
		Random random = new Random();
		int count = 1;
		int countMax =count;
		int r = random.nextInt(900) + 100;
		int max = r;
		System.out.print(r + " ");
		for(int i = 1; i< 24; i++){
			count++;		
		r = random.nextInt(900) + 100;
			System.out.print(r + " ");
		
		if(r>max){
				countMax=count;
				max =r;
			}
		}
		System.out.println();
		System.out.println("Maximal serial number " + countMax + " max " + max);
		
	}
}