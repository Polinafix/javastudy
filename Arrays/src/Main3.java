import java.util.ArrayList;
import java.util.Arrays;
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
        //new Main3().version1();
        version2();
    }

    public void version1() {
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

    public static void version2() {
        Scanner scan = new Scanner(System.in);
        String[] rawInput = scan.nextLine().split(" ");
        int index = scan.nextInt();
        String value = scan.next();
        String[] result = new String[rawInput.length + 1];
        for (int i = 0; i < result.length; i++) {
            if (i < index) {
                result[i] = rawInput[i];
            }
            if (i == index) {
                result[i] = value;
            }
            if (i > index) {
                result[i] = rawInput[i - 1];
            }
           /* result[i] = i < index ? rawInput[i] : "";
            result[i] = i == index ? value : "";
            result[i] = i > index ? rawInput[i - 1] : "";*/
        }
        System.out.println(Arrays.toString(result));
        for (String val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
             /*
        1) считать все исходные данные от пользователя
        2) массив с элементами и новый элемент и позиция, на которой он должен оказаться в расширенном (новом) массиве
        2.1) создать новый массив, размерность - старый + 1
        2.2) цикл по элементам (старый ? новый)
        2.3) скопировать все элементы до нужной позиции в новый массив
        2.4) на указанную пользователем позицию вставить элемент
        2.5) скопировать оставшиеся элементы после нового элемента в новом массиве
        3) вывести на экран

          rawInput     7 6 5 4 3 2 1
          rawInput.i   0 1 2 3 4 5 6
          result       7 6 0 5 4 3 2 1
          result.i     0 1 2 3 4 5 6 7

           index = 2
           value = "0"

           1) 0<2 => result[0] = rawInput[0] = 7
           2) 1<2 => result[1] = rawInput[1] = 6
           3) 2=2 => result[2] = value = 0 (add new element value = 0)
           4) 3>2 => result[3] = rawInput[2] = 5
           5) 4>2 => result[4] = rawInput[4-1] = 4
           ...
         */
    }
}