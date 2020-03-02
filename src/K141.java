import java.util.Random;
/*
В соревнованиях по бегу принимали участие 150 учеников школы.
Напишите класс, который принимает с клавиатуры время, показанное
в соревнованиях каждым из учеников, и выводит на экран наилучший
результат. 
*/

public class K141{
	public static void main(String[] args){
		Random random = new Random();
		int timeMan = 60 + random.nextInt(60);
		int min = timeMan;
		int people = 150;
		for(int i = 1; i <=(people-1); i++){
			timeMan = 60 + random.nextInt(61);

			if( timeMan > min){
				min = timeMan;

			}
		System.out.print(timeMan + " ");
		}
			System.out.println();
		System.out.println(min);
	}

}