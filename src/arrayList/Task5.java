package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int l = in.nextInt();
        int r = in.nextInt();
        int sum = 0;

        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            nums.add(in.nextInt());
        }
        if (l <= r && l >= 0 && r < nums.size()) {
            sum = 0;
            for (int i = l; i <= r; i++) {
                sum += nums.get(i);
            }

            System.out.println(sum + " " );
        }
    }
}

