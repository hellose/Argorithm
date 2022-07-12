package sort.mergeSort;

import sort.common.SortUtil;

public class Program {

	public static void main(String[] args) {
		int[] before = SortUtil.randomArraySizeAndRange(6, 20);
		SortUtil.printIntArray(before);

		int[] after = MergeSort.mergeSort(before);

		System.out.println();
		SortUtil.printIntArray(after);
	}

}
