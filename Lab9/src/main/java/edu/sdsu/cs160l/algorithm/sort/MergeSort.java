package edu.sdsu.cs160l.algorithm.sort;

import java.util.Comparator;

/**
 * TODO assignment (4 points)
 *  implement mergesort in a similar way as quick sort and bubble sort structurally
 */
public class MergeSort implements Sorter {
    @Override
    @SuppressWarnings("unchecked")
    public <T> void sort(T[] c) {
        Comparable[] comparable = (Comparable[]) c;
        sort(comparable, Comparator.naturalOrder());
    }

    @Override
    public <T> void sort(T[] c, Comparator<? super T> comparisonStrategy) {
        mergeSort(c, c.length,comparisonStrategy);
    }

    private <T> void mergeSort(T[] c, int n, Comparator<? super T> comparisonStrategy) {
    }

    private <T> void merge(T[] c, T[] l, T[] r, int left, int right, Comparator<? super T> comparisonStrategy) {

    }
}