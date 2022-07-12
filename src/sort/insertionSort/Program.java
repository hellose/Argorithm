package sort.insertionSort;

import sort.common.SortUtil;

public class Program {

	public static void main(String[] args) {
		int[] before = SortUtil.randomArraySizeAndRange(6, 20);
		SortUtil.printIntArray(before);

		int[] after = InsertionSort.insertionSort(before);
		SortUtil.printIntArray(after);
	}
}