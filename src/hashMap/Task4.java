package hashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String word = in.nextLine();

        String [] mas = word.split( " ");
        HashMap <String, Integer> map = new HashMap<>();

        int value = 0;
        for (int i = 0; i < mas.length; i++){
            if (map.containsKey(mas[i])) {
                map.put(mas[i], value + 1);
            }else{
                map.put(word, 1);
            }
        }
        System.out.println(map);

    }
}
