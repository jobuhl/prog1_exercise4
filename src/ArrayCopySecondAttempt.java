public class ArrayCopySecondAttempt {

	public static void main(String[] args) {
		int[] values = { 1, 2, 3 };

		int[] doubleValues = new int[values.length];
		for (int id = 0; id < doubleValues.length; id++) {
			doubleValues[id] = values[id];
		}
//		System.arraycopy(values, 0, doubleValues, 0, values.length);
//		doubleValues = values.clone();
		
		for (int id = 0; id < doubleValues.length; id++) {
			doubleValues[id] = doubleValues[id] * 2;
		}
		for (int id = 0; id < doubleValues.length; id++) {
			System.out.println("Die Zahl " + values[id] + " ergibt verdoppelt "
					+ doubleValues[id]);
		}
	}

}
