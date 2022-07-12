package sort.mergeSort;

import sort.common.SortUtil;

public class MergeSort {

	public static int[] mergeSort(int[] ints) {
		int[] sorted = new int[ints.length];
		divideAndMerge(ints, 0, ints.length - 1, sorted);
		sorted = null;
		return ints;
	}

	private static void divideAndMerge(int[] ints, int left, int right, int[] sorted) {
		System.out.println("divideAndMerge(array," + left + "," + right + ");");

		if (left == right) {
			return;
		}

		int middle = (left + right) / 2;

		divideAndMerge(ints, left, middle, sorted); // 좌측 divide recursion
		divideAndMerge(ints, middle + 1, right, sorted); // 우측 divide recursion
		merge(ints, left, middle, right, sorted); // 정렬

	}

	private static void merge(int[] ints, int left, int middle, int right, int[] sorted) {
		System.out.println("merge(array," + left + "," + middle + "," + right + ")");

		// l (left ~ middle)
		int l = left;

		// r (middle+1 ~ right)
		int r = middle + 1;

		// 비교한 값을 sorted배열의 index번째에 추가
		int index = left;

		// l,r 둘중 하나라도 먼저 각자의 범위를 초과하면 while 탈출
		while (l <= middle && r <= right) {
			if (ints[l] <= ints[r]) {
				sorted[index] = ints[l];
				l++;
			} else {
				sorted[index] = ints[r];
				r++;
			}
			index++;
		}

		if (l > middle) { // left부분이 먼저 채워진 경우 right에 남은 것들을 sort될 배열에 모두 채운다.
			while (r <= right) { // r이 right+1이 되면 중단
				sorted[index] = ints[r];
				index++;
				r++;
			}
		} else { // right부분이 먼저 채워진 경우 left에 남은 것들을 sort될 배열에 모두 채운다.
			while (l <= middle) { // l이 middle+1이 되면 중단
				sorted[index] = ints[l];
				index++;
				l++;
			}
		}

		System.out.println("정렬 중간 결과");
		SortUtil.printIntArray(sorted);

		for (int i = left; i <= right; i++) {
			ints[i] = sorted[i];
		}

		System.out.println("정렬 결과를 원본에 옮김");
		SortUtil.printIntArray(ints);

	}

}