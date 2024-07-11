package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> num = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < n; i++) {
            num.add(in.nextInt());
        }

        for (Integer i : num) {
            if(i >0){
                count++;
            }
        }
        System.out.println(count);
    }
}
