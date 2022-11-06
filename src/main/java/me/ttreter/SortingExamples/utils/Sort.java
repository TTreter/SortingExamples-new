package me.ttreter.SortingExamples.utils;

import me.ttreter.SortingExamples.methods.BubbleSort;
import me.ttreter.SortingExamples.methods.MergeSort;
import me.ttreter.SortingExamples.methods.QuickSort;

public class Sort extends Assistant {
    // Executa a ordenação dos dados definidos.
    public static void run() {
        switch (Assistant.METHOD) {
            case 1 -> {
                System.out.println("\nO método escolhido foi BubbleSort.");
                BubbleSort.sort();
            }
            case 2 -> {
                System.out.println("\nO método escolhido foi MergeSort.");
                MergeSort.sort();
            }
            case 3 -> {
                System.out.println("\nO método escolhido foi QuickSort.");
                QuickSort.sort();
            }
            default -> {
                System.out.println(
                        """
                                O método escolhido não existe ou não foi implementado.
                                Selecione outro."""
                );
                Show.options();
            }
        }
    }
}
