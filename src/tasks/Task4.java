package tasks;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        if (palindrome(str)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean palindrome(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; --i) {
            reversed+= str.charAt(i);
        }
        return str.equals(reversed);
    }
}