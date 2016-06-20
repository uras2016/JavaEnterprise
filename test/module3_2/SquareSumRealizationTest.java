package module3_2;

import org.junit.Test;

public class SquareSumRealizationTest {
SquareSumRealization square = new SquareSumRealization();
    @Test
    public void testGetSquareSumFirst() throws Exception {
        int[] value = new int[10];

        for (int i = 0; i < value.length; i++) {
            value[i] = i;
        }


        System.out.println(square.getSquareSumFirst(value));
    }

    @Test
    public void testGetSquareSumSecond() throws Exception {


        int[] value = new int[10];

        for (int i = 0; i < value.length; i++) {
            value[i] = i;
        }


        System.out.println(square.getSquareSumSecond(value));
    }
}