
/**
Напишите класс, который выводит на экран 
все двузначные числа,
равные утроенному произведению его цифр.
Класс также должен подсчитывать (и выводить
 на экран с соответствующим текстовым сообщением)
 количество и сумму этих чисел. 

*/

public class K1321{
	public static void main(String[] args){
		int x;
		int sum = 0;
		for(x =10; x<100; x++){
		int x1 = x/10;
		int	x2 = x%10;
		int mult = (x1*x2)*3;	
			sum+= mult;
		System.out.print(mult + " ");
		}
		System.out.println();
		System.out.println("rezault " + sum);
	}
	
}