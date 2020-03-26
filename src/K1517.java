import java.util.Scanner;
/**
Напишите класс, который принимает с клавиатуры целое 
положительное число N и цифру D. Класс должен проверить,
 есть ли внутри числа
N цифра D, и вывести на экран соответствующее сообщение. 

*/

public class K1517{
		public static void main(String[] args){ 
	Scanner scan = new Scanner(System.in);
	System.out.println("enter number N");
	int n = scan.nextInt();
	System.out.println("enter digit D");
	int d = scan.nextInt();
	String str = "" + n;
	char[] ch = str.toCharArray();
	int[] arrayN = new int[ch.length];
int count=0;
		int i = 0;
		while(i<ch.length){
			arrayN[i] = (int)ch[i] - 48;
			
			if(arrayN[i] == d) {
			count++;
					
			}
			
			
			
			
			i++;
		}
	System.out.println(" there is a coinsedence " + count);

		}
}