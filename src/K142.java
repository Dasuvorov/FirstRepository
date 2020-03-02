import java.util.Random;

/*
В соревнованиях по бегу принимали участие 150 учеников школы.
Напишите класс, который принимает с клавиатуры время, показанное
в соревнованиях каждым из учеников, и выводит на экран наилучший
результат, а также порядковый номер победителя 
(можно предположить, что есть только один победитель). 
меняем сканер на рандом ибо задротная тема вводить 150 перцев которые куда-то бегут
*/

public class K142{
	
	public static void main(String[] args){
		
		Random random = new Random();
			int time = 70 + random.nextInt(120);
			
		int min = time;	
		int runner =1;
		int runnerMax = 0;
			for(int i = 0; i<= 149; i++){
				runner++;
				time = 70+ random.nextInt(120);
				if(min > time){
				min = time;
				runnerMax = runner;	
				System.out.println("peper N " + runnerMax + " time " + time);		
				}
			}
			System.out.println();
		System.out.println(runnerMax + " peper  run the fustest for " + min + " minutes ");
	}
}