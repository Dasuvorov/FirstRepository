import java.util.Scanner;
/**
Контрольная работа считается «провальной», если более половины
учеников получили неудовлетворительные оценки.
Напишите класс, который принимает с клавиатуры число учеников в
группе, а затем - оценку каждого ученика.
Класс должен определить, была ли контрольная «провальной». 

*/

public class K1210{
	static Scanner scanner = new  Scanner(System.in);
	public static void main(String[] args){
		int count =0;
		System.out.println("enter quantity students");
		int quantity = scanner.nextInt();
		for(int i = 1; i <=	 quantity; i++){
			System.out.println("enter assesment student " + i);
			int assesment = scanner.nextInt();
			if(assesment > 2){
				count++;
			}
			
			
		}
		if(count > quantity/2){
	
		System.out.println("test is performed");	
	}else{
			System.out.println("test failed");
			
		}
		
	}
}