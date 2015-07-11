/**
 * Created by polinafiksson on 11/07/15.
 */
public class Main1 {
    public static void main(String[] args) {
//        print();
        print1(0);

    }
    public static void print() { // бесконечная рекурсия
        System.out.println("hello");
        print(); // java.lang.StackOverflowError
    }

    public static void print1(int a) { // конечная рекурсия
        if(a == 10) return;
        System.out.println("hello " + a);
        print1(a + 1);
    }
}
