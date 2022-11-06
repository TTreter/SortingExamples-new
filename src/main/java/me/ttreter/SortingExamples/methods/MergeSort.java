package me.ttreter.SortingExamples.methods;

import me.ttreter.SortingExamples.utils.Assistant;

public class MergeSort extends Assistant {
    public static void sort() {
        sort(ARRAY);
    }
    // Ordena os dados inseridos pelo utilizador usando o metodo MergeSort.
    private static void sort(int[] arr) {
        if (arr.length < 2) return;
        int mid = arr.length / 2;
        int[] left_half = new int[mid];
        int[] right_half = new int[arr.length - mid];
        // Copia os elementos da metade da esquerda para a variável auxiliar.
        System.arraycopy(arr, 0, left_half, 0, mid);
        // Copia os elementos da metade da direita para a variável auxiliar.
        if (arr.length - mid >= 0) System.arraycopy(arr, mid, right_half, 0, arr.length - mid);
        sort(left_half);
        sort(right_half);
        merge(arr, left_half, right_half);
    }
    // Junta as metades das duas variáveis em um vetor só.
    private static void merge(int[] arr, int[] left_half, int[] right_half) {
        int i = 0, j = 0, k = 0;
        while (i < left_half.length && j < right_half.length) {
            if (left_half[i] < right_half[j]) {
                arr[k++] = left_half[i++];
            }
            else {
                arr[k++] = right_half[j++];
            }
        }
        while (i < left_half.length) {
            arr[k++] = left_half[i++];
        }
        while (j < right_half.length) {
            arr[k++] = right_half[j++];
        }
    }
}

