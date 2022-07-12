package sort.bubbleSort;

import sort.common.SortUtil;

public class Program {

	public static void main(String[] args) {
		int[] before = SortUtil.randomArraySizeAndRange(10, 20);
		SortUtil.printIntArray(before);
		
		int[] after = BubbleSort.bubbleSort(before);
		SortUtil.printIntArray(after);
	}
}
