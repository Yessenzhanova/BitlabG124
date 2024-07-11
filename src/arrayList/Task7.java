package arrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task7 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Integer> numbers = new ArrayList<>();
            ArrayList<Integer> nonUniqueNumbers = new ArrayList<>();

            System.out.println("Введите числа (введите 0 для завершения ввода):");

            int num;
            while ((num = scanner.nextInt()) != 0) {
                numbers.add(num);

                // Проверяем, есть ли число уже в списке неуникальных чисел
                if (numbers.indexOf(num) != numbers.lastIndexOf(num)) {
                    if (!nonUniqueNumbers.contains(num)) {
                        nonUniqueNumbers.add(num);
                    }
                }
            }

            System.out.println("Неуникальные числа:");

            for (Integer nonUnique : nonUniqueNumbers) {
                System.out.print(nonUnique + " ");
            }

            System.out.println();
        }
    }
}