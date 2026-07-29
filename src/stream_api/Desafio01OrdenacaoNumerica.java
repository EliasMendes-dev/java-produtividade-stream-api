package stream_api;

import java.util.List;

/**
 * Mostre a lista na ordem numérica.
 * Crie um programa que utilize a Stream API para ordenar a lista de números
 * em ordem crescente e a exiba no console.
 */
public class Desafio01OrdenacaoNumerica {

    public static void main(String[] args) {

        List<Integer> numeros = Dados.NUMEROS;

        numeros.stream()
                .sorted()
                .forEach(System.out::println);

    }

}