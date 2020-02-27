import java.util.Random;
/*
Производственный участок выпускает стальные
 шарики, диаметр которых должен быть равен
 24 миллиметрам (допустимое отклонение не
более 2 миллиметров), а вес - 74 граммам 
(допустимое отклонение не
более 3 грамм).
Напишите класс, который принимает данные 
120 шариков, для каждого из них определяет,
 соответствуют ли его параметры указанным
стандартам, и выводит на экран для каждого
 шарика соответствующее
текстовое сообщение. 

*/

public class K1330{
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_WHITE = "\u001B[37m";
	public static void main(String[] args){
	/**	int diameter = 24;
		int diameterError = 2;
		int weight = 74;
		int weightError = 3;
	*/	int count1=0;
		int count2=0;
		int count= 0;
		Random random = new Random();
		for(int i = 0; i< 120; i++){
			int d = 115 + random.nextInt(10);
			int w = 70 + random.nextInt(8);		
			if((d >=118 && d <= 122) && (w >=72 && w <= 76 )){
				count++;count1++;
				System.out.println(ANSI_WHITE + count + ANSI_GREEN  +" d = " + d + " w = " + w);
			}else {count++; count2++;
				System.out.println(ANSI_WHITE + count + ANSI_RED  +" d = " + d + " w = " + w);}
		}
		System.out.println(ANSI_WHITE + " good " + count1 + " bad " + count2);
	}
	
}