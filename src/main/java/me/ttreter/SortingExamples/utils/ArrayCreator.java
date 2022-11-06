package me.ttreter.SortingExamples.utils;

import java.util.Scanner;

public class ArrayCreator extends Assistant {
    // Solicita os dados ao utilizador.
    public static void create() {
        Scanner in = new Scanner(System.in);
        getAmmountOfItems();
        for (int i = 0; i <= AMMOUNT_OF_ITEMS - 1; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            ARRAY[i] = in.nextInt();
        }
    }
    // Define a quantidade de dados a serem inseridos e cria o vetor com o tamanho certo.
    private static void getAmmountOfItems() {
        System.out.println(
                """
                        Digite a quantidade de dados que deseja inserir:"""
        );
        Scanner in = new Scanner(System.in);
        AMMOUNT_OF_ITEMS = in.nextInt();
        if (AMMOUNT_OF_ITEMS <= 1) {
            System.out.println("Não é possível ordenar somente um item.");
            getAmmountOfItems();
        }
        ARRAY = new int[AMMOUNT_OF_ITEMS];
    }
}
