import java.util.Scanner;
/**
Напишите класс, который принимает с клавиатуры 
два целых положительных числа: N и М (можно считать, что M<N).
Класс должен вывести на экран серию М+(М+ 1)+(М+2)+ ... +N. 

*/

public class K1153{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter numbet M");
		int m = scanner.nextInt();
		System.out.println("enter numbet N, where N > M");
		int n = scanner.nextInt();
			
			for(int i = m; i<=n; i++){
				
				if(i!=n){
					System.out.print(i + " + ");
				}else {
					System.out.print(i);
				}
				
			}
	
	
	
	}
	
}