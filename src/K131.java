import java.util.Scanner;
/**
Дан следующий фрагмент класса:
int sl =О;
int s2 =О;
for(int i = 1; i <7; i++)
{
}
int x=reader.nextlnt();
if( х % 2 ==O)sl=sl+x;
if( х % 3 ==O)s2=s2+x;
Проследите за выполнением фрагмента и запишите, какими будут
значения переменных sl и s2 для следующего набора вводимых данных после его окончания: 5, 12, 6, 8, 9, 7. 
				S1 = 10 s2 =5; 																						

*/
	public class K131{
public static void main(String[] args){
	Scanner reader = new Scanner(System.in);
		int s1 = 0;
		int s2 = 0;
		for(int i = 1; i <7; i++){
		int x=reader.nextInt();
		if( x % 2 == 0){s1=s1+x;}
		if( x % 3 == 0){s2=s2+x;}
	
		}
		System.out.println(s1);
		System.out.println(s2);

	}
}
