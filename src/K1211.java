import java.util.*;
/**
Для того чтобы определить, сколько учеников готовы поехать на экскурсию, в школе провели опрос.
 Каждый из 200 учеников отметил в опроснике: 
 «1»- если он готов поехать на экскурсию, «О» - если не готов.
Напишите класс, который принимает с клавиатуры 
ответы учеников и
определяет количество учеников, готовых поехать 
на экскурсию. Кроме того, класс должен определить,
 поедет ли на экскурсию большинство участвовавших 
 в опросе учеников или нет. 
 Метод изменен чтобы не дрочить 200 раз 0 или 1 испольщуем
 клас рандом. который будет принимать от 0 до 1
*/

public class K1211{

	public static void main(String[] args){
		Random random = new Random();
		int countVoting =0;
		int students;
		int rezault;
		for(int i = 0; i<200; i++){
			
			students = random.nextInt(2);
			System.out.print(students + " ");
			if(students == 1){
				countVoting++;
				
			}
		
		}
		rezault = 200 - countVoting;
		System.out.println();
		if(rezault > 100){System.out.println("more not going");
			}else {System.out.println("more going");
			}
		System.out.println("goin to excursion " + countVoting);
		System.out.println("not going to excursion " + rezault);
	}
	
	
}
