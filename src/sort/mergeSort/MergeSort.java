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

		divideAndMerge(ints, left, middle, sorted); // ���� divide recursion
		divideAndMerge(ints, middle + 1, right, sorted); // ���� divide recursion
		merge(ints, left, middle, right, sorted); // ����

	}

	private static void merge(int[] ints, int left, int middle, int right, int[] sorted) {
		System.out.println("merge(array," + left + "," + middle + "," + right + ")");

		// l (left ~ middle)
		int l = left;

		// r (middle+1 ~ right)
		int r = middle + 1;

		// ���� ���� sorted�迭�� index��°�� �߰�
		int index = left;

		// l,r ���� �ϳ��� ���� ������ ������ �ʰ��ϸ� while Ż��
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

		if (l > middle) { // left�κ��� ���� ä���� ��� right�� ���� �͵��� sort�� �迭�� ��� ä���.
			while (r <= right) { // r�� right+1�� �Ǹ� �ߴ�
				sorted[index] = ints[r];
				index++;
				r++;
			}
		} else { // right�κ��� ���� ä���� ��� left�� ���� �͵��� sort�� �迭�� ��� ä���.
			while (l <= middle) { // l�� middle+1�� �Ǹ� �ߴ�
				sorted[index] = ints[l];
				index++;
				l++;
			}
		}

		System.out.println("���� �߰� ���");
		SortUtil.printIntArray(sorted);

		for (int i = left; i <= right; i++) {
			ints[i] = sorted[i];
		}

		System.out.println("���� ����� ������ �ű�");
		SortUtil.printIntArray(ints);

	}

}