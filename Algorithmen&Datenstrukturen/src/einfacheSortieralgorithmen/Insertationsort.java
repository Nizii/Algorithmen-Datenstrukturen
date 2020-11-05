package einfacheSortieralgorithmen;

public class Insertationsort {
	
	public int[] go(int[] array) {
		for (int i = 1; i < array.length-1; i++){
			int j = i ;
            while(array[j-1] > array[j] && j > 0) {	
            	swap(array, j, j-1);
            	if(j > 1)
            	j--;
            }    
        }
		return array;
	}
	
    public void swap(int[] array, int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
    
}
