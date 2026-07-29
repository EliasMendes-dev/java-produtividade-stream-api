package stream_api;

import java.util.List;

/**
 * Agrupe os números em pares e ímpares.
 * Utilize a Stream API para agrupar os números em duas listas separadas,
 * uma contendo os números pares e outra contendo os números ímpares da lista original,
 * e exiba os resultados no console.
 */
public class Desafio16AgruparParesEImpares {

    public static void main(String[] args) {

        List<Integer> numeros = Dados.NUMEROS;

        List<Integer> numerosPares = numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .toList();

        List<Integer> numerosImpares = numeros.stream()
                .filter(numero -> numero % 2 != 0)
                .toList();

        System.out.println("Números pares: " + numerosPares);
        System.out.println("Números ímpares: " + numerosImpares);

    }

}