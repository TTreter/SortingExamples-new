package me.ttreter.SortingExamples;

import me.ttreter.SortingExamples.utils.ArrayCreator;
import me.ttreter.SortingExamples.utils.Assistant;
import me.ttreter.SortingExamples.utils.Show;
import me.ttreter.SortingExamples.utils.Sort;

public class Main extends Assistant {
    public static void main(String[] args) {
        System.out.println(
                """
                        Este código serve para exemplificar o uso de alguns algortimos de ordenação.
                        A seguir, escolha o metodo que deseja usar.
                        """
        );
        Show.options(); // Mostra as opções de algoritmos disponíveis.
        ArrayCreator.create(); // Solicita ao utilizador os dados do vetor a ser ordenado.
        Sort.run(); // Ordena os dados inseridos pelo utilizador.
        Show.result(ARRAY); // Mostra o resultado da ordenação.
    }
}