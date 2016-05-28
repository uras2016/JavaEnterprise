package module1;

import java.util.HashSet;

public class HashSetRunner extends Methods {
    public void runner() {

        HashSet<Integer> hash10k = new HashSet<Integer>();
        HashSet<Integer> hash100k = new HashSet<Integer>();
        HashSet<Integer> hash1000k = new HashSet<Integer>();

        String timeForPopulate10 = Long.toString(getAverageTimeForPopulate(hash10k, SIZE1));
        String timeForPopulate100 = Long.toString(getAverageTimeForPopulate(hash100k, SIZE2));
        String timeForPopulate1000 = Long.toString(getAverageTimeForPopulate(hash1000k, SIZE3));

        String timeForAdd10 = Long.toString(getAverageTimeForAdd(hash10k));
        String timeForAdd100 = Long.toString(getAverageTimeForAdd(hash100k));
        String timeForAdd1000 = Long.toString(getAverageTimeForAdd(hash1000k));

        String timeForGet10 = Long.toString(getAverageTimeForGet(hash10k));
        String timeForGet100 = Long.toString(getAverageTimeForGet(hash100k));
        String timeForGet1000 = Long.toString(getAverageTimeForGet(hash1000k));

        String timeForContains10 = Long.toString(getAverageTimeForContains(hash10k));
        String timeForContains100 = Long.toString(getAverageTimeForContains(hash100k));
        String timeForContains1000 = Long.toString(getAverageTimeForContains(hash100k));

        String timeForRemove10 = Long.toString(getAverageTimeForRemove(hash10k));
        String timeForRemove100 = Long.toString(getAverageTimeForRemove(hash100k));
        String timeForRemove1000 = Long.toString(getAverageTimeForRemove(hash1000k));

        System.out.println(timeForAdd10 +" "+ timeForGet10 +" "+ timeForRemove10 +" "+ timeForContains10 +" "+ timeForPopulate10);
    }
}
