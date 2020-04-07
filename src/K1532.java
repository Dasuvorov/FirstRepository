import java.util.Scanner;

/**
Напишите класс, который принимает с клавиатуры 
серию целых чисел
до тех пор, пока количество четных 
чисел на нечетных местах в серии
остается меньше 5. 
*/

  public class K1532{
	  public static void main(String[] args){
		  Scanner scanner = new Scanner(System.in);
		  int evencount =0;
			while(true){
		 System.out.println("enter number");
		  String numberString = scanner.nextLine();
			
		 char[] ch = numberString.toCharArray();
		int[] numberInt = new int[ch.length];
		
		for(int i = 0 ; i<ch.length; i++){
			numberInt[i] = (int)ch[i] -48;
				
		}
			for(int i =0; i<ch.length;i+=2){
				if(numberInt[i]%2 ==0){
					evencount++;
				}
			}
					
				
				
				
			if(evencount >= 4){
				break; 
		}
			
			System.out.println("exit " + evencount);
		 
	  }
	  System.out.println("exit " + evencount);
  }
  }