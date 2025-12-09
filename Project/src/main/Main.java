package main;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("input number list: ");
        String input = sc.nextLine();

        String[] parts = input.split(" ");
        ArrayList<Integer> numbers = new ArrayList<>();
        for (String p : parts) {
            numbers.add(Integer.parseInt(p));
        }
        System.out.println("Choose sorting method:");
        System.out.println("1 = Bubble Sort");
        System.out.println("2 = Quick Sort");
        System.out.print("Choice: ");
        int choice = sc.nextInt(); 
        if (choice == 1) {
            BubbleSort bs = new BubbleSort();
			numbers = bs.bubbleSort(numbers);
            System.out.println("Result (Bubble Sort):");
        } else if (choice == 2) {
            numbers = QuickSort.quickSort(numbers);
            System.out.println("Result (Quick Sort):");
        } else {
            System.out.println("Invalid choice!");
        }
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        sc.close();
    }

}
