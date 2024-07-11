package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> num = new ArrayList<>();

        // Считываем числа и добавляем в список
        for (int i = 0; i < n; i++) {
            num.add(in.nextInt());
        }

        // Ищем максимальное число
        int max1 = Integer.MIN_VALUE;
        for (Integer number : num) {
            if (number > max1) {
                max1 = number;
            }
        }

        // Ищем второе максимальное число
        int max2 = Integer.MIN_VALUE;
        for (Integer number : num) {
            if (number > max2 && number < max1) {
                max2 = number;
            }
        }

        // Выводим второе максимальное число
        System.out.println(max2);
    }
}
