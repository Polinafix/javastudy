/**
 * Created by Полина on 06.02.2015.
 */
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String snumber = reader.readLine();
        int inumber = Integer.parseInt(snumber);
        System.out.print("\"name\" захватит мир через \"inumber\" лет");


    }
}