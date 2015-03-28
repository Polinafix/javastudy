import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Полина on 20.03.2015.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] array = scan.nextLine().split(" ");
        ArrayList<Integer> numbers = new ArrayList<>();
        for (String b : array) {//каждый раз присваивается новое значение массива в b
            numbers.add(Integer.parseInt(b));
        }
        Collections.reverse(numbers);
        printer(numbers);
        // new Main().printer(numbers);
        ArrayList<Integer> reverse = new ArrayList<>();
        for (int i = numbers.size()-1; i >= 0; i--){
            // 0 1 2 3 4 5 -> 5 4 3 2 1 0
            //System.out.println(i + " " + numbers.get(i));
            reverse.add(numbers.get(i)); // element with last index add into new list at first position
        }
        printer(reverse);

        for (int i = 0; i <= reverse.size() / 2; i++) {
            int tmp = reverse.get(reverse.size() - 1 - i);
            // System.out.println(i + " " + (numbers.size() - 1 - i));
            reverse.set(reverse.size() - 1 - i, reverse.get(i));
            reverse.set(i, tmp);
        }
       printer(reverse);
    }

    public static void printer(ArrayList<Integer> arr) {
        for (Integer number : arr) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
