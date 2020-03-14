import java.util.Scanner;

/**

Напишите класс, который принимает с клавиатуры числа,
 пока не будет введено значение 999.
Класс должен подсчитать, сколько значений
 было введено с клавиатуры (не считая значения 999),
 и вывести эту информацию на экран. 

*/

public class K155{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		SysDim.print("enter number");
		int i = scanner.nextInt();
		int count =0;
		while(i!=999){
		count++;
		SysDim.print("enter number");		
		i = scanner.nextInt();
		}
	SysDim.print("count " + count);
		
	}
	
}