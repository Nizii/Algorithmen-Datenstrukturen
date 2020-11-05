package einfacheSortieralgorithmen;

public class Selectionsort {
	
	public int[] go(int[] array) {
		for(int i = 0; i < array.length-1; i++) {
			int kleinstesElement = array[i];
			int indexKleinstesElement = i;
			
			for(int j = 1+i; j < array.length-1; j++) {
				if(kleinstesElement > array[j]) {
					kleinstesElement = array[j];
					indexKleinstesElement = j;
				}
				
			} swap(array, indexKleinstesElement, i);
			
		}
		return array;
	}
	
	public void swap(int[] array, int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}

}
