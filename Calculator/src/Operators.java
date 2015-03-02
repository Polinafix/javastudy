/**
 * Created by Полина on 22.02.2015.
 */
public enum Operators {
    a("+"), s("-"), m("*"), d(":");

    final String sign;

    Operators(String s) {
        sign = s;
    }

    public static boolean contains(String o) {
        for (Operators op : Operators.values()) {
            if (op.toString().equals(o)) return true;
        }
        return false;
    }

    // TODO implement parsing method for operator from string (user input)
}


class TryEnum {
    public static void main(String[] args) {
        System.out.println(Operators.values());
        for (Operators op : Operators.values()) {
            System.out.println(op);
        }
        Operators[] ops = Operators.values();
        for (int i = 0; i < ops.length; i++) {
            System.out.println(ops[i]);
        }
        System.out.println(Operators.a);
        System.out.println(Operators.a.sign); // +
        System.out.println(Operators.valueOf("a"));
        System.out.println(Operators.valueOf("a").sign); // +
        System.out.println(Operators.valueOf("asd").sign);
    }
}