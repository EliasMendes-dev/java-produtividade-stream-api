package stream_api;

import java.util.List;

/**
 * Encontre o segundo número maior da lista.
 * Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o
 * resultado no console.
 */
public class Desafio07SegundoMaiorNumero {

    public static void main(String[] args) {
        List<Integer> numeros = Dados.NUMEROS;

        Integer segundoMaior = numeros.stream()
                .distinct()               // Remove números repetidos
                .sorted((a, b) -> b - a)  // Ordena em ordem decrescente
                .skip(1)                  // Pula o maior
                .findFirst()              // Pega o segundo maior
                .orElse(null);

        System.out.println("Segundo maior número: " + segundoMaior);
    }

}