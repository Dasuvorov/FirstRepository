import java.util.Scanner;
/**
Напишите класс, который принимает для каждого из 1234 учеников
района дату его рождения (день, месяц, год). Класс должен подсчитать
и вывести на экран число детей, родившихся зимой, весной, летом и
осенью. 
01011982%1000000
*/

public class K1212{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int dateBornStudents;
		int countWinter = 0;
		int countSpring = 0;
		int countAutumn = 0;
		int countSummer = 0;
		for(int i = 0; i < 1234; i++){
		System.out.println("enter Student date born");
		dateBornStudents = scanner.nextInt();
			int month = dateBornStudents%1000000; 	
			month = month/10000;		
			System.out.println(month);
		switch(month){
			case 1 : ;
			case 2 : System.out.println("Winter");
						countWinter++;
						break;
			case 3 : ;
			case 4 : ;
			case 5 : System.out.println("Spring");
						countSpring++;
						break;
			case 6 : ;
			case 7 : ;
			case 8 : System.out.println("Summer");
					countSummer++;
						break;
			case 9 : ;
			case 10 : ;
			case 11 : System.out.println("Autumn");
					countAutumn++;
					break;
			case 12 : System.out.println("Winter");
						countWinter++;
						break;
			}
			
		}
	System.out.println("born winter " + countWinter);
	System.out.println("born Authum " + countAutumn);
	System.out.println("born Spring " + countSpring);
	System.out.println("born Summer " + countSummer);
	
	}
}