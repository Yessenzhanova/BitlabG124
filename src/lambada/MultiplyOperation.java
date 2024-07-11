package lambada;

public class MultiplyOperation {

    int getMultiplication(int a, int b) {

        Operator min = (s1,s2) -> s1*s2;

        return min.toOperate(a,b);
    }
}


