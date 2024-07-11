package stream;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());

        }
        list.stream().filter(s -> s%2==0).forEach(s -> System.out.print(s + " "));
    }

}
