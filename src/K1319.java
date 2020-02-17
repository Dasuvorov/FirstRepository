/**
Назовем «стабильным» положительное двузначное число, которое при
умножении на 2 дает такое двузначное число, в котором сумма цифр x*2 == y (x1 + x2) == (n1 + n2)
равна сумме цифр в двузначном числе до умножения.
Напишите класс, который выводит на экран все «стабильные» числа, а
также их количество и сумму этих чисел. 

*/

public class K1319{
	public static void main(String[] args){
		int x ;
		int sumSum = 0;
		for(x = 10; x < 100; x++){
		int y = x * 2;
		int x1 = x/10;
		int x2 = x%10;
		int y1 = y/10;
		int y2 = y%10;
		int sumX = x1 + x2;
		int sumY = y1 + y2;
				if(y<100){
			if(sumX ==sumY){
				System.out.print(x + " ");
				sumSum +=x;
			}
		}
			
			
		}
	System.out.println();
	System.out.println(sumSum);
	}
	
}