import java.util.Random;
/*
Для участия в финале конкурса участники 
двух предварительных этапов должны были 
набрать не менее 80 баллов (на каждом
 предварительном этапе можно было получить максимум 50 баллов).
Напишите класс, который принимает с 
клавиатуры данные 12 участников
конкурса - в виде количества баллов,
 которые получил каждый участник на 
 первом и втором предварительном этапе.
Для каждого участника класс должен определить, 
проходит ли он в финал, или нет - и вывести
 на экран соответствующее сообщение (вместе
с общим количеством баллов, которое набрал участник). 
Заменил задротный сканер на класс рандом!
+ поиграл цветами в консоли))
*/

public class K1329{
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_WHITE = "\u001B[37m";
	public static void main(String[] args){
		Random random = new Random();
	
		int[] id = new int[12];
		for(int i = 0; i< id.length; i++){
			id[i] = i+1;
		}
		
		for(int i = 0; i< id.length; i++){
			int roundOne = random.nextInt(50);
			int roundTwo = random.nextInt(50);
			int roundResult = roundOne + roundTwo;
			if(roundResult >=80){
			System.out.println(ANSI_GREEN + "good student |" + id[i] + "| roundOne |" + roundOne + "| roundTwo |" + roundTwo + "| equal |" + roundResult) ;
			}else System.out.println(ANSI_RED + "bad student  |" + id[i] + "| roundOne |" + roundOne + "| roundTwo |" + roundTwo + "| equal |" + roundResult);
		}
		System.out.println(ANSI_WHITE);
	}
}