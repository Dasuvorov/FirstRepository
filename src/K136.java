import java.util.Scanner;
/**
Определим как «удивительное» целое положительное число Х,
 для которого выполняется следующее условие: сумма всех
 целых положительных чисел, меньших Х и являющихся 
 делителями Х, равно Х.
Например, число 28 является «удивительным», потому что
1+2+4 + 7 + 14 = 28. 
*/

class K136{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("eneter number x");
		int x = scanner.nextInt();
		int rezault =0;
		for(int i = 1; i< x; i++){
			if(x%i == 0){
			rezault += i; 	
			}

		}
		if(rezault == x) {
			System.out.println(x + " wonderful");
		}else {
			System.out.println(x + " everything is sad");
		}
	
	}
}