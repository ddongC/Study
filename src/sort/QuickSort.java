package sort;

/**
 * Time complexity
 * Best case: O(nlogn) or O(n)
 * Worst case: O(n^2)
 * Average case: O(nlogn)
 *
 * 속도가 빠름, 추가 메모리 공간 불필요
 * 이미 정렬된 리스트에 대해서는 수행시간 오래걸림
 * -> 불균형 분할 방지하기 위해 pivot을 중간 값으로 ㅅ너택(median of three)
 */
public class QuickSort {

	private int getPivot(int[] list, int left, int right) {
		int pivot = list[left];
		int low = left + 1;
		int high = right;

		while (low < high) {
			while (list[low] < pivot && low < right) {
				low++;
			}
			while (list[high] > pivot && high > left + 1) {
				high--;
			}

			if (low < high) {
				int tmp = list[low];
				list[low] = list[high];
				list[high] = tmp;
			}
		}
		int tmp = list[left];
		list[left] = list[high];
		list[high] = tmp;

		return high;
	}

	public void quickSort(int[] list, int left, int right) {
		if (left < right) {
			int pivot = getPivot(list, left, right);
			quickSort(list, left, pivot - 1);
			quickSort(list, pivot + 1, right);
		}
	}
}
