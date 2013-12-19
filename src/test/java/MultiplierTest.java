import org.junit.*;

/**
 * Created by georgevanburgh on 19/12/2013.
 */
public class MultiplierTest {
    @org.junit.Test
    public void testMul() throws Exception {
        Multiplier myMul = new Multiplier();
        junit.framework.Assert.assertEquals("10 x 5 should equal 50", 50, myMul.mul(10, 5));
    }
}
