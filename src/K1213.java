import java.util.Random;

/**
 * Для того чтобы проверить утверждение «орел и решка,
 * при подбрасывании монеты, выпадают примерно одинаковое количество раз»,
 * ученик подбросил монету сначала 10, потом 100, потом 1000 раз. В каждой
 * серии он записывал, сколько раз выпадала «решка»,
 * сколько - «орел».
 * Напишите класс, который моделирует эти три серии и
 * для каждой подсчитывает количество выпадений «орла» и количество выпадений
 * «решки», и выводит на экран абсолютное и
 * относительное значение
 * разницы между этими количествами.
 */

public class K1213 {
    static int absolutly = 0;
    static int countTailRezault0 = 0;
    static int countEagleRezault1 = 0;

    static int eagleAndTails(int i) {

        Random random = new Random();
        int rezault = random.nextInt(2);
        if (rezault == 0) {
            countTailRezault0++;
        } else if (rezault == 1) {
            countEagleRezault1++;
        }


        absolutly = countTailRezault0 - countEagleRezault1;
        if (absolutly < 0) {
            absolutly *= -1;
        }

        return absolutly;
    }

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            eagleAndTails(i);

        }
        System.out.println("count Tail " + countTailRezault0 + " count Eagle " +
                countEagleRezault1 + " absolutly " + absolutly);
        absolutly =0;
        countTailRezault0 =0;
        countEagleRezault1 =0;

        for (int i = 0; i < 100; i++) {
            eagleAndTails(i);

        }
        System.out.println("count Tail " + countTailRezault0 + " count Eagle " +
                countEagleRezault1 + " absolutly " + absolutly);

        absolutly = 0;
        countTailRezault0 =0;
        countEagleRezault1 =0;
        for (int i = 0; i < 1000; i++) {
            eagleAndTails(i);
        }
        System.out.println("count Tail " + countTailRezault0 + " count Eagle " +
                countEagleRezault1 + " absolutly " + absolutly);

    }
}