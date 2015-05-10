/**
 * Created by Полина on 10.05.2015.
 */
public class Task1 {
    public static void main(String[] args) {
        double[][] a = Matrix.getMatrix(3, 5);
        int summ = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                summ += a[i][j];
            }
        }
        double average = summ*1.0 / (a.length*a[0].length);

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] < average) {
                    a[i][j] = 0;
                } else if (a[i][j] > average) {
                    a[i][j] = 1;
                }
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(summ);
        System.out.println(a.length*a[0].length); // count
        System.out.println(average);
    }
}
