import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Полина on 04.03.2015.
 */
public class HoursTest {
    @Test
    public void testAction(){
        Assert.assertEquals("2:30", Hours.action("150"));
        Assert.assertEquals("0:1", Hours.action("1441"));
        Assert.assertEquals("20:33", Hours.action("5553"));
    }

}
