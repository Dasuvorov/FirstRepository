import java.util.Scanner;
/**
 * Напишите класс, который принимает с клавиатуры
 * целое положительное число и выводит на экран его первую цифру.
 * Например, для числа 7659 на экран будет выведено 7.
 *
 */
public class K1525 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        int digit = 0;
        while(number>0){
            digit = number%10;
            number/=10;

        }
        System.out.println("first digit " + digit);
    }

}
