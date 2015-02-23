import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Полина on 22.02.2015.
 */
public class Del {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        for(int i = 2; i < name.length();i++) {

            name = removeCharAt(name, i);
        }
        System.out.println(name);

    }
    public static String removeCharAt(String s, int pos) {

        return s.substring(0,pos)+s.substring(pos+1);

    }
}
