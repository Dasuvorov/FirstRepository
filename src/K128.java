/**
Напишите класс, который выводит на экран все целые положительные
двузначные числа, в которых разница между первой (число десятков) и
последней (число единиц) цифрами не превышает 3.
Класс должен также подсчитать количество этих чисел и вывести
 результат на экран вместе с соответствующим текстовым сообщением. 

*/

public class K128{
	public static void main(String[] args){
		int i=0;

		boolean  differenceI1I2;
		int count= 0;
		int big;
		int small;
		
		for(i = 10; i<100; i++){
			int i1 = i/10;
			int i2 = i%10;
			if(i1 > i2){
			big =i1;
			small = i2;
		}else {
			big = i2;
			small = i1;
		}
			if((big - small) <=3){
				count++;
			}
		 
		}
	System.out.println(count);
	}
}
	