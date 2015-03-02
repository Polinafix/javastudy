import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Полина on 01.03.2015.
 */
public class OperatorsTest {
    @Test
    public void testContains() {
        Assert.assertEquals(true, Operators.contains("a"));
        Assert.assertTrue(Operators.contains("m"));
        Assert.assertEquals(true, Operators.contains("s"));
        Assert.assertEquals(true, Operators.contains("d"));
        Assert.assertFalse(Operators.contains("n"));
        Assert.assertEquals(false, Operators.contains(""));
        Assert.assertEquals(false, Operators.contains("asdf"));
    }
}
