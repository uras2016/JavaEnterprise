package module3_2;

import org.junit.Assert;
import org.junit.Test;

public class SquareSumRealizationTest {
    SquareSumRealization square = new SquareSumRealization();

    @Test
    public void testGetSquareSumFirst() throws Exception {
    int[] value = {1,2,3,4,5,6,7,8,9,10};
        Long res = square.getSquareSum(value, 4);
        Assert.assertEquals(385, res, 0);
    }
}