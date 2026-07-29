package stream_api;

import java.util.List;

/**
 * Encontre o maior número primo da lista.
 * Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.
 */
public class Desafio14MaiorNumeroPrimo {

    public static void main(String[] args) {

        List<Integer> numeros = Dados.NUMEROS;

        Integer maiorPrimo = numeros.stream()
                .filter(Desafio14MaiorNumeroPrimo::ehPrimo)
                .max(Integer::compareTo)
                .orElse(null);

        System.out.println("Maior número primo: " + maiorPrimo);

    }

    private static boolean ehPrimo(int numero) {

        if (numero <= 1) {
            return false;
        }

        return java.util.stream.IntStream.rangeClosed(2, numero / 2)
                .noneMatch(divisor -> numero % divisor == 0);
    }

}