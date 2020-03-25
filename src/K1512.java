


import java.util.Scanner;


/**
Напишите класс, который принимает с клавиатуры целые числа, пока
не будут введены с клавиатуры друг за другом два одинаковых числа.
<<<<<<< HEAD
Класс должен выводить на экран сумму серии - за исключением 
последнего введенного с клавиатуры значения. 
00106108480181

*/



public class K1512 {
	static Scanner scanner = new Scanner(System.in);
			static int sum =0 ;
			static  int a;
			static int b;
		static int resault(){
			System.out.println("enter a");
			a = scanner.nextInt();
			System.out.println("enter b");
			b = scanner.nextInt();


			if(a !=b ){
				sum+=a;
				sum+=b;
				return sum;
			}else {
				return sum;
			}

		}


	public static void main(String... args) {
			resault();
			while(a !=b){
				resault();


			}
		System.out.println(sum);
	}
}

