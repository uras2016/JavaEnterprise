package module1.ArrayList;

import java.util.ArrayList;
import java.util.Random;


public class AssessmentMethods {

    public int averageTime(ArrayList<Integer> array) {
        int result;
        int sum = 0;
        for (Integer i : array) {
            sum += i;
        }
        result = sum / array.size();
        return result;
    }


    public ArrayList<Integer> add(ArrayList<Integer> array, int size){
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array.add(random.nextInt());
        }
        return array;
    }








    public long addForList(ArrayList<Integer> array) {

        long start = System.currentTimeMillis();
        for (int i = 0; i < array.size(); i++) {
            array.add((int) Math.random());
        }
        long stop = System.currentTimeMillis();
        long timeResult = stop - start;
        return timeResult;

    }
    public long getForList(ArrayList<Long> array) {

        long start = System.currentTimeMillis();
        for (int i = 0; i < array.size(); i++) {
            array.get(i);
        }
        long stop = System.currentTimeMillis();
        long timeResult = stop - start;
        return timeResult;

    }

}
