package Ringpuffer;

public class Ringpuffer {
	private int[] puffer;
	private int schreibPos;
	private int lesePos;
	
	public Ringpuffer() {
		puffer = new int[10];
		schreibPos = 1;
		lesePos = 0;
	}
	
	public void enqueue(int eingabe) {
		if (schreibPos >= puffer.length) {
			schreibPos = 0;
		}
		if(schreibPos != lesePos) {
			puffer[schreibPos] = eingabe;
		} else {
			lesePos++;
			puffer[schreibPos] = eingabe;
		}
		schreibPos++;
	}
	
	public void dequeue() {
		if (lesePos >= puffer.length) {
			lesePos = 0;
		}
		if(schreibPos != lesePos) {
			System.out.print(puffer[lesePos]);
			lesePos++;
		} else {
			schreibPos--;
			System.out.print(puffer[lesePos]);
		}
	}

	//Überrundung dequeue
	
	
	
	
	
	public static void main(String[] args) {
		Ringpuffer rp = new Ringpuffer();
		
		for(int i = 0; i < 10; i++) {
			rp.enqueue(1);
		}
		
		for(int j = 0; j < 20; j++) {
			rp.dequeue();
		}
		/**
		for(int a = 0; a < 8; a++) {
			rp.enqueue(2);
		}
		rp.pufferAusgeben();
		**/
	}
	
	public void pufferAusgeben() {
		for (int i = 0; i < puffer.length; i++) {
			System.out.print(puffer[i]);
		}
		System.out.println();
	}
	
	
}
