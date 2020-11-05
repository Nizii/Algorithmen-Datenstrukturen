package höhereSortieralgorithmen;
import java.util.Random;

public class Mainsort {
	
	public static void main(String[] args) {
		
		/**
		Random zufall = new Random();
		int[] array = new int[7];
        for (int i = 0; i < array.length; i++) {
            array[i] = zufall.nextInt(9);
        }
        for(int i = 0; i < array.length-1; i++){
            System.out.print(array[i]);
        }
        System.out.println();
      
		
		
		 * Selectionsort
		 
		 
		Selectionsort ss = new Selectionsort();
		array = ss.go(array);
		**/
		
		
		/**
		 * Insertationsort
		 
		Insertationsort is = new Insertationsort();
		array = is.go(array);
		
		
        for(int i = 0; i < array.length-1; i++){
            System.out.print(array[i]);
        }
        System.out.println();
		**/
		
		
		/**
		
		Quicksort q = new Quicksort();
        char[] array = q.fillCharArray(new char[30]);
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]);
        }
        System.out.println();
        
        array = q.quickSort(array);
        
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]);
        }
        **/
        /**
		long start = System.currentTimeMillis();

		
		Quicksort q = new Quicksort();
       int[] array = q.fillIntArray(new int[30]);
       for (int i = 0; i < array.length; i++){
           System.out.print(array[i]);
       }
       System.out.println();
        
        array = q.quicksort(array, 0, array.length-1);

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]);
        }
        
		long finish = System.currentTimeMillis();
		long endzeit = finish - start;
		System.out.println();
		System.out.println("Dauer "+endzeit+" mili Sek");
		 
		/**
		 * Bubblesort
		// Parameter 1 = Zufallszahlbereich
        // Parameter 2 = Grösse Array
        Bubblesort bs = new Bubblesort(9);
        bs.showArray();
        bs.sort();
        bs.showArray();
		 */
		
		/**
		Quicksort q = new Quicksort();
		Mergesort m = new Mergesort();
        char[] a = q.fillCharArray(new char[30]);
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i]);
        }
        System.out.println();
        
        m.mergeSort(a);
        
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i]);
        }
        **/
	}

}
