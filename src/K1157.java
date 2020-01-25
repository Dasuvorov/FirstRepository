import java.util.*;

/**
Напишите класс, который принимает с клавиатуры целое число а,
а затем выводит на экран серию из 15 целых чисел,
 начиная с 1 так, что
каждое следующее число в серии на а больше предыдущего 
числа (между числами должен быть знак#): l#l +a#l +2а# ... 


*/

public class K1157{
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String... args){
		System.out.println("enter number A");
		long a = scanner.nextInt();
		for(int i = 1; i <= 15; i ++){
			a *=i;
			if(i!=15){
				System.out.print(a + "# ");
			}else {
				System.out.print(a);
			}
			
		}
		
		
	}
	
}
