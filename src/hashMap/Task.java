package hashMap;

import java.util.Scanner;
import java.util.HashMap;

public class Task {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        HashMap<String, Integer> map = new HashMap<>();

        map.put(in.next(), in.nextInt());
        map.put(in.next(), in.nextInt());
        map.put(in.next(), in.nextInt());
        map.put(in.next(), in.nextInt());
        map.put(in.next(), in.nextInt());

        for (String key: map.keySet()){
            System.out.println( key + " costs " + map.get(key) + " USD ");

        }

    }
}
