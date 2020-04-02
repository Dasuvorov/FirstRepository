import java.util.Scanner;

/**
Напишите класс, который принимает с клавиатуры целое число и выводит на экран:
• в первой строке - все четные (по месту) цифры этого числа, через
пробел;
• во второй строке - все нечетные (по месту) цифры этого числа,
через пробел.
Например, для числа 765873 в первой строке будет выведена серия 6 8 3,
а во второй строке - 7 5 7. 

*/

public class K1524{
    static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args){
		System.out.println("Enter number");
		String stringNumber = scanner.nextLine();
		char[] charNumber = stringNumber.toCharArray();
		int[] intNumber = new int[charNumber.length];
		for(int i = 0; i <charNumber.length; i++){
		    intNumber[i] = (int) charNumber[i]-48;
		}
		    int i =1;
		while(i<intNumber.length){
            System.out.print(intNumber[i] + " ");
            i+=2;
		}
        System.out.println();
	        i = 0;
		while(i<intNumber.length){
            System.out.print(intNumber[i] + " ");
            i+=2;
        }
	}
}