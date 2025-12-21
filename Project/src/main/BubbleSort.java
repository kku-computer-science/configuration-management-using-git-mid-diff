package main;

import java.util.ArrayList;

public class BubbleSort {
	public ArrayList<Integer> bubbleSort(ArrayList<Integer> intArray) {
		Integer temp;
		ArrayList<Integer> sortedList = new ArrayList<>(intArray);
		for (int i = 0; i < sortedList.size()-1; i++) {
			
			for(int j = 0; j < sortedList.size()-i-1; j++) {
				
				if(sortedList.get(j) > sortedList.get(j+1)) {
					temp = sortedList.get(j);
					sortedList.set(j, sortedList.get(j+1));
					sortedList.set(j+1, temp);
				}
			}
		}
		return sortedList;
	}
}

