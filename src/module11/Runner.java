package module11;

import java.util.ArrayList;
import java.util.LinkedList;


public class Runner extends MethodsForList {


    public void runner() {

        ArrayList<Integer> array10k = new ArrayList<Integer>();
        ArrayList<Integer> array100k = new ArrayList<Integer>();
        ArrayList<Integer> array1000k = new ArrayList<Integer>();

        LinkedList<Integer> linked10k = new LinkedList<Integer>();
        LinkedList<Integer> linked100k= new LinkedList<Integer>();
        LinkedList<Integer> linked1000k = new LinkedList<Integer>();

        String timeForPopulate10 = Long.toString(getAverageTimeForPopulate(array10k, SIZE1));
        String timeForPopulate100 = Long.toString(getAverageTimeForPopulate(array100k, SIZE2));
        String timeForPopulate1000 = Long.toString(getAverageTimeForPopulate(array1000k, SIZE3));

        String timeForAdd10 = Long.toString(getAverageTimeForAdd(array10k));
        String timeForAdd100 = Long.toString(getAverageTimeForAdd(array100k));
        String timeForAdd1000 = Long.toString(getAverageTimeForAdd(array1000k));

        String timeForGet10 = Long.toString(getAverageTimeForGet(array10k));
        String timeForGet100 = Long.toString(getAverageTimeForGet(array100k));
        String timeForGet1000 = Long.toString(getAverageTimeForGet(array1000k));

        String timeForContains10 = Long.toString(getAverageTimeForContains(array10k));
        String timeForContains100 = Long.toString(getAverageTimeForContains(array100k));
        String timeForContains1000 = Long.toString(getAverageTimeForContains(array100k));

        String timeForRemove10 = Long.toString(getAverageTimeForRemove(array10k));
        String timeForRemove100 = Long.toString(getAverageTimeForRemove(array100k));
        String timeForRemove1000 = Long.toString(getAverageTimeForRemove(array1000k));









    }
}
