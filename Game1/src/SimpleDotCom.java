/**
 * Created by Полина on 06.02.2015.
 */
public class SimpleDotCom {

    int[]locationCells;
    int numOfHits = 0;

    public void setLocationCells(int[]locs) {
        locationCells = locs;
    }
    public String checkYourself(String userGuess) {
        int guess = Integer.parseInt(userGuess);
        String result = "Мимо";
        for (int cell : locationCells) {
            if (guess == cell) {
                result = "Попал";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length) {
            result = "Потопил";
        }
        System.out.println(result);
        return result;
    }
}




