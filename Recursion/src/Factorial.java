/**
 * Created by polinafiksson on 11/07/15.
 */
public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));

    }

    public static int fact(int n) {
        if (n == 1) {
            System.out.print(n + " = ");
            return 1;
        }
        System.out.print(n + " + ");
        return n * fact(n - 1);
    }
}

/*
5! = 1*2*3*4*5
n! = n*(n-1)*(n-2)*..*1

n = 3
3*2*1
 */