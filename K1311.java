import java.util.Random;		
		/**
		Для проверки уровня загрязненности в реке было
		выполнено 50 измерений, каждое из которых 
		содержало информацию о том, в какой день
		недели было произведено измерение, и каким был 
		уровень загрязнения (по 10-балльной шкале).
		Напишите класс, принимающий с клавиатуры данные 
		50 измерений
		(каждое измерение - два числа: первое - день недели,
		 второе - уровень загрязнения) и выводящий на экран: 

		• сообщение Опасно! - для дней, когда уровень загрязнения составлял 7 или более единиц;
		• сообщение Спокойный вторник - для вторников, в которые
		уровень загрязнения составлял менее 5 единиц.
		*/

public class K1311{
	static Random random = new Random();

	public static void pollution(int days, int poll){
			
		
			if(poll >=7){
				System.out.println("pollution " + poll + " swiming denger");
			}
			if(days == 2 & poll < 5){
				System.out.println("days " + days + " calm  tuesday " + poll);
			}
	}
	
	public static void main(String[] args){
	
		for(int i = 1; i<=50; i++){
			int measurements = 1 + random.nextInt(10);
			int days = 1 + random.nextInt(7);	
			pollution( days, measurements);	
		}
	
		
		
	}
}