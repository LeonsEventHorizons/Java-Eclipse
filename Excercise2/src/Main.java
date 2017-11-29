import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Question 1 Exact Sums
		exactSums();

		// Question 2 averageDiff
		int[] array1 = { 2, 54, 45, 23, 34 };
		double getAverageDiff = averageDiff(array1);
		System.out.println(getAverageDiff);

		// Question 3 Intersection
		int[] array2 = { 23, 2, 45, 43, 87, 6, 4, 8 };
		int[] array3 = { 8, 54, 23, 87, 99, 5, 0, 56 };
		int[] intersects = interesection(array2, array3);
		for (int i = 0; i < intersects.length; i++) {
			System.out.print(intersects[i] + ", ");
		}
	}

	/**
	 * Write a Java program which tests whether an integer n is the exact sum of k
	 * consecutive integer numbers starting from 1. For example, 6 is 1+2+3 and
	 * therefore k=3. As another example, 10 is 1+2+3+4 and therefore k=4. The
	 * program should print a message stating whether the number is an exact sum or
	 * not.
	 */
	private static void exactSums() {

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Type an integer:");
		int n = keyboard.nextInt();

		int k = 0;
		int sum = 0;

		for (int i = 0; i < n; i++) {
			sum = sum + i;

			if (sum == n) {
				k = i;
			}
		}

		if (k == 0)
			System.out.println("The number " + n + " is not an exact sum");
		else
			System.out.println("The number " + n + " is the sum of integers from 1 to " + k);
		keyboard.close();
	}

	/**
	 * Write a method for a java class which when passed an array of integers,
	 * returns a double (floating point) value that is the difference between the
	 * average value and the maximum value in the array.
	 */
	private static double averageDiff(int[] array) {

		double average = 0;
		int sum = 0;
		int max = 0;

		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];

			if (array[i] > max) {
				max = array[i];
			}
		}
		average = sum / array.length;

		return max - average;
	}

	/**
	 * Write a method which when passed two arrays will compare the items of the
	 * first array with the items of the second. Check for equality and return an
	 * array with the same items with the same pattern as the first array.
	 */
	private static int[] interesection(int[] a, int[] b) {

		int[] results = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					results[i] = a[i];
				}
			}
		}
		return results;
	}
}
