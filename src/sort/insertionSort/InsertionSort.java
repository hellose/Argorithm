package sort.insertionSort;

import sort.common.SortUtil;

public class InsertionSort {

	// 삽입 정렬(insertion sort)
	public static int[] insertionSort(int[] ints) {
		System.out.println("start");
		long start = System.currentTimeMillis();

		for (int i = 1; i < ints.length; i++) {
			int temp = ints[i];
			int index = i - 1;
			while (index >= 0 && ints[index] > temp) {
				ints[index + 1] = ints[index];
				SortUtil.printIntArray(ints);
				index--;
			}
			ints[index + 1] = temp; // 주의
			SortUtil.printIntArray(ints);
		}

		long end = System.currentTimeMillis();
		System.out.println("end");
		System.out.println("spending time: " + (end - start));
		return ints;
	}

}
