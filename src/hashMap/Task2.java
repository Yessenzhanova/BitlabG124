package hashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        HashMap <String, Integer> map = new HashMap<>();


        map.put(in.next(), in.nextInt());
        map.put(in.next(), in.nextInt());
        map.put(in.next(), in.nextInt());
        map.put(in.next(), in.nextInt());
        map.put(in.next(), in.nextInt());

            System.out.println( map.size());

        }

    }

