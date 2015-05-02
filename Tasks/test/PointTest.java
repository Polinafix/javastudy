import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by Полина on 19.04.2015.
 */
public class PointTest {
    @Test
    public void testQuarter() {
        Assert.assertEquals("Первая координатная четверть", new Point(1.0, 1.0).quarter());
        Assert.assertEquals("Вторая координатная четверть", new Point(-1.0, 1.0).quarter());
        Assert.assertEquals("Третья координатная четверть", new Point(-1.0, -1.0).quarter());
        Assert.assertEquals("Четвертая координатная четверть", new Point(1.0, -1.0).quarter());
        Assert.assertEquals("Начало координат", new Point(0.0, 0.0).quarter());
    }

    @Test
    public void testIsSimmetric()  {
        Assert.assertTrue(new Point(0, 0).isSimmetric(new Point(0, 0)));
        Assert.assertTrue(new Point(1, 1).isSimmetric(new Point(-1, -1)));
        Assert.assertFalse(new Point(1, 3).isSimmetric(new Point(-1, -1)));


    }
}
