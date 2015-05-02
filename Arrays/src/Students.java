import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Полина on 05.04.2015.
 *
 * прочитать из файла оценки учеников за четверть. На основе среднего балла для каждого ученика определить тройку лучших и тройку аутсайдеров.
 * Применить sparse twodimentionаl array, в котором строки соответствуют оценкам учеников. В результате распечатать id учеников с пояснением.
 *
 * 1) прочитать из файла оценки учеников за четверть
 *      - сохранить данные в массив
 * 2) рассчитать средний балл для каждого ученика
 * 3) определить тройку лучших и тройку аутсайдеров
 *      - обработать случаи, когда студентов меньше 6
 */
public class Students {
    public static void main(String[] args) {
        try {
            // Scanner file = new Scanner(new File(args[0]));
            Scanner file = new Scanner(new File("C:\\Users\\Полина\\IdeaProjects\\Arrays\\src\\students.txt"));
            ArrayList<int[]> students = new ArrayList<>();
            while (file.hasNext()) {
                String[] strs = file.nextLine().split(" ");
                int[] ints = new int[strs.length];
                for (String s : strs) {
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("error!");
            e.printStackTrace();
        }
    }
}
