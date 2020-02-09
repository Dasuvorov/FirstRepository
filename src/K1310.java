import java.util.Scanner;
/**
Назовем «степенью близости» двух целых
 положительных чисел сумму
их общих делителей.
Напишите класс, который принимает с 
клавиатуры два целых положительных числа
 и определяет их «степень близости». 


*/
public class K1310{
	static Scanner scanner = new Scanner(System.in);

	 static int sumNumber;
	public static int sum(int number1, int number2){
		int sum1 = 0;
		int sum2 = 0;
		for(int i = 1; i< number1/2; i++){
			if(number1%i == 0){
				sum1 +=i;
			}
		}
		for(int i = 1; i< number2/2; i++){
			if(number2%i == 0){
				sum2 +=i;
			}
		}
		System.out.println(sum1 + " " + sum2);
		sumNumber= sum1 + sum2;
		return sumNumber;
	}	
	
	public static void main(String[] args){
	System.out.println(" enter number1");
	int number1 = scanner.nextInt();
	System.out.println(" enter number2");
	int number2 = scanner.nextInt();		
		System.out.println("degree of proximitry " + sum(number1, number2));
	}
	
}