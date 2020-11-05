package höhereSortieralgorithmen;
import java.util.Random;

public class Quicksort {
    private Random zufall = new Random();
    
    //Quicksort ein durchgang Rest mit InstertationSort
    public static final char[] quickSort(final char[] a) {
    	int left = 0; 											// linke Grenze
    	int right = a.length-1; 								// rechte Grenze (ohne Trennelement)
    	char t = a[a.length-1]; 								// rechtes Element als Trennelement
    		while (a[left] < t) {
    			left++; 										// suche grösseres (>=) Element von links an
    		}
    		while ((a[right] >= t) && (right > left)) {
    			right--; 										// suche echt kleineres (<) Element von rechts an
    		}
    		if (right > left) { 								// solange keine Überschneidung
    			exchange(a, left, right);
    			left++; right--; 								// linke und rechte Grenze verschieben
    		} 
    		return goInsert(a);
    }
    
    
    private static final void exchange(final char[] a, final int firstIndex, final int secondIndex) {
    		char tmp;
    		tmp = a[firstIndex];
    		a[firstIndex] = a[secondIndex];
    		a[secondIndex] = tmp;
    	}
    
	public static char[] goInsert(char[] array) {
		for (int i = 1; i < array.length-1; i++){
			int j = i ;
            while(array[j-1] > array[j] && j > 0) {	
            	exchange(array, j, j-1);
            	if(j > 1)
            	j--;
            }    
        }
		return array;
	}
    
	
	// Mein Quicksort

    public int[] quicksort(int[] array, int start, int end) {
        if(start >= end){
            return array;
        } else {
            int pivotIndex = partition(array, start, end);
            quicksort(array, start, pivotIndex-1);
            quicksort(array, pivotIndex+1, end);
        }
        return array;
    }

    public int partition(int[] array, int start, int end){
        int pivotIndex = start;
        int pivotValue = array[end];
        for (int i = start; i < end; i++){
            if(array[i] < pivotValue){
                swap(array, i, pivotIndex);
                pivotIndex++;
            }
        }
        swap(array, pivotIndex, end);
        return pivotIndex;
    }

    public void swap(int[] array, int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    };

    public int[] fillIntArray(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            array[i] = zufall.nextInt(10);
        }
        return array;
    }
    
    public char[] fillCharArray(char[] array) {
    	String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < array.length-1; i++) {
            array[i] = abc.charAt(zufall.nextInt(26));
        }
        return array;
    }
}
