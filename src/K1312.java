import java.util.Random;
/**
Напишите класс, который принимает с 
клавиатуры оценки 30 учеников класса и выводит на экран:
• среднюю арифметическую оценку 
класса;
• число учеников, получивших 
неудовлетворительные оценки.
вместо задротного ввода сгенерируем 30 случайных цифр 
от 1 до 5 и выведим их 30 раз(Доработка по Суворовски +) ) 
*/

public class K1312{
	static Random random = new Random();
	public static void main(String[] args){
			int middleSumGrade = 0;
			int countStudyBadGrade = 0;
		for(int i =1; i<=30; i++){
			int r = 1 + random.nextInt(5);
			System.out.print(r + " ");
		
		middleSumGrade += r;
			if(r<3){
				countStudyBadGrade++;
			}
		}
		System.out.println(" = " + middleSumGrade);
		middleSumGrade = middleSumGrade/30;
		System.out.println("middleSumGrade " + middleSumGrade + "  study for"+ 
								  " bad grade " + countStudyBadGrade);
	}
}