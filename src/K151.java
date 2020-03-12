import java.util.Scanner;

/**
Дан фрагмент класса:
int a=reader.nextlnt();
int b=reader.nextlnt();
int c=reader.nextlnt();
while (а%Ы=О)
{
а+=с;
System.out.print(a+"; ");
} 
1. Постройте таблицу трассировки и укажите, что будет выведено
на экран, если с клавиатуры были введены следующие значения:
27, 7, 5.
2. Постройте таблицу трассировки и укажите, что будет выведено
на экран, если с клавиатуры были введены следующие значения:
20, 5, 8.
3. Приведите пример значений, вводимых с клавиатуры, для которых 
цикл в данном фрагменте не выполняется ни разу.
4. Есть ли значения переменных а, Ь, с, для которых цикл никогда не
завершится? Если да - приведите пример, если нет - объясните,
почему.
5. Приведите пример значений, вводимых с клавиатуры, для которых 
цикл в данном фрагменте будет выполняться ровно три раза.
6. Что в общем случае выполняет приведенный фрагмент? 
*/


public class K151{
	static Scanner reader= new Scanner(System.in);
	public static void main(String[] args){
		System.out.println("enter number a");
		int a = reader.nextInt();
		System.out.println("enter number b");
		int b = reader.nextInt();
		System.out.println("enter number c");
		int c = reader.nextInt();
	
		while(a%b!=0){
			a+=c;
			System.out.print(a + "; ");
		}
	
	}
}