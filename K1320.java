import java.util.*;
/**
Напишите класс, который выводит на 
экран все двузначные числа, у
которых куб суммы его цифр равен  (x1 +x2).3 == x.2
 квадрату самого числа.				sout(x) & count(x)	
Класс также должен подсчитывать
 (и выводить на экран с
 соответствующим текстовым сообщением)
 количество и сумму этих чисел.

*/

public class K1320{
	public static void main(String[] args){
		int x; 
		int sumX1X2;
		int power;
		
		int count = 0;
		int sumSum =0;
			for(x =10; x < 100; x++){
			int x1 = x/10;
			int x2 = x%10;
				sumX1X2 =(int)Math.pow((x1 + x2), 3);
				power = (int) Math.pow(x,2);
			if(sumX1X2 == power){
				count++;
				sumSum +=x;
				System.out.print(x  + " ");	
			}
			}	
		System.out.println();
		System.out.print(count  + " this number ");
	}
}


