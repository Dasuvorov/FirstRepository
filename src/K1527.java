import java.util.*;

/**
 * Напишите класс, который принимает с клавиатуры целое положительное
 * число, а затем генерирует случайную цифру.
 * Класс должен определить, встречается ли во введенном с клавиатуры
 * числе сгенерированная цифра (сколько раз и на каких позициях), и
 * вывести на экран соответствующую информацию.
 */

public class K1527 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        String number = scanner.nextLine();
        Random random = new Random(85);
        List<Integer> arrayList = new ArrayList<>();
        int r = random.nextInt(10);
        System.out.println("enter r " + r);
        char[] numberCh = number.toCharArray();
        int[] numberInt = new int[numberCh.length];
        int count = 0;
        int i = 0;
        while (i < numberInt.length) {
            numberInt[i] = (int) numberCh[i] - 48;

            i++;
        }


        for (i = 0; i < numberInt.length; i++) {

            if (numberInt[i] == r) {
                count++;

                arrayList.add(i+1);
            }

        }
        for (int x : arrayList) {
            System.out.print(x + " ");
        }
        System.out.println("count " + count);

    }


}
