import java.util.Random;

/*
Напишите класс, который вводит с клавиатуры 15 целых положительных чисел,
 для каждого введенного числа класс должен напечатать
сумму его цифр.
После окончания ввода класс выведет на 
экран порядковый номер
числа с самой большой суммой цифр. 
*/

public class K1522{
	static Random random = new Random();
public static void main(String[] args){
	int r;
	int sum = 0;
	int temp = 0;
	int sumTemp = 0;
	int iTemp = 0;
	for(int i = 1; i<=15; i++){
		sum = 0;
		System.out.println();
		r = random.nextInt(999);
		
		System.out.print("i =  " + i +" r " + r + " = ");
		while(r>0){
			
			sum+=r%10;
			r/=10;
				
		}
		System.out.print(sum);	
		if(sum > sumTemp){
			iTemp = i;
			sumTemp = sum;
		}
	
	
	}
	System.out.println();
	System.out.println("resault  i =  " + iTemp + " sum " + sumTemp);
}


}