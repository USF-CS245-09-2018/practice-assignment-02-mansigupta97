public class BinaryRecursiveSearch implements Practice2Search {
	public String searchName() {
		return "Binary Recursive Search";
	}

	public int search(int[] array, int value) {
		return search(array, value, 0, array.length - 1);
	}

	public int search(int[] array, int value, int min, int max) {
		if(min > max) {
			return -1;
		}
		int middle = (min + max)/2;
		if(array[middle] == value) {
			return middle;
		}
		if(Integer.compare(array[middle], value) > 0) {
			return search(array, value, min, middle - 1);
		}
		return search(array, value, middle + 1, max);
	}
}