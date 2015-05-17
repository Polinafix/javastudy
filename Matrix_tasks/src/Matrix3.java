/**
 * Created by Полина on 09.05.2015.
 */
public class Matrix3 {
    public static void main(String[] args) {
        double[][] c = Matrix.getMatrix(9, 9);
        int negative = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9 - i - 1; j++) {
                System.out.printf("%.1f",c[i][j]);
                System.out.print(" ");

                if (c[i][j] < 0) {
                    negative++;
                }
            }
            System.out.println();
        }
        System.out.print("Кол-во отрицательных элементов над побочной диагональю:");
        System.out.println(negative);
        int summ = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf("%.1f",c[i][j]);
                System.out.print(" ");

                if (c[i][j] > 0) {
                    summ += c[i][j];
                }

            }
            System.out.println();
        }

        System.out.print("Сумма положительных элементов ниже главной:");
        System.out.println(summ);
    }

}