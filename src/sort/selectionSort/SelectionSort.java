package sort.selectionSort;

import sort.common.SortUtil;

public class SelectionSort {

	// 선택정렬(selection sort)
	public static int[] selectionSort(int[] ints) {
		System.out.println("start");
		long start = System.currentTimeMillis();

		// ints[i]에 최소값을 대입하기 위한 for loop
		for (int i = 0; i <= ints.length - 2; i++) {
			int min = ints[i];
			int index = i;
			for (int j = i + 1; j <= ints.length - 1; j++) {
				if (ints[j] < min) {
					min = ints[j];
					index = j;
				}
			}
			if (index != i) {
				int temp = ints[i];
				ints[i] = ints[index];
				ints[index] = temp;
			}
			SortUtil.printIntArray(ints);
		}

		long end = System.currentTimeMillis();
		System.out.println("end");
		System.out.println("spending time: " + (end - start));
		return ints;
	}
}