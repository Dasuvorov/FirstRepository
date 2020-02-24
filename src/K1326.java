import java.util.Random;
/*
Напишите класс, который создает серию из 15 случайных чисел из
диапазона -30 ... + 30.
Класс будет выводить на экран только те числа серии, которые имеют
такой же знак, как и предшествующее им число (значение О считать
положительным для данного задания). 
*/

public class K1326 {
    public static void main(String[] args) {
        Random random = new Random();
        int r = -30 + random.nextInt(60);
        int temp = r;
        System.out.println("Number = " + temp);
        for (int i = 0; i < 15; i++) {

            r = -30 + random.nextInt(60);
            if ((temp > 0) & (r > 0)) {
                System.out.print(r + " ");
            } else if
            ((temp < 0) & (r < 0)) {
                System.out.print(r + " ");

            }
        }

    }
}
