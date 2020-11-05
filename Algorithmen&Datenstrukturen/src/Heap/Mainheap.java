package Heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class Mainheap{
	
	
	public static void main(String[] args) {
		
		Random zufall = new Random();
	    int[] a = new int[10];
	    
	    
	    for (int i = 0; i < a.length; i++) {
	        a[i] = zufall.nextInt(9);
	    }
	    
	    for (int r = 0; r < a.length; r++){
	    	System.out.print(a[r]+" ");
	    }
	    System.out.println();
	    
	    for (int i = 0; i < a.length / 2; i++) {
	        int temp = a[i];
	        a[i] = a[a.length - 1 - i];
	        a[a.length - 1 - i] = temp;
	    }
	    



	    for (int j = 0; j < a.length; j++){
	    	System.out.print(a[j]+" ");
	    }
	    System.out.println();
	    FixedSizeHeap f = new FixedSizeHeap(a);   
	    a = f.deleteMax();

	    for (int c = 0; c < a.length; c++){
	         System.out.print(a[c]+" ");
	    }
    
	}
	
}
