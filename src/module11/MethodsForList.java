package module11;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class MethodsForList implements Collections{

    ArrayList<Long> averageTimeRecords;


    @Override
    public long getAverageTimeForPopulate(List<Integer> list, int size){
        averageTimeRecords = new ArrayList<Long>();
        long result =0;
        for (int i = 0; i<REPETITION;i++) {
            list.clear();
            long startTime = System.nanoTime();
            for (int j=0; j<size;j++){
                list.add(j);
            }
            result = System.nanoTime() - startTime;
            averageTimeRecords.add(result);
        }

        return getAverageTime(averageTimeRecords);
    }

    @Override
    public long getAverageTimeForAdd(List<Integer> list) {
        averageTimeRecords = new ArrayList<Long>();
        long result =0;
        for (int i = 0; i<REPETITION;i++) {
            long startTime = System.nanoTime();
            list.add(list.size()/2, i);
            result = System.nanoTime() - startTime;
            averageTimeRecords.add(result);
        }

        return getAverageTime(averageTimeRecords);
    }

    @Override
    public long getAverageTimeForGet(List<Integer> list) {
        averageTimeRecords = new ArrayList<Long>();
        long result =0;
        for (int i = 0; i<REPETITION;i++) {
            long startTime = System.nanoTime();
            list.get(list.size() / 3);
            result = System.nanoTime() - startTime;
            averageTimeRecords.add(result);
        }

        return getAverageTime(averageTimeRecords);
    }

    @Override
    public long getAverageTimeForRemove(List<Integer> list) {
        averageTimeRecords = new ArrayList<Long>();
        long result =0;
        for (int i = 0; i<REPETITION;i++) {
            long startTime = System.nanoTime();
            list.remove(list.size()/5);
            result = System.nanoTime() - startTime;
            averageTimeRecords.add(result);
        }

        return getAverageTime(averageTimeRecords);
    }

    @Override
    public long getAverageTimeForContains(List<Integer> list) {
        averageTimeRecords = new ArrayList<Long>();
        long result =0;
        for (int i = 0; i<REPETITION;i++) {
            long startTime = System.nanoTime();
            list.contains(1000);
            result = System.nanoTime() - startTime;
            averageTimeRecords.add(result);
        }

        return getAverageTime(averageTimeRecords);
    }

    @Override
    public long getAverageTimeForIteratorAdd(List<Integer> list) {
        ListIterator<Integer> listIterator100 = list.listIterator();

        return 0;
    }

    @Override
    public long getAverageTimeForIteratorRemove() {
        return 0;
    }

    @Override
    public long getAverageTime(ArrayList<Long> list) {
        int result;
        int sum = 0;
        for (Long i : list) {
            sum += i;
        }
        result = sum / list.size();
        return result;
    }
}
