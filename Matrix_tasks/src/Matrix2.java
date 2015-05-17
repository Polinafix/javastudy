/*
*
 * Created by Полина on 07.05.2015.*/
public class Matrix2 {
    public static void main(String[] args) {
        double[][] b = Matrix.getMatrix(7, 7);
        double max = 0;
        double min = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                //System.out.print(b[i][j] + " ");
                if (i > j){//ниже диагонали
                    if (max < b[i][j])
                    max = b[i][j];
                }
                if(i < j){//выше диагонали
                if (min > b[i][j])
                    min = b[i][j];
                }
            }
        }
        System.out.printf("%.1f", max);
        System.out.println();
        System.out.printf("%.1f", min);
    }
}


