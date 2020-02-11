import java.util.Random;
/**
Напишите класс, который принимает с клавиатуры оценки
 30 учеников класса и выводит на экран:
• среднюю арифметическую оценку учеников,
 получивших удовлетворительные оценки;
• среднюю арифметическую оценку учеников,
 получивших неудовлетворительные оценки.
Что произойдет при исполнении программы, 
если все 30 учеников получили удовлетворительные оценки? 
Получится деление на ноль при получении 
расчете средней неудовлетворительной оценки;
доработаем рандомом
играя этими цифырами мы добиваемся условияделения на ноль 
r = 1 + random.nextInt(3);
или 
r = 4 + random.nextInt(5);
*/
public class K1313{

	static Random random = new Random();
	public static void main(String[] args){
		int countBad = 0;
		int countGood = 0;
		int middleGoodGrade =0;
		int middleBadGrage = 0;
		int r;
		for(int i = 1; i <= 30; i++){
			r = 1 + random.nextInt(3);
			if(r<=3){
				countBad++;
				middleBadGrage += r;
				System.out.print(r + " ");
			}else {
				countGood++;
				middleGoodGrade += r;
				System.out.print (r + " ");
			}
				
		
		} 
		System.out.println();
			if(countBad > 0){
				middleBadGrage = middleBadGrage/countBad;
				System.out.println("middleBadGrage " + middleBadGrage);
			}else{
				System.out.println("all well done ");
			}
			if(countGood > 0){
				middleGoodGrade = middleGoodGrade/countGood;
				System.out.println("middleGoodGrade " + middleGoodGrade);
			}else{
				System.out.println("all PIDARY ");
			}
	} 
	}
