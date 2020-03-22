import java.util.Arrays;
import java.util.Random;
//experements with arrays bulls)))
public class ArrayExample{
	public static void main(String[] args){
		Random random = new Random(47);
		int[] a1 = {1,2,3,4,5,6};
		System.out.println(Arrays.toString(a1) + "a1");
		int[] a2;
		a2=a1;
		System.out.println(Arrays.toString(a2) + " a2");
		
		a1[1] = 10;
		System.out.println(Arrays.toString(a1) + "a1");
		System.out.println(Arrays.toString(a2) + "a2");
		
		boolean[] bulls = new boolean[random.nextInt(20)];
		System.out.println(Arrays.toString(bulls) + " bulls");
		System.out.println("bulls.length =" + bulls.length);
		
		Integer[] array = new Integer[random.nextInt(20)];
		System.out.println("array length = " + array.length);
		
		for(int i = 0; i<array.length; i++){
			array[i]= random.nextInt(500);
			
		}
			
			for(int x: array){
			System.out.print("[" + x + "] ");
			}
	}
	
}