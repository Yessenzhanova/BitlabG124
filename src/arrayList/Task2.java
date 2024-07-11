package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> num = new ArrayList<>();
        double sum = 0;

        // Чтение чисел и суммирование их
        for (int i = 0; i < n; i++) {
            int value = in.nextInt();
            num.add(value);
            sum += value; // Добавляем значение к сумме
        }

        // Вывод среднего значения
        double average = sum / n;
        System.out.println(average);
    }
}