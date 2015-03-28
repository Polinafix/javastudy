import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Полина on 22.03.2015.
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] rawInput = scan.nextLine().split(" ");
        //System.out.println(a[2]);
        ArrayList<Integer> numbers = new ArrayList<>();
        for (String s : rawInput) {//каждый раз присваивается новое значение массива в b
            numbers.add(Integer.valueOf(s));
        }

        int imax = 0;
        int imin = 0;
        int min = numbers.get(0);
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            Integer number = numbers.get(i);
            if (number <= min) { // last min in array; if (number < min) - first min in array
                min = number;
                imin = i;
            }
            if (number >= max) {
                max = number;
                imax = i;
            }

        }
        System.out.println(min);
        System.out.println(imin);
        System.out.println(max);
        System.out.println(imax);

        numbers.set(imax, min);
        numbers.set(imin, max);

        System.out.println(numbers);
        System.out.println(Collections.max(numbers));
        System.out.println(Collections.min(numbers));
        System.out.println(numbers.indexOf(Collections.max(numbers)));
        System.out.println(numbers.indexOf(Collections.min(numbers)));

    }
}

