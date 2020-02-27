import java.util.Random;
/*
В школе решено создать два специализированных класса: физико-математический 
и физико-информационный. Ученик, желающий поступить в 
один из этих классов, доткен иметь среднюю 
оценку (по 10-балльной системе) не менее 7.
 В случае, когда его оценка по математике выше оценки по
информатике, его зачисляют в физико-математический 
класс; при ином
соотношении этих оценок его зачисляют в
физико-информационный класс.
Напишите класс, который принимает с клавиатуры 
оценки по математике и информатике 40 желающих
 учиться в одном из этих специализированных классов.
Для каждого из кандидатов следует определить:
 может ли он быть зачислен в один из классов, и если да, - то в какой.
По результатам проверки данных каждого кандидата следует вывести
на экран соответствующее текстовое сообщение. 

*/
 public class K1331{
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_WHITE = "\u001B[37m";	
	public static void main(String[] args){
	
	 int physics;
	 int mathematics;
	 int avergeRating =0;
	 int count = 0;
	 int countM=0;
	 int countP =0;
	 int countSpent = 0;
	 Random random = new Random();
	 for (int i = 0; i<40; i++){
		 count++;
		 mathematics = 1 + random.nextInt(10);
			
		 physics = 1 + random.nextInt(10);
		 avergeRating = (physics + mathematics)/2;
		 if(avergeRating <7){
		 System.out.println(ANSI_RED + count + " mathematics " + mathematics + " physics "  + physics + 
			" = " + avergeRating);
		 }else {System.out.println(ANSI_GREEN + count + " mathematics " + mathematics + " physics "  + physics + 
			" = " + avergeRating);}
		 
		 
		if(avergeRating >= 7 && mathematics > physics ){
			countM++;
		}else if(avergeRating >= 7 && mathematics < physics){
			countP++;
		}else {
			countSpent++;
		}
	 }	
		System.out.println(ANSI_WHITE);
	System.out.println(" spent " + count);
	System.out.println(" mathematics " + countM);
	System.out.println(" physics " + countP);
	 }
	 
	}
 