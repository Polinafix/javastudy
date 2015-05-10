/**
 * Created by Полина on 06.05.2015.
 */
public class Matrix {

    public static double[][] getMatrix(int m, int n) {
        double[][] a = new double[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (Math.random() * 10);
                System.out.printf("%.1f", a[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
        return a;
    }

}
