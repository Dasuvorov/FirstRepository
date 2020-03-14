import java.util.Scanner;
/**

Напишите класс, который принимает с клавиатуры числа,
 пока небудет введено значение 999.
Класс должен подсчитать, сколько значений было 
введено с клавиатуры, чему равна сумма 
этих значений (не считая значения 999), и вывести 
эту информацию на экран. 

*/

public class K156{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		SysDim.print("enter number");
		int i = scanner.nextInt();
		int count =0;
		while(i!=999){
		count++;
		sum+=i;
		SysDim.print("enter number");		
		i = scanner.nextInt();
		}
	SysDim.print("count " + count + " sum " + sum);
		
		
	}
	
}