import java.util.Scanner;
/**
Назовем «базой» положительного числа Х сумму всех положительных
целых чисел, меньших Х.
Напишите класс, который принимает с клавиатуры положительное
целое число Х и подсчитывает его «базу». 


*/
public class K135{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number x");
		int x = scanner.nextInt();		
		int bases = 0;
		int i = 0;
		if(x>0){
	
		
		
		while(i<x){
			bases +=i; 
		System.out.print(i + " ");	
			i++;
			
		}
	System.out.println();
	System.out.println("bases " + bases);
	}else{
		System.out.println("x smaller zero");
		
		}

	}
}