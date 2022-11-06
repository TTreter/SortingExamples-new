package me.ttreter.SortingExamples.utils;

import java.util.Arrays;
import java.util.Scanner;

public class Show {
    // Mostra as opções de métodos disponíveis e define qual será utilizado.
    public static void options() {
        Scanner in = new Scanner(System.in);
        System.out.println(
                """
                         Opções de ordenação, digite:
                            • 1 para BubbleSort.
                            • 2 para MergeSort.
                            • 3 para QuickSort."""
        );
        Assistant.METHOD = in.nextInt();
    }
    // Mostra os dados do vetor ja ordenados.
    public static void result(int[] array) {
        if (Assistant.METHOD == 1) {
            System.out.println("\nMétodo BubbleSort.\nResultado: " + Arrays.toString(array));
        }
        if (Assistant.METHOD == 2) {
            System.out.println("\nMétodo MergeSort.\nResultado: " + Arrays.toString(array));
        }
        if (Assistant.METHOD == 3) {
            System.out.println("\nMétodo QuickSort.\nResultado: " + Arrays.toString(array));
        }
    }
}
