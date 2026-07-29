package stream_api;

import java.util.List;

/**
 * Filtre os números primos da lista.
 * Com a ajuda da Stream API, filtre os números primos da lista
 * e exiba o resultado no console.
 */
public class Desafio17FiltrarNumerosPrimos {

    public static void main(String[] args) {

        List<Integer> numeros = Dados.NUMEROS;

        List<Integer> numerosPrimos = numeros.stream()
                .filter(Desafio17FiltrarNumerosPrimos::ehPrimo)
                .toList();

        System.out.println("Números primos: " + numerosPrimos);

    }

    private static boolean ehPrimo(int numero) {

        if (numero <= 1) {
            return false;
        }

        return java.util.stream.IntStream.rangeClosed(2, numero / 2)
                .noneMatch(divisor -> numero % divisor == 0);
    }

}