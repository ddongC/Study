package sort.test;

import sort.BubbleSort;
import sort.MergeSort;
import sort.QuickSort;

public class SortTest {
	public static void listPrint(int[] list) {
		for (int item : list) {
			System.out.print(item + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		QuickSort qs = new QuickSort();
		MergeSort ms = new MergeSort();
		BubbleSort bs = new BubbleSort();

		int[] list = { 5, 1, 3, 4, 10, 6, 6, 7, 8 };

		listPrint(list);
		//		qs.quickSort(list, 0, list.length - 1);
		//ms.mergeSort(list, 0, list.length - 1);
		bs.bubbleSort(list);
		listPrint(list);
	}

}
