package einfacheSortieralgorithmen;
import java.util.Random;

public class Bubblesort {
    private int[] array = new int[20];
    private Random zufall = new Random();

    public Bubblesort(int n){
        for (int i = 0; i < array.length; i++){
            array[i] = zufall.nextInt(n);
        }

    }

    public void showArray(){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]);
        }
        System.out.println();
    }

    public void sort(){
        for (int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length-1-i; j++){
                int a = array[j];
                int b = array[j+1];

                if (a > b){
                    swap(j,j+1);
                }
            }
        }
    }

    public void swap(int a, int b){
        //System.out.println(i);
        //System.out.println(j);
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    };
}