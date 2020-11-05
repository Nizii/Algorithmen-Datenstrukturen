package Heap;

import java.util.Arrays;
import java.util.Collections;

public class FixedSizeHeap implements integerHeap{
	int[] a;
	
	public FixedSizeHeap(int[] a) {
		this.a = a;		
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int get(int i) {
		return a[i];
	}

	@Override
	public void reorg() {
		
	}

	@Override
	public void sameBig() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean full(int[] a) {
		return true;
	}

	@Override
	public boolean empty(int[] a) {
		return true;
	}

	@Override
	public int[] deleteMax() {
		int[] temp = new int[a.length-1];
		for(int i = 1; i < a.length; i++) {
			temp[i-1] = a[i];
		}
		return temp;
	}
	

}
