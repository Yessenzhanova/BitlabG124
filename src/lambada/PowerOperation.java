package lambada;

public class PowerOperation {

    int getPower(int a, int b) {

        Operator pow = (s1,s2) -> (int) Math.pow(s1,s2);

        return pow.toOperate(a,b);
    }
}

