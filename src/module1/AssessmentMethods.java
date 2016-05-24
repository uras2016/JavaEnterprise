package module1;

import java.util.ArrayList;

import java.util.HashSet;
import java.util.LinkedList;


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


    public ArrayList<Integer> addForArrayList(ArrayList<Integer> array, int size) {

        for (int i = 0; i < size; i++) {
            array.add(i);
        }
        return array;
    }
    public LinkedList<Integer> addForLinkedList(LinkedList<Integer> array, int size) {

        for (int i = 0; i < size; i++) {
            array.add(i);
        }
        return array;
    }

    public HashSet<Integer> addForHashSet(HashSet<Integer> set, int size) {

        for (int i = 0; i < size; i++) {
            set.add(i);
        }
        return set;
    }



}