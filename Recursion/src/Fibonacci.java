/**
 * Created by polinafiksson on 11/07/15.
 */
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(8)); // 21
    }

    public static int fib(int n){
        if (n == 1 || n == 2) return 1;
        return fib(n-1)+fib(n-2);
    }
}
