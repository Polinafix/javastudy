import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Полина on 04.03.2015.
 */
public class Hours {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please provide the decimal number:");
        String number = reader.readLine();
        System.out.println(action(number));
    }
    public static String action (String enter){
        String result;
        int n = Integer.parseInt(enter);
        int min = n % 60;
        int z = n - min;
        int hour = z/60;
        if(hour > 23) {
            result =(hour%24)+ ":" + min;
        }
        else {
            result = hour + ":" + min;
        }
        return result;
    }
}
