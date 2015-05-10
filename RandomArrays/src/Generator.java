import java.util.Random;

/**
 * Created by Полина on 02.05.2015.
 */
public class Generator {
    private static Random r = new Random();

    static int[] randomArray() {
        return new int[]{r.nextInt(10)};
    }

    static int[] randomArray(int len) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = r.nextInt(10);
        }
        return array;
    }

    static void printArray(int[] a) {
        for (int anA : a) {
            System.out.print(anA + " ");
        }
        System.out.println();
    }
}
