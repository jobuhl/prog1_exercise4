public class ArrayCopyFirstAttempt {

	public static void main(String[] args) {
		int[] values = { 1, 2, 3 };
		int[] doubleValues = values;
		for (int id = 0; id < doubleValues.length; id++) {
			doubleValues[id] = doubleValues[id] * 2;
		}
		for (int id = 0; id < doubleValues.length; id++) {
			System.out.println("Die Zahl " + values[id] + " ergibt verdoppelt "
					+ doubleValues[id]);
		}
	}

}
