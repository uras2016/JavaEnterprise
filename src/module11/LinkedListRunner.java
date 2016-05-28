package module11;

import java.util.LinkedList;

public class LinkedListRunner  extends Methods {
    public void runner() {
        LinkedList<Integer> linked10k = new LinkedList<Integer>();
        LinkedList<Integer> linked100k= new LinkedList<Integer>();
        LinkedList<Integer> linked1000k = new LinkedList<Integer>();

        String timeForPopulate10 = Long.toString(getAverageTimeForPopulate(linked10k, SIZE1));
        String timeForPopulate100 = Long.toString(getAverageTimeForPopulate(linked100k, SIZE2));
        String timeForPopulate1000 = Long.toString(getAverageTimeForPopulate(linked1000k, SIZE3));

        String timeForAdd10 = Long.toString(getAverageTimeForAdd(linked10k));
        String timeForAdd100 = Long.toString(getAverageTimeForAdd(linked100k));
        String timeForAdd1000 = Long.toString(getAverageTimeForAdd(linked1000k));

        String timeForGet10 = Long.toString(getAverageTimeForGet(linked10k));
        String timeForGet100 = Long.toString(getAverageTimeForGet(linked100k));
        String timeForGet1000 = Long.toString(getAverageTimeForGet(linked1000k));

        String timeForContains10 = Long.toString(getAverageTimeForContains(linked10k));
        String timeForContains100 = Long.toString(getAverageTimeForContains(linked100k));
        String timeForContains1000 = Long.toString(getAverageTimeForContains(linked100k));

        String timeForRemove10 = Long.toString(getAverageTimeForRemove(linked10k));
        String timeForRemove100 = Long.toString(getAverageTimeForRemove(linked100k));
        String timeForRemove1000 = Long.toString(getAverageTimeForRemove(linked1000k));

        String timeForIteratorAdd10 = Long.toString(getAverageTimeForIteratorAdd(linked10k));
        String timeForIteratorAdd100 = Long.toString(getAverageTimeForIteratorAdd(linked100k));
        String timeForIteratorAdd1000 = Long.toString(getAverageTimeForIteratorAdd(linked1000k));

        String timeForIteratorRemove10 = Long.toString(getAverageTimeForIteratorRemove(linked10k));
        String timeForIteratorRemove100 = Long.toString(getAverageTimeForIteratorRemove(linked100k));
        String timeForIteratorRemove1000 = Long.toString(getAverageTimeForIteratorRemove(linked1000k));


        System.out.println(timeForAdd10 +" "+ timeForGet10 +" "+ timeForRemove10 +" "+ timeForContains10 +" "+ timeForPopulate10 +" "+ timeForIteratorAdd10 +" "+ timeForIteratorRemove10);

    }
}
