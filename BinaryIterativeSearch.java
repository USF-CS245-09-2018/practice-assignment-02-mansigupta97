public class BinaryIterativeSearch implements Practice2Search {
	public String searchName() {
		return "Binary Iterative Search";
	}
	public int search(int[] array, int value) {
		int min = 0;
		int max = array.length - 1;
		while(min <= max) {
			int middle = (min + max)/2;
			if(array[middle] == value) {
				return middle;
			}
			if(Integer.compare(array[middle],value) > 0) {
				max = middle - 1;
			} else {
					min = middle + 1;
			}
		}
		return -1;
	}
}