package tasks;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String text = in.nextLine();

        System.out.println(chek(in.nextLine(), in.next().charAt(0)));
    }

    public static int chek(String text, char letter) {
        int count = 0;
        text = text.toLowerCase();

        // Проходим по каждому символу в тексте
        for (int i = 0; i < text.length(); i++) {
            // Если текущий символ равен введенной букве (игнорируя регистр), увеличиваем счетчик
            if (Character.toLowerCase(text.charAt(i)) == Character.toLowerCase(letter)) {
                count++;
            }
        }
        return count;
    }
}
