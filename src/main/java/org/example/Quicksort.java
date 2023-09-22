package org.example;

public class Quicksort {

    public void quicksort(int[] counts, int a, int b) {
        if (a<b) {
            int s = counts[b];
            int k = a-1;
            for (int i = a; i < b; i++) {
                if(counts[i] <= s) {
                    k++;
                    int sw = counts[k];
                    counts[k] = counts[i];
                    counts[i] = sw;
                }
            }
            int sw = counts[k+1];
            counts[k+1] = counts[b];
            counts[b] = sw;
            quicksort(counts,a,k);
            quicksort(counts,k+2,b);
        }
    }
}
