package sort;

public class MergeSort {
	private void merge(int[] list, int left, int mid, int right) {
		int[] mergeList = new int[list.length];
		int idxOfLeftSortList = left;
		int idxOfRightSortList = mid + 1;
		int idxOfList = left;

		while (idxOfLeftSortList <= mid && idxOfRightSortList <= right) {
			if (list[idxOfLeftSortList] <= list[idxOfRightSortList]) {
				mergeList[idxOfList++] = list[idxOfLeftSortList++];
			} else {
				mergeList[idxOfList++] = list[idxOfRightSortList++];
			}
		}

		if (idxOfLeftSortList > mid) {
			for (int i = idxOfRightSortList; i <= right; i++) {
				mergeList[idxOfList++] = list[i];
			}
		} else {
			for (int i = idxOfLeftSortList; i <= mid; i++) {
				mergeList[idxOfList++] = list[i];
			}
		}

		for (int i = left; i <= right; i++) {
			list[i] = mergeList[i];
		}

	}

	public void mergeSort(int[] list, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			mergeSort(list, left, mid);
			mergeSort(list, mid + 1, right);
			merge(list, left, mid, right);
		}
	}
}
