import java.util.Scanner;
/**
Напишите класс, который должен принять с клавиатуры значение 123
и вывести на экран сообщение Код принят.
Класс будет снова и снова принимать с клавиатуры значения до тех
пор, пока не будет введено значение 123. На каждое вводимое
 с клавиатуры значение, отличное от 123, класс должен выводить сообщение
Код неверный, повторите ввод. 
*/

public class K157{
	public static void main(String[] args){
		int value;
		Scanner scan = new Scanner(System.in);
		SysDim.print("enter value 123");
		value = scan.nextInt();
		SysDim.print("value equal 123");
		SysDim.print("enter value");
		int r = scan.nextInt();
		while(r!=value){
			
		SysDim.print("The code is incorrect, retype ");
		SysDim.print("enter value");
		r = scan.nextInt();
		}
		SysDim.print("Well done successful ");
	}
}