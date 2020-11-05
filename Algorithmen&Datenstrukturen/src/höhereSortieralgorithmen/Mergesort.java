package h�hereSortieralgorithmen;

public class Mergesort {
	private static char[] b;
	/**
	* Sortiert ein Zeichen-Array mit dem Mergesort-Algorithmus.
	* @param a Zeichen-Array zum Sortieren
	*/
	public static void mergeSort(final char[] a) {
		b = new char[a.length]; 					// zus�tzlicher Speicher f�rs Mergen
		mergeSort(a, 0, a.length - 1);
	}
	/**
	* Rekursiver Mergesort-Algorithmus.
	* @param a Zeichen-Array zum Sortieren
	* @param left linke Grenze, zu Beginn 0
	* @param right rechte Grenze, zu Beginn a.length - 1
	*/
	
	private static void mergeSort(final char a[], final int left, final int right) {
		int i, j, k, m;
		if (right > left) {
			m = (right + left) / 2; 				// Mitte ermitteln
			mergeSort(a, left, m); 					// linke H�lfte sortieren
			mergeSort(a, m + 1, right); 			// rechte H�lfte sortieren
			
			// "Mergen"
			for (i = left; i <= m; i++) { 			// linke H�lfte in Hilfsarray kopieren
				b[i] = a[i];
			}
			for (j = m; j < right; j++) { 			// rechte H�lfte umgekehrt in Hilfsa. kopieren
				b[right + m - j] = a[j + 1];
			}
			i = left; j = right; 					// Index f�r linke und rechte H�lfte
			for (k = left; k <= right; k++) { 		// f�ge sortiert in a ein
				if (b[i] <= b[j]) {
					a[k] = b[i]; i++;
				} else {
					a[k] = b[j]; j--;
				}
			}
		}
	}
}
