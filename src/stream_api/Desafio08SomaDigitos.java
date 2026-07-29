package stream_api;

import java.util.List;

/**
 * Some os dígitos de todos os números da lista.
 * Utilizando a Stream API, realize a soma dos dígitos de todos os números da
 * lista e exiba o resultado no console.
 */
public class Desafio08SomaDigitos {

    public static void main(String[] args) {
        List<Integer> numeros = Dados.NUMEROS;

        int somaDigitos = numeros.stream()
                .mapToInt(numero -> String.valueOf(numero)
                        .chars()
                        .map(Character::getNumericValue)
                        .sum())
                .sum();

        System.out.println("Soma dos dígitos: " + somaDigitos);
    }

}