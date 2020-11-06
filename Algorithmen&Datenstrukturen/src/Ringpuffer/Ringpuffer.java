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
		// Setzt SchreibPos auf 0 nach Runde
		if (schreibPos >= puffer.length) {
			schreibPos = 0;
		}
		// Passt auf, dass Schreibposition die Leseposition nicht überrundet
		if(schreibPos != lesePos) {
			puffer[schreibPos] = eingabe;
			schreibPos++;
		} else {
			lesePos++;
			puffer[schreibPos] = eingabe;
		}
	}
	
	public void dequeue() {
		// Setzt SchreibPos auf 0 nach Runde
		if (lesePos >= puffer.length) {
			lesePos = 0;
		}
		// Passt auf, dass Leseposition die Schreibposition nicht überrundet
		if(schreibPos != lesePos) {
			System.out.print(puffer[lesePos]);
			lesePos++;
		} else {
			System.out.println("Alles gelesen");
		}
	}	
	
	
	
	// Hauptmethode, füllt/liest Puffer
	public static void main(String[] args) {
		Ringpuffer rp = new Ringpuffer();
		
		for(int i = 0; i < 10; i++) {
			rp.enqueue(1);
		}
		
		for(int j = 0; j < 19; j++) {
			rp.dequeue();
		}
	}
	
	// Gesamtes Array ausgeben
	public void pufferAusgeben() {
		for (int i = 0; i < puffer.length; i++) {
			System.out.print(puffer[i]);
		}
		System.out.println();
	}
	
	
}
