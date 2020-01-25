import java.util.Scanner;
/**
Напишите класс, который:
• сначала вводит с клавиатуры целое положительное двузначное
число (нет необходимости проверять соответствие введенного
значения этому условию);
• затем выводит на экран четырехзначные целые положительные
числа, в которых и сумма двух первых цифр, и сумма
 двух последних цифр равны сумме цифр двузначного
 числа, введенного с
клавиатуры. 


*/

public class K1150{
	static Scanner scanner = new  Scanner(System.in);
	public static void main(String[] args){
		System.out.println("enter number");
		int number = scanner.nextInt();
		for(int i = 1000; i<10000 ; i++){
			int i1 = i/1000;
			int i2 = (i%1000)/100;
			int rezault1 = i1+ i2;
			int i3 = (i%100)/10;
			int i4 = i%10;
			int rezault2 = i3+ i4;
			
			if( rezault1 == number & rezault2 == number){
				System.out.print(i + " ");
			
				}
			}
				
		}
		
	}
	
