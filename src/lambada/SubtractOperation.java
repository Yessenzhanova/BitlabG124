package lambada;

public class SubtractOperation {

    int getSubtraction(int a, int b) {

        Operator min = (s1,s2) -> s1-s2;

        return min.toOperate(a,b);
    }
}
