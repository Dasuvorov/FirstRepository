import java.util.Scanner;
/**
Напишите класс, который принимает с клавиатуры 
целое число (для
переменной х) и выводит на экран серию 
значений: х, x в квадрате 2,х в кубе  , х  до тех
пор, пока очередное значение остается меньше 1000. 
*/

		public class K1533{
		static 	Scanner scanner = new Scanner(System.in); 
		public static void main(String[] args){
			
			System.out.println("enter number x");
			int x = scanner.nextInt();
			int temp = x;
			System.out.print(x + " ");
			while(temp<1000){
				temp *=x;
				if(temp >=1000){
				break;	
				}else{
				System.out.print(temp + " ");
				}
			}
			
		}
			
		}