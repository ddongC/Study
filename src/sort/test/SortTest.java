package sort.test;

import sort.QuickSort;

public class SortTest {
	public static void listPrint(int[] list) {
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		QuickSort qs = new QuickSort();

		int[] list = { 5, 1, 3, 4, 10, 6, 6, 7, 8 };

		listPrint(list);
		qs.quickSort(list, 0, list.length - 1);
		listPrint(list);
	}

}
