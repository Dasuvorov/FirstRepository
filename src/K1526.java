import java.util.*;

/**
Напишите класс, который принимает с клавиатуры целое 
положительное число, а затем генерирует случайную цифру.
Класс должен определить, встречается ли во введенном с клавиатуры
числе сгенерированная цифра, и вывести на экран соответствующее
сообщение. 
*/
        public class K1526{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		System.out.println("enter number");
		String number = scanner.nextLine();
		Random random = new Random(82);
		int r = random.nextInt(100); 
		System.out.println("this is generation " + r);
		String sr = ""+r;
		
		if(number.contains(sr)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
    }

}