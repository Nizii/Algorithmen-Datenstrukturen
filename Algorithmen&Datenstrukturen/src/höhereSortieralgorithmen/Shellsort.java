package höhereSortieralgorithmen;

public class Shellsort {
	
	public int[] go(int[] array) {
		int indexMid = (array.length/2);
		int valueMid = array[indexMid];

		for(int i = 0; i < array.length-1; i++) {
			if(array[i] > array[indexMid]) {
				swap(array, i, indexMid);
		}		
			if(indexMid < 6) {
			indexMid++;
			valueMid = array[indexMid];
		}}

		return array;
	}
	
	
	public void swap(int[] array, int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}

}
