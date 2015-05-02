import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Полина on 05.04.2015.
 *
 * прочитать из файла данные учеников.
 * Сохранить в HashMap.
 * По введённому пользователем id выводить фамилию студента.
 * Статья по работе с HashMap: http://y3x.ru/2011/12/java-hashmap/
 identifiers.txt
 id_14 Петров
 id_15 Куликов
 id_16 Иванова
 id_254 Соколова
 id_145 Павлов
 id_165 Забавин
 id_1 Петров
 id_7 Иванова
 id_99 Забавин
 */
public class Students {
    static Map<String, String> students = new HashMap<>();

    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("C:\\Users\\Полина\\IdeaProjects\\HashMap\\src\\ids.txt"));
            while (file.hasNext()) {
                String[] line = file.nextLine().split(" ");
                students.put(line[0], line[1]);
                // System.out.println(students.get(line[0]));
            }
            file.close();
            Scanner console = new Scanner(System.in);
            String keyForSearch = console.nextLine();
            console.close();
            String fam = extractName(keyForSearch);
            System.out.println(fam);
            // System.out.println(extractName(keyForSearch));

        } catch (FileNotFoundException | InvalidStudentId e) {
            e.printStackTrace();
        }
    }

    /**
     * Метод, который по ключу (идентификатору студента) вернёт фамилию студента
     * @param key идентификатор студента
     * @return фамилия студента
     */
    public static String extractName(String key) throws InvalidStudentId {
        String studentName = students.get(key);
        if (studentName == null) throw new InvalidStudentId();
        else return "Student with " + key + " is " + students.get(key);
    }
}

class InvalidStudentId extends Exception {
    @Override
    public String toString() {
        return "incorrect student id";
    }
}