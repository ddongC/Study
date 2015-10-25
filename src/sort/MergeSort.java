package sort;

/**
 * Time complexity
 * Best case: O(nlogn) or O(n)
 * Worst case: O(nlogn)
 * Average case: O(nlogn)
 *
 * 장점: 데이터의 분포에 영향을 덜 받음 -> 최선, 평균, 최악의 시간복잡도가 같음
 * 단점: 임시 배열이 필요함 -> 레코드들의 크기가 큰 경우 시간 낭비
 * -> 레코드를 연결 리스트로 구성하여 합병 정렬시 링크 인덱스만 변경
 */
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
