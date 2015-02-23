/**
 * Created by Полина on 01.02.2015.
 */
public class Main {
    private static String field1;
    public String field2;
    String field3;

    public static void main(String[] args) {
//        method1();
        Main myMain = new Main();
//        myMain.method2();
//        myMain.method2("overloading");
//        myMain.method2("other");

        String str = myMain.method3();
        System.out.printf(str);
        field1 = "asdf";
        System.out.printf(myMain.field1);
    }

    public static void method1() {
        System.out.println("method1");
    }

    public void method2() {
        System.out.println("method2");
    }

    public void method2(String flag) {
        System.out.println("method2 " + flag);
    }

    public String method3() {
        System.out.println("method3");
        return "returned string";
    }
    /*
    private
    protected
    public
    package-private
    */
}
