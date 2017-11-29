/*
 * If two siding values in the array add up to the target value, change the two 
 * array values to their corresponding indices values.
 */

public class Main {

	static int[] a = { 6, 2, 11, 4, 6, 15, 2, 6, 7, 9, 1, 8 };
	static int target = 10;

	public static void main(String[] args ) {		

		Main m = new Main();

		int[] result = m.twoSum(a, target);

		for (int i : result) {
			System.out.print(i + ", ");
		}
	}

	public int[] twoSum(int[] nums, int target) {

		int size = nums.length;
		int[] array = new int[size];

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] + nums[i + 1] == target) {
				array[i] = i;
				array[i + 1] = i + 1;
			}
		}
		return array;
	}
}
