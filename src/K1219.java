import java.util.Random;
import java.util.Scanner;
/**
Напишите класс, который принимает с клавиатуры 
следующие данные:
• центр окружности (два действительных числа);
• радиус окружности;
• 15 пар координат точек на плоскости.
Класс должен вывести на экран количество точек,
 лежащих внутри окружности и количество точек,
 лежащих на окружности. 


*/

public class K1219 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);

		System.out.println("enetr coordinate X");
		int countCircle = 0;
		int countForCircle = 0;

		int dotX = scanner.nextInt();
		System.out.println("enetr coordinate Y");
		int dotY = scanner.nextInt();
		System.out.println("enetr radius circle");
		int radius = scanner.nextInt();
		int minX = dotX - radius;
		int maxX = dotX + radius;
		int minY = dotY - radius;
		int maxY = dotY + radius;

		for (int i = 0; i < 3; i++) {
			System.out.println("enetr x");
			int x = scanner.nextInt();
			System.out.println("enetr y");
			int y = scanner.nextInt();
			if (x > minX & x < maxX) {
				if (y > minY & y < maxY) {

					countCircle++;
					System.out.println(countCircle);
				}
			}


			if (x == minX && x == maxX) {
				if (y == minY && y == maxY) {

					countForCircle++;
					System.out.println(countForCircle);
				}
			}
		}
		System.out.println("countCircle " + countCircle);
		System.out.println("countCircle " + countForCircle);

	}
}