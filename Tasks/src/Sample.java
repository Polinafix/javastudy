/**
 * Created by Полина on 02.05.2015.
 */
public class Sample{
    static Object o = new Object();
    static Object o1 = new Object();

    public static void main(String[] args) {
        System.out.println(o.equals(o1));

        Point p = new Point(1, 0);
        Point p1 = new Point(1, 0);
        System.out.println(p.equals(p1));
        System.out.println(p.quarter());

        PointChild pc = new PointChild(1, 1);
        System.out.println(pc.quarter());
    }

}
