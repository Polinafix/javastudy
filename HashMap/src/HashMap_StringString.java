import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/**
 * Created by Полина on 12.04.2015.
 */
public class HashMap_StringString {
    public static void main(String[] args) {
        HashMap<String, String> fruit = new HashMap<>();
        // содержит ли строка пустое значение, если fruit - String
        if (fruit.isEmpty()) { // проверяет, пустая ли структура
            System.out.println();
            System.out.println("Пусто");
        }
        //put(K key, V value)Добавляет и связывает указанный ключ указанному значению в этой карте.
        fruit.put("1", "яблоко");
        fruit.put("2", "банан");
        fruit.put("3", "апельсин");
        fruit.put("4", "киви");
        //проверяет, пустая ли структура
        System.out.println();
        System.out.println(fruit.isEmpty()); // false
        //get(Object key) Возвращает значение, которое указанный ключ отображает
        String a = fruit.get("3");
        //выводим на печать значение, которое указанный ключ отображает
        System.out.println();
        System.out.println(a);
        // Set<K> keySet() Возвращает представление карты в виде множества всех ключей.
        Set<String> keys = fruit.keySet(); // Set - хранит только уникальные значения, при попытке добавить дубль - игнор дубля
        for (String key : keys) {
            System.out.println(key);
        }
        //booleancontainsKey(Objectkey) – Возвращает значение true, если в карте имеется указанный ключ.
        if (fruit.containsKey("2")) {
            System.out.println();
            System.out.println("2 was found");
        }
        //booleancontainsValue(Objectvalue) – Возвращает значение true, если в карте имеется указанное значение.
        if (fruit.containsValue("яблоко")) {
            System.out.println();
            System.out.println("яблоко найдено");
        }
        //size() возвращает число элементов карты.
        System.out.println();
        System.out.println(fruit.size());

        //Collection<V> values() – Возвращает представление карты в виде множества всех значений.
        Collection<String> values = fruit.values(); // может содержать дубли
        for (String value : values) {
            System.out.println(value);
        }
        //getOrDefault(Object key, V defaultValue) Возвращает значение,к кот указанный ключ обращается,
        // или defaultValue если эта карта не содержит значения для ключа.???
        String result = fruit.getOrDefault("1", "по-умолчанию"); // запись с ключом "1" существует, вернёт "яблоко"
        String noresult = fruit.getOrDefault("7", "по-умолчанию"); // записи с ключом "7" не существует, вернёт "по-умолчанию"

        System.out.println();
        System.out.println(result);
        System.out.println(noresult);

        //putIfAbsent(K key, V value) -связывает значение с ключом, если такой ключ еще не используется
        System.out.println("63" + fruit.put("9", "мандарин"));
        System.out.println("64" + fruit.put("9", "мандарин1"));
        System.out.println("64" + fruit.put("9", null));

        System.out.println("66" + fruit.putIfAbsent("10", "мандарин"));
        System.out.println("67" + fruit.putIfAbsent("10", "мандарин"));
        String value = fruit.get("9");
        System.out.println();
        System.out.println(value);

        // проверка на наличие в карте ключа/значения
        System.out.println(fruit.containsKey("9")); // true
        System.out.println(fruit.containsKey("77")); // false
        System.out.println(fruit.containsValue("мандарин")); // true
        System.out.println(fruit.containsValue("9")); // false

        // удаление элемента из карты (по ключу, по ключу и значению, если оно совпадёт с имеющимся
        System.out.println(fruit);
        System.out.println("to remove: " + fruit.remove("10"));
        System.out.println(fruit);
        System.out.println(fruit.remove("1", "яблока нет")); // false
        System.out.println(fruit);
        System.out.println(fruit.remove("1", "яблоко")); // true
        System.out.println(fruit);

        // замена значений в карте
        System.out.println(fruit.replace("9", "мандарин")); // вывел то, что было по ключу до замены
        System.out.println(fruit);
        System.out.println(fruit.replace("9", null, "мандарин")); // false потому, что по ключу "9" уже хранится не null, а "мандарин"
        System.out.println(fruit);
        System.out.println(fruit.replace("9", "мандарин", "мандарин1")); // true
        System.out.println(fruit);


    }
}
