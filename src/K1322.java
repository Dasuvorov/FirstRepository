/**
Трехзначное число называется «числом Армстронга», если куб суммы
цифр числа равен самому числу.
Напишите класс, который выводит на экран все трехзначные «числа
Армстронга».
Класс также должен подсчитывать (и выводить на экран
 с соответствующим текстовым сообщением) количество и сумму этих чисел. 


*/

public class K1322{
	public static void main(String[] args){
		int x;
		int count=0;
		long sumAmstronga =0;
		for(x = 100; x<1000; x++ ){
			int x1 = x/100;
			int x2 = (x%100)/10;
			int x3 = x%10;
			int sum = x1+x2+x3;
			long rezault = (long) Math.pow(sum,3);
			if(x == rezault){
				System.out.println("Ogo number Amstronga " + x);
				count++;
				sumAmstronga +=x;
			}
		}
		
				System.out.println("What a Wonderful World " + sumAmstronga + " count Luis Amstrongov " + count);
	}
	
}