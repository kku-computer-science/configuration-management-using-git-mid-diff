package main;

import java.util.ArrayList;

public class QuickSort {
	public static ArrayList<Integer> quickSort(ArrayList<Integer> list) {
        if (list.size() <= 1) {
            return list;
        }

        int pivot = list.get(list.size() / 2);
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        ArrayList<Integer> equal = new ArrayList<>();

        for (int num : list) {
            if (num < pivot) {
                left.add(num);
            } else if (num > pivot) {
                right.add(num);
            } else {
                equal.add(num);
            }
        }

        ArrayList<Integer> sorted = new ArrayList<>();
        sorted.addAll(quickSort(left));
        sorted.addAll(equal);
        sorted.addAll(quickSort(right));

        return sorted;
    }

}
