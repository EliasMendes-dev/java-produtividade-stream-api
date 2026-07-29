package stream_api;

import java.util.List;

/**
 * Remova todos os valores ímpares.
 * Utilize a Stream API para remover os valores ímpares da lista e imprima a
 * lista resultante no console.
 */
public class Desafio04RemoverImpares {

    public static void main(String[] args) {
        List<Integer> numeros = Dados.NUMEROS;
        List<Integer> numerosPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println("Números pares: " + numerosPares);
    }

}
