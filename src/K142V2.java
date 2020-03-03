import java.util.Random;


/*
В соревнованиях по бегу принимали участие 150 учеников школы.
Напишите класс, который принимает с клавиатуры время, показанное
в соревнованиях каждым из учеников, и выводит на экран наилучший
результат, а также порядковый номер победителя 
(можно предположить, что есть только один победитель). 
меняем сканер на рандом ибо задротная тема вводить 150 перцев которые куда-то бегут
*/  
public class K142V2{
	
	public static void main(String[] args){
		
		Random random = new Random();
			
			int runnerMax =0;
			int timeMin = 70 + random.nextInt(51);
			int runner[] = new int[150];
				
				
			for(int i=0; i<150; i++){
				runner[i] = 70 + random.nextInt(51);
				System.out.print("[" + i + " " + runner[i]+"] ");
				if(timeMin >= runner[i]){
					timeMin = runner[i];
					runnerMax = i;
				}
				
			}
				
			System.out.println();
		System.out.println("runnerMax " + runnerMax + " timebest " + timeMin);
	
			}	
		}
			
				
			
