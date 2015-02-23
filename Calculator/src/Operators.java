/**
 * Created by Полина on 22.02.2015.
 */
public enum Operators {
    a("+"), s("-"), m("*"), d(":");

    final String sign;

    Operators(String s) {
        sign = s;
    }
}
