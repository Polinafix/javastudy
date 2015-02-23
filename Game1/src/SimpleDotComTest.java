/**
 * Created by Полина on 06.02.2015.
 */
public class SimpleDotComTest {
    public static void main (String[] args){
        SimpleDotCom dot = new SimpleDotCom();
        int[] locations = {2,3,4};
        dot.setLocationCells(locations);
        String userGuess = "2";
        String result = dot.checkYourself(userGuess);


    }
}
