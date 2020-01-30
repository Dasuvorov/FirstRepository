/**
Напишите класс, который генерирует 15
 целых чисел в интервале от
-25 до 25, печатает их, а затем выводит
 на экран информацию о том,
сколько из них были: 
• положительными;
• четными;
• однозначными. 
(Math.random() * ((max - min) + 1)) + min
*/

public class K125{
	
	public static void main(String[] args){
		int positivCount= 0;
		int  evenCount = 0;
		int oneDigitCount = 0;
		int random;
		int max = 25;
		int min = -25;
	for(int i = 0; i<15; i++){
		random = (int)((Math.random() * (max - min)+1) + min);
		System.out.print(random + " ");
		if (random == 0){
			i--;
			continue;
		}
		if(random > 0){
			positivCount++;
		}
		if(random %2 == 0){
			evenCount++;
		}
		if(random > -10 & random < 10){
			oneDigitCount++;
		
		}
	}
	System.out.println("positivCount " + positivCount + " evenCount " + evenCount + " oneDigitCount " + oneDigitCount);
	}
}