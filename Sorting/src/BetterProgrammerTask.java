import java.util.*;

public class BetterProgrammerTask {

	static int array[] = { 1, 8, 9, 5, 4, 2, 99, 88 };

	public static void main(String[] args) {

		int[] result = retainPositiveNumbers(array);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
		String s = getBinaryRepresentation(234);
		System.out.println("HERE:" +s);		
	}

	public static int[] retainPositiveNumbers(int[] a) {

		int array[] = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				array[i] = a[i];
			}
		}
		Arrays.sort(array);
		return array;
	}

	public static String getBinaryRepresentation(int n) {
		
		String binary = Integer.toBinaryString(n);
		return binary;		
	}
}