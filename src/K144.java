import java.util.Random;

/*
Напишите класс, который генерирует серию из 50 случайных целых
чисел из диапазона от -40 до +40, и определяет
 наибольшее из положительных значений в сгенерированной серии, а также наименьшее из
отрицательных значений в сгенерированной серии.
В случае если одно из нужных значений невозможно определить
(почему?}, следует вывести на экран соответствующее текстовое сообщение. 
*/

public class K144{
	public static void main(String[] args){
		int max =0; 
		int min =0;
		Random random = new Random();
		int r;
		for(int i =1; i<=3; i++){
			r= -40+random.nextInt(81);
			System.out.print(r+ " ");
			if(r>max && r>0){
				max = r;
			}
			if(r<min && r<0){
				min = r;
			}
			
			
		}
		System.out.println();
			if(max!=0){
				System.out.println("max " + max);
			}else {
				System.out.println("max =" + max + " fuuuuuuuuuuuuuk");
			}
		if(min!=0){
				System.out.println("min " + min);
			}else {
				System.out.println("min =" + min  +" fuuuuuuuuuuuuuk");
			}
		
	}
}