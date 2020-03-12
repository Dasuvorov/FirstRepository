import java.util.Scanner;

/**
Дан фрагмент класса:
int a=reader.nextlnt();
int b=reader.nextlnt();
while (а!=Ь) 
{
а++;
Ь--;
}
System.out.print(a);
1. Постройте таблицу трассировки и укажите, что будет выведено на
экран, если с клавиатуры были введены следующие значения: 7, 3.
2. Постройте таблицу трассировки и укажите, что будет выведено на
экран, если с клавиатуры были введены следующие значения: 9, 1.
3. Приведите пример значений, вводимых с клавиатуры, для которых
 цикл никогда не завершится. Объясните свой ответ.
4. Укажите, какое изменение следует сделать в данном фрагменте,
чтобы цикл завершался при любых значениях вводимых данных. 
*/

public class K152{
	static Scanner reader = new Scanner(System.in);
	public static void main(String[] args){
	System.out.println("number a");
	int a = reader.nextInt();	
	System.out.println("number a");	
	int b = reader.nextInt();	
	
	while(a!=b){
		a++;
		b--;
	}
	System.out.println("a = " + a);
	}
}