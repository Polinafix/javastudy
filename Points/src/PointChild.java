import java.io.IOException;

/**
 * Created by Полина on 02.05.2015.
 */
public class PointChild extends Point {

    public PointChild(double a, double b) {
        super(a, b);
    }

    public PointChild(int i) throws IOException {
        super(i);
    }

    @Override
    public String quarter() {
        return "override from child. " + super.quarter(); // вызов метода из родительского класса
    }

    public String quarter(String msg) {
        return "String... msg: " + msg;
    }

    public String quarter(String... msg) {
        return "String... msg: " + msg;
    }

    public String quarter(Integer msg) {
        return "Integer msg";
    }

    public String quarter(Integer... msg) {
        String result = "Integer... msg: len:" + msg.length;
        for (Integer num : msg) {
            result += "; " + num;
        }
        return result;
    }

    public String quarter(String s, Integer... msg) {
        return "String s, Integer... msg";
    }

    @Override
    public int hashCode() { // ChildPoint -> Point -> Object
        return 999;
    }
    public int hashCode(int a) { // overloading
        return 999;
    }



    public static void main(String[] args) {
        PointChild p = new PointChild(1, 2);
        System.out.println(p.quarter());
        System.out.println(p.quarter("string"));
        System.out.println(p.quarter("string", "string"));
        System.out.println(p.quarter(12));
        System.out.println(p.quarter(12, 14));
        System.out.println(p.quarter(12, 14, 16, 17));
        System.out.println(p.quarter("string", 12, 14, 16, 17));

        Point a = new Point(0, 0);
        System.out.println(a.quarter());
    }

    // invalid overloading
/*    public String quarter(String... s, Integer... msg) {
        return "Integer... msg";
    }

    public String quarter(String... s, Integer msg) {
        return "Integer... msg";
    }*/

}
