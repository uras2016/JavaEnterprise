package module1;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.ListIterator;


public class HashSets{

    public static void hashSet() {
        final int SIZE1 = 10000;
        final int SIZE2 = 100000;
        final int SIZE3 = 1000000;

        HashSet<Integer> hashSet = new HashSet<Integer>();

        AssessmentMethods assessmentMethods = new AssessmentMethods();

        HashSet<Integer> add10000 = new HashSet<Integer>();
        HashSet<Integer> add100000 = new HashSet<Integer>();
        HashSet<Integer> add1000000 = new HashSet<Integer>();

        //записываем замеры времени. Списки чистим перед запусом нового метода для их повтороного использования
        ArrayList<Integer> timeResult1 = new ArrayList<Integer>();
        ArrayList<Integer> timeResult2 = new ArrayList<Integer>();
        ArrayList<Integer> timeResult3 = new ArrayList<Integer>();


        for (int i = 0; i < 100; i++) {
            int start = (int) System.currentTimeMillis();
            assessmentMethods.addForHashSet(add10000, SIZE1);
            int stop = (int) System.currentTimeMillis();
            int timeResult = stop - start;
            timeResult1.add(timeResult);
        }
        int averageResultForAdd10000 = assessmentMethods.averageTime(timeResult1);

        for (int i = 0; i < 100; i++) {
            int start = (int) System.currentTimeMillis();
            assessmentMethods.addForHashSet(add100000, SIZE2);
            int stop = (int) System.currentTimeMillis();
            int timeResult = stop - start;
            timeResult2.add(timeResult);
        }
        int averageResultForAdd100000 = assessmentMethods.averageTime(timeResult2);

        for (int i = 0; i < 100; i++) {
            int start = (int) System.currentTimeMillis();
            assessmentMethods.addForHashSet(add1000000, SIZE3);
            int stop = (int) System.currentTimeMillis();
            int timeResult = stop - start;
            timeResult3.add(timeResult);
        }
        int averageResultForAdd1000000 = assessmentMethods.averageTime(timeResult3);


        timeResult1.clear();
        timeResult2.clear();
        timeResult3.clear();

        for (int i = 0; i < 100; i++) {
            int start = (int) System.currentTimeMillis();
            for (Integer j : add10000)
                add10000.iterator().next();
            int stop = (int) System.currentTimeMillis();
            int timeResult = stop - start;
            timeResult1.add(timeResult);
        }
        int averageResultForGet10000 = assessmentMethods.averageTime(timeResult1);


        for (int i = 0; i < 100; i++) {
            int start = (int) System.currentTimeMillis();
            for (Integer j : add100000)
                add10000.iterator().next();
            int stop = (int) System.currentTimeMillis();
            int timeResult = stop - start;
            timeResult2.add(timeResult);
        }
        int averageResultForGet100000 = assessmentMethods.averageTime(timeResult2);


        for (int i = 0; i < 100; i++) {
            int start = (int) System.currentTimeMillis();
            for (Integer j : add1000000)
                add10000.iterator().next();
            int stop = (int) System.currentTimeMillis();
            int timeResult = stop - start;
            timeResult3.add(timeResult);
        }
        int averageResultForGet1000000 = assessmentMethods.averageTime(timeResult3);
        timeResult1.clear();
        timeResult2.clear();
        timeResult3.clear();

        for (int i = 0; i < 100; i++) {
            int start = (int) System.currentTimeMillis();
            for (int j = 0; j < add10000.size(); j++)
                add10000.remove(j);
            int stop = (int) System.currentTimeMillis();
            int timeResult = stop - start;
            timeResult1.add(timeResult);
        }
        int averageResultForRemove10000 = assessmentMethods.averageTime(timeResult1);


        for (int i = 0; i < 100; i++) {
            int start = (int) System.currentTimeMillis();
            for (int j = 0; j < add100000.size(); j++)
                add100000.remove(j);
            int stop = (int) System.currentTimeMillis();
            int timeResult = stop - start;
            timeResult2.add(timeResult);
        }
        int averageResultForRemove100000 = assessmentMethods.averageTime(timeResult2);


        for (int i = 0; i < 100; i++) {
            int start = (int) System.currentTimeMillis();
            for (int j = 0; j < add1000000.size(); j++)
                add1000000.remove(j);
            int stop = (int) System.currentTimeMillis();
            int timeResult = stop - start;
            timeResult3.add(timeResult);
        }
        int averageResultForRemove1000000 = assessmentMethods.averageTime(timeResult3);
        timeResult1.clear();
        timeResult2.clear();
        timeResult3.clear();

        for (int i = 0; i < 100; i++) {
            int start = (int) System.currentTimeMillis();
            for (int j = 0; j < add10000.size(); j++)
                add10000.contains(00);
            int stop = (int) System.currentTimeMillis();
            int timeResult = stop - start;
            timeResult1.add(timeResult);
        }
        int averageResultForContains10000 = assessmentMethods.averageTime(timeResult1);

        for (int i = 0; i < 100; i++) {
            int start = (int) System.currentTimeMillis();
            for (int j = 0; j < add100000.size(); j++)
                add100000.contains(00);
            int stop = (int) System.currentTimeMillis();
            int timeResult = stop - start;
            timeResult2.add(timeResult);
        }
        int averageResultForContains100000 = assessmentMethods.averageTime(timeResult2);

        for (int i = 0; i < 100; i++) {
            int start = (int) System.currentTimeMillis();
            for (int j = 0; j < add1000000.size(); j++)
                add1000000.contains(00);
            int stop = (int) System.currentTimeMillis();
            int timeResult = stop - start;
            timeResult3.add(timeResult);
        }
        int averageResultForContains1000000 = assessmentMethods.averageTime(timeResult3);


        System.out.printf(
                averageResultForAdd10000 + " " + averageResultForAdd100000 + " " + averageResultForAdd1000000 + " " +
                        averageResultForGet10000 + " " + averageResultForGet100000 + " " + averageResultForGet1000000 + " " +
                        averageResultForRemove10000 + " " + averageResultForRemove100000 + " " + averageResultForRemove1000000 + " " +
                        averageResultForContains10000 + " " + averageResultForContains100000 + " " + averageResultForContains1000000);

    }

}

