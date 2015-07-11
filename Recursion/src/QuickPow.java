/**
 * Created by polinafiksson on 11/07/15.
 */
public class QuickPow {
    public static void main(String[] args) {
        System.out.println(pow(2, 7));

    }
    public static int pow(int a, int b){
        if (b == 0) return 1;
        if (b%2 == 0){
            int r = pow(a, b / 2);
            return r * r;
        }
        return a*pow(a,b-1);
    }
}
