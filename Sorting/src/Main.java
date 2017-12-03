
public class Main {

	private static int[] array = { 7, 4, 9, 0, 12, 32, 65, 5 };

	public static void main(String[] args) {

		int[] res = sort(array);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + ", ");
		}
	}

	private static int[] sort(int[] a) {

		boolean sorted = false;

		int temp = 0;

		while (!sorted) {
			sorted = true;
			for (int i = 0; i < a.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					sorted = false;
				}
			}
		}
		return a;
	}
}
