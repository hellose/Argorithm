package sort.bubbleSort;

import sort.common.SortUtil;

public class BubbleSort {

	// 버블 정렬(bubble sort)
	public static int[] bubbleSort(int[] ints) {
		System.out.println("start");
		long start = System.currentTimeMillis();

		for (int i = ints.length - 2; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				if (ints[j + 1] < ints[j]) {
					int temp = ints[j + 1];
					ints[j + 1] = ints[j];
					ints[j] = temp;
				}
				SortUtil.printIntArray(ints);
			}
		}

		long end = System.currentTimeMillis();
		System.out.println("end");
		System.out.println("spending time: " + (end - start));
		return ints;
	}

}