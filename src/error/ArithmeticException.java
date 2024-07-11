package error;

import java.util.Scanner;

public class ArithmeticException {
        public static void main(String[] args) {


            try{
                Scanner in = new Scanner(System.in);
                int a = in.nextInt();
                int b = in.nextInt();
                System.out.println(a/b);

            }catch(java.lang.ArithmeticException e){
                System.out.println( "Division by zero");
            }

        }
    }
