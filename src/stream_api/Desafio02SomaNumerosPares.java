package stream_api;

import java.util.List;

/**
 * Imprima a soma dos números pares da lista.
 * Utilizando a Stream API, realize a soma dos números pares da lista e exiba o
 * resultado no console.
 */
public class Desafio02SomaNumerosPares {

    public static void main(String[] args) {
        List<Integer> numeros = Dados.NUMEROS;
        int somaPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("A soma dos números pares é: " + somaPares);
    }

}
