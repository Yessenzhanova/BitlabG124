package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> num = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            num.add(in.nextInt());
        }
        for (Integer i : num) {
            System.out.print(i / 2 + " ");
        }
    }
}
