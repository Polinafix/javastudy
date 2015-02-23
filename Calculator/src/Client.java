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
        int result = 0;
        String sign = "";
        while (Operators.valueOf(operation) != null) {
            System.out.println("To add, type a, to subtract, type s,");
            System.out.println("To multiply, type m, to divide, type d");
            operation = scan1.nextLine();
            switch (operation) {
                case "a":
                    result = n.summ(one, two);
                    sign = "+";
                    break;
                case "s":
                    result = n.sub(one, two);
                    sign = "-";
                    break;
                case "m":
                    result = n.mult(one, two);
                    sign = "*";
                    break;
                case "d":
                    result = n.div(one, two);
                    sign = ":";
                    break;
                default:
                    System.out.println("Start again");
            }
        }
        String answer = one.toString() + sign + two.toString() + " = " + String.valueOf(result);
        return answer;
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
