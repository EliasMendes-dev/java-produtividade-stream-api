package stream_api;

import java.util.List;

/**
 * Calcule a média dos números maiores que 5.
 * Com a Stream API, calcule a média dos números maiores que 5 e exiba o
 * resultado no console.
 */
public class Desafio05MediaMaioresQueCinco {

    public static void main(String[] args) {
        List<Integer> numeros = Dados.NUMEROS;
        List<Integer> numerosMaioresQueCinco = numeros.stream()
                .filter(n -> n > 5)
                .toList();
        double media = numerosMaioresQueCinco.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println("Média dos números maiores que 5: " + media);
    }

}
