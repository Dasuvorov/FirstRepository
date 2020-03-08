import java.util.Scanner;
/**
Напишите класс, который принимает с клавиатуры серию из 27 целых
чисел и сравнивает два значения: среднее арифметическое максимума
и минимума, и среднее арифметическое всех значений серии.
*/

public class K146{
	public static void main(String[] args){
		int min=0;
		int max=0;
		double sumMin=0;
		double sumMax=0;
		int countMin=0;
		int countMax=0;
		
		double sumS;
		int countTemp = 27;
		Scanner scaner= new Scanner(System.in);
			int s;
	System.out.println("Enter of numbet " + 1);		
		s = scaner.nextInt();
				min =s;
				max =s;
				sumS = s;
		for(int i = 2; i<=27; i++){
			System.out.println("Enter of numbet " + i);
			s = scaner.nextInt();
				sumS += s;
				if(s<min){
					countMin++;
				
					min = s;
					sumMin+=min;
				}	
			
			if(s>max){
					countMax++;
				
					max = s;
					sumMax+=max;
		}
		
	}
	
		System.out.println("average min " + sumMin/countMin);
		System.out.println("average max " + sumMax/countMax);
		System.out.println("average s " + sumS/27);
	
}
}