import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Полина on 25.03.2015.
 */

/*Дан список целых чисел, число k и значение C. Необходимо вставить в список на позицию с индексом k элемент, равный C, сдвинув все элементы имевшие индекс не менее k вправо.

        Посколько при этом количество элементов в списке увеличивается, после считывания списка в его конец нужно будет добавить новый элемент, используя метод append.

        Вставку необходимо осуществлять уже в считанном списке, не делая этого при выводе и не создавая дополнительного списка.

        Входные данные
        Вводится список чисел. Все числа списка находятся на одной строке. На второй строке вводятся числа k и C.

        Примеры
        входные данные
        7 6 5 4 3 2 1
        2 0
        выходные данные
        7 6 0 5 4 3 2 1*/

public class Main3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] rawInput = scan.nextLine().split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        for (String s : rawInput) {//каждый раз присваивается новое значение массива в b
            list.add(Integer.parseInt(s));
        }
        int k = scan.nextInt();
        int c = scan.nextInt();
        list.add(k, c);
        System.out.println(list);


    }
}
