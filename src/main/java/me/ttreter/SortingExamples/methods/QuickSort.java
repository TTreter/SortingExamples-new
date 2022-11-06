package me.ttreter.SortingExamples.methods;

import me.ttreter.SortingExamples.utils.Assistant;

public class QuickSort extends Assistant {
    public static void sort() {
        quickSort(ARRAY);
    }
    // Ordena os dados inseridos pelo utilizador usando o metodo QuickSort.
    private static void quickSort(int[] array) {
        // Ordena o vetor recursivamente.
        quickSortUtil(array, 0, array.length - 1);
    }
    private static void quickSortUtil(int[] array, int startIdx, int endIdx) {
        // Neste ponto, a matriz é classificada.
        if (startIdx >= endIdx) {
            return;
        }
        // Define o primeiro valor como pivô.
        // Ordena todos os outros valores conforme o pivô.
        int leftIdx = startIdx + 1;
        int rightIdx = endIdx;
        // Definir se o elemento leftIdx é <= ao pivotIdx
        // e o elemento rightIdx é >= ao pivotIdx
        while (leftIdx <= rightIdx) {
            if (array[leftIdx] > array[startIdx] && array[rightIdx] < array[startIdx]) {
                swap(leftIdx, rightIdx, array);
            }
            if (array[leftIdx] <= array[startIdx]) {
                leftIdx++;
            }
            if (array[rightIdx] >= array[startIdx]) {
                rightIdx--;
            }
        }

        swap(startIdx, rightIdx, array);
        // No final da interação atual, o elemento pivô está na sua posição final ordenada.
        quickSortUtil(array, startIdx, rightIdx - 1);
        quickSortUtil(array, rightIdx + 1, endIdx);
    }
    // Troca a posição dos elementos.
    private static void swap(int i, int j, int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

