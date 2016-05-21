package module1;

import java.util.ArrayList;


public class Runner {
    public static void main(String[] args) {

        ListAssessment listAssessment = new ListAssessment();

        ArrayList<Long> resultsFor10000 = new ArrayList<Long>();
        ArrayList<Long> resultsFor100000 = new ArrayList<Long>();
        ArrayList<Long> resultsFor1000000 = new ArrayList<Long>();

        int[] array1 = new int[10000];

        for (int i = 0; i < 100; i++) {
            resultsFor10000.add(listAssessment.addAssessment(array1));
        }
        long averageTimeFor10000 = listAssessment.averageTime(resultsFor10000);


        int[] array2 = new int[100000];
        for (int i = 0; i < 100; i++) {
            resultsFor100000.add(listAssessment.addAssessment(array2));
        }
        long averageTimeFor100000 = listAssessment.averageTime(resultsFor100000);


        int[] array3 = new int[1000000];
        for (int i = 0; i < 100; i++) {
            resultsFor1000000.add(listAssessment.addAssessment(array3));
        }
        long averageTimeFor1000000 = listAssessment.averageTime(resultsFor1000000);

        System.out.println(averageTimeFor10000+" "+averageTimeFor100000+" "+averageTimeFor1000000);
    }

}
