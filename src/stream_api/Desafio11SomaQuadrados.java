package stream_api;

import java.util.List;

/**
 * Encontre a soma dos quadrados de todos os números da lista.
 * Utilizando a Stream API, encontre a soma dos quadrados de todos os números
 * da lista e exiba o resultado no console.
 */
public class Desafio11SomaQuadrados {

    public static void main(String[] args) {

        List<Integer> numeros = Dados.NUMEROS;

        int somaQuadrados = numeros.stream()
                .mapToInt(numero -> numero * numero)
                .sum();

        System.out.println("Soma dos quadrados: " + somaQuadrados);

    }

}