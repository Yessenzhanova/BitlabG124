package stream;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());

        }
//       int sum = list.stream().reduce(0, Integer:: sum);

//        System.out.println(sum);
       int sum =  list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

    }

}
