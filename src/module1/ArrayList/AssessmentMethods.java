package module1.ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
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
//random.nextInt(1000)

    public ArrayList<Integer> addForArrayList(ArrayList<Integer> array, int size) {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array.add(i);
        }
        return array;
    }
    public LinkedList<Integer> addForLinkedList(LinkedList<Integer> array, int size) {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array.add(i);
        }
        return array;
    }




}