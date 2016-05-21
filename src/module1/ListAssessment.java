package module1;

import java.util.ArrayList;


public class ListAssessment {
    public int averageTime(ArrayList<Long> array) {
        int result;
        int sum = 0;
        for (Long i : array) {
            sum += i;
        }
        result = sum / array.size();
        return result;
    }

    public long addAssessment(int[] array) {

        long start = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.random();
        }
        long stop = System.currentTimeMillis();
        long timeResult = stop - start;
        return timeResult;

    }

}
