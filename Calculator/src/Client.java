/**
 * Created by Полина on 08.02.2015.
 */

import java.util.Scanner;

public class Client {

    public static String compute() {
        Calc n = new Calc();
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Give me two numbers");
        Integer one = scan.nextInt();
        Integer two = scan.nextInt();
        String operation = "";
        while (!Operators.contains(operation)) {
            System.out.println("To add, type a, to subtract, type s,");
            System.out.println("To multiply, type m, to divide, type d");
            operation = scan1.nextLine();
            Operators userOp = Operators.valueOf(operation);
            switch (userOp) {
                case a:
                    return showResult(one, two, userOp,n.summ(one, two));
                case s:
                    return showResult(one, two, userOp,n.sub(one, two));
                case m:
                    return showResult(one, two, userOp,n.mult(one, two));
                case d:
                    return showResult(one, two, userOp, n.div(one, two));
                default:
                    System.out.println("Start again");
            }
        }
        throw new RuntimeException();
    }

    public static String showResult(Integer one, Integer two, Operators userOp, Integer result) {
        return one.toString() + userOp.sign + two.toString() + " = " + String.valueOf(result);
    }

    public static void main(String[] args) {
        System.out.println("Result: " + compute());
        // Result: 5 -> Result: 2 + 3 = 5
//        new Client().operators.addAll(String[]{"a", "s", "d", "m"});
//        Calc n1 = new Calc("calc1");
//        Calc n2 = new Calc("calc2");
//        Calc n3 = new Calc();
//        System.out.println(n1.prefix + n1.mult(5, 6));
//        System.out.println(n2.prefix + n2.mult(5, 6));
//        System.out.println(n3.prefix + n3.mult(5, 6));

    }

}
