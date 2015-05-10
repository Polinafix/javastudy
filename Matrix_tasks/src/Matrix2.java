/*
*
 * Created by Полина on 07.05.2015.*/
public class Matrix2 {


    public static void main(String[] args) {
        int[][] b = new int[7][7];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                b[i][j] = (int) (Math.random() * 10);
            }
        }
        int max = 0;
        int min = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(b[i][j] + " ");
                if (i > j){//ниже диагонали
                    if (max < b[i][j])
                    max = b[i][j];
                }
                if(i < j){//выше диагонали
                if (min > b[i][j])
                    min = b[i][j];
                }

            }
            System.out.println();

        }
        System.out.println(max);
        System.out.println(min);


        /*for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                int max = 0;
                int min = 0;
                if (max < b[i][j])
                    max = b[i][j];
                if (min > b[i][j])
                    min = b[i][j];
                System.out.println(max);
                System.out.println(min);
            }

        }*/

    }
}


