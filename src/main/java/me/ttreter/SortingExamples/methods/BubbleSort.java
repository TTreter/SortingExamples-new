package me.ttreter.SortingExamples.methods;

import me.ttreter.SortingExamples.utils.Assistant;

public class BubbleSort extends Assistant {
    // Ordena os dados inseridos pelo utilizador usando o metodo BubbleSort.
    public static void sort() {
        int n, i, aux;
        for (n = 0; n <= AMMOUNT_OF_ITEMS-1; n++) {
            for (i = 0; i <= AMMOUNT_OF_ITEMS-2; i++) {
                if (ARRAY[i] > ARRAY[i + 1]) {
                    aux = ARRAY[i];
                    ARRAY[i] = ARRAY[i + 1];
                    ARRAY[i + 1] = aux;
                }
            }
        }
    }
}
