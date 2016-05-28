package module11;


public class ArrayListRunner extends Methods {


    public void runner() {

        java.util.ArrayList<Integer> array10k = new java.util.ArrayList<Integer>();
        java.util.ArrayList<Integer> array100k = new java.util.ArrayList<Integer>();
        java.util.ArrayList<Integer> array1000k = new java.util.ArrayList<Integer>();



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

        String timeForIteratorAdd10 = Long.toString(getAverageTimeForIteratorAdd(array10k));
        String timeForIteratorAdd100 = Long.toString(getAverageTimeForIteratorAdd(array100k));
        String timeForIteratorAdd1000 = Long.toString(getAverageTimeForIteratorAdd(array1000k));

        String timeForIteratorRemove10 = Long.toString(getAverageTimeForIteratorRemove(array10k));
        String timeForIteratorRemove100 = Long.toString(getAverageTimeForIteratorRemove(array100k));
        String timeForIteratorRemove1000 = Long.toString(getAverageTimeForIteratorRemove(array1000k));


        System.out.println(timeForAdd10 +" "+ timeForGet10 +" "+ timeForRemove10 +" "+ timeForContains10 +" "+ timeForPopulate10 +" "+ timeForIteratorAdd10 +" "+ timeForIteratorRemove10);




    }
}
