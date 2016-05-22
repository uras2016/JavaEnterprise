package module1.ArrayList;

import java.util.ArrayList;
import java.util.Random;


public class Runner {
    public static void main(String[] args) {

        final int SIZE1 = 10000;
        final int SIZE2 = 100000;
        final int SIZE3 = 1000000;

        AssessmentMethods assessmentMethods = new AssessmentMethods();


        ArrayList<Integer> add10000 = new ArrayList<Integer>();
        ArrayList<Integer> add100000 = new ArrayList<Integer>();
        ArrayList<Integer> add1000000 = new ArrayList<Integer>();

        //записываем замеры времени
        ArrayList<Integer> timeResult1 = new ArrayList<Integer>();
        ArrayList<Integer> timeResult2 = new ArrayList<Integer>();
        ArrayList<Integer> timeResult3 = new ArrayList<Integer>();

        for (int i = 0; i < 100; i++) {
            int start = (int) System.nanoTime();
            assessmentMethods.add(add10000, SIZE1);
            int stop = (int) System.nanoTime();
            int timeResult = stop - start;
            timeResult1.add(timeResult);
        }
        int averageResult10000 = assessmentMethods.averageTime(timeResult1);

        for (int i = 0; i < 100; i++) {
            int start = (int) System.nanoTime();
            assessmentMethods.add(add100000, SIZE2);
            int stop = (int) System.nanoTime();
            int timeResult = stop - start;
            timeResult2.add(timeResult);
        }
        int averageResult100000 = assessmentMethods.averageTime(timeResult2);

//        for (int i = 0; i < 100; i++) {
//            int start = (int) System.currentTimeMillis();
//            assessmentMethods.add(add1000000, SIZE3);
//            int stop = (int) System.currentTimeMillis();
//            int timeResult = stop - start;
//            timeResult3.add(timeResult);
//        }
//        int averageResult1000000 = assessmentMethods.averageTime(timeResult3);

    }


}

