package tasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(triangle(in.nextInt(), in.nextInt(), in.nextInt()));
    }

    public static String triangle(int a, int b, int c) {

        if (a + b > c && b + c > a && a + c > b) {
            return ("YES");
        } else {
            return ("NO");
        }
    }
}




