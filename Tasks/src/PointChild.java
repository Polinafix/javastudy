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
        return "override from child";
    }

}
