import java.util.Random;

/**
 * Created by Полина on 02.05.2015.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Element from first array: " + Generator.randomArray()[0]);
        int[] g = Generator.randomArray(6);
        System.out.print("Elements from second array: ");
        Generator.printArray(g);
    }
}
