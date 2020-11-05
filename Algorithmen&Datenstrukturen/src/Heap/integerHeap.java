package Heap;

public interface integerHeap {
	public void add();
	public int[] deleteMax();
	public int get(int i);
	public void reorg();
	public void sameBig();
	public boolean full(int[] a);
	public boolean empty(int[] a);
	
}
