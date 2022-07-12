package sort.common;

public class SortUtil {

	public static int[] randomArraySizeAndRange(int size, int range) {
		int[] result = new int[size];
		for (int i = 0; i < result.length; i++) {
			result[i] = ((int) (Math.random() * range)) + 1;
		}
		return result;
	}

	public static void printIntArray(int[] ints) {
		for (int i = 0; i < ints.length; i++) {
			System.out.print(ints[i] + " ");
		}
		System.out.println();

	}

}