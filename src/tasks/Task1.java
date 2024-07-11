package tasks;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(getMax(in.nextInt(), in.nextInt(), in.nextInt()));

    }
    public static int getMax(int a, int b, int c){
        int max = Integer.MIN_VALUE;

        if(max<a){
            max = a;
        }

        if(max<b){
            max=b;
        }

        if(max<c){
            max = c;
        }

        return max;
    }
}