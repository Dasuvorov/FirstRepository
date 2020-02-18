/**
Напишите класс, который выводит на экран все двузначные
 числа, у
которых удвоенная сумма цифр равна их произведению.   (x1+x2)*2 = x1*x2
Класс также должен подсчитывать (и выводить на экран с 
соответствующим текстовым сообщением) количество и 
сумму этих чисел. 

*/

public class K1323{
	public static void main(String[] args){
		int x;
		int count = 0;
		int sumX =0;
		for(x = 10; x < 100; x++){
			int x1 = x/10;
			int x2 = x%10;
			if(((x1 + x2)*2) == (x1 *x2)){
				count++;
				sumX += x;
				System.out.print(x + " ");		
			}
			
		}
			System.out.println();
			System.out.println("sumX " + sumX + " count " + count);
	}
}