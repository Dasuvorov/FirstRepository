import java.util.*;
/**
По правилам банка, на вклад ежемесячно начисляется определенная
сумма, которая зависит от ежемесячного процента на вклад.
Например, на вкладе в 10000 рублей с месячным процентом 10% через
месяц будет сумма 11000 рублей (1000 плюс 10% от 1000), а еще через
месяц - 12100 (11000 плюс 10% от 11000).
Напишите класс, который принимает с клавиатуры три значения:
• сумму на вкладе;
• месячный процент;
• количество месяцев, в течение которых начисляются проценты на
вклад.
Класс подсчитает и выведет на экран итоговую сумму на вкладе. 

*/

public class K1318{
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args){
		System.out.println(" enter contribution");
		double contribution = scanner.nextLong();
		System.out.println(" enter percent");
		double percent = scanner.nextInt();
		System.out.println(" enter mounts");
		double mounts = scanner.nextInt();

			
		double sum = contribution + contribution/percent;
		double sumPercent;
		double sumPerPer ;
		for(int i = 1; i <= mounts; i++){

			if(i == 1){
				
			System.out.println("mounts + " + i +" "  + sum);
			} else if (i > 1){
					
			 sumPercent = contribution/percent;
			 sumPerPer = sumPercent/percent;
	
		sum += (sumPercent + sumPerPer);
				
			System.out.println("mounts + " + i +" "  + sum);
			
			}
		}
	}
	
}