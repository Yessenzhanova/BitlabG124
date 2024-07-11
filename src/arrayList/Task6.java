package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int l = in.nextInt();
        int r = in.nextInt();
        int index = 0;
        int index2 = 0;

        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            nums.add(in.nextInt());
        }
        if (l <= r && l >= 0 && r < nums.size()) {
            for (int i = r; i >= l; i--) {
                System.out.print(nums.get(i) + " ");
            }
            System.out.println();
        }
    }
}

