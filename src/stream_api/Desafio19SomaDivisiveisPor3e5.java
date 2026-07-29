package stream_api;

import java.util.List;

/**
 * Encontre a soma dos números divisíveis por 3 e 5.
 * Com a Stream API, encontre a soma dos números da lista que são divisíveis
 * tanto por 3 quanto por 5 e exiba o resultado no console.
 */
public class Desafio19SomaDivisiveisPor3e5 {

    public static void main(String[] args) {

        List<Integer> numeros = Dados.NUMEROS;

        int soma = numeros.stream()
                .filter(numero -> numero % 3 == 0 && numero % 5 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Soma dos números divisíveis por 3 e 5: " + soma);

    }

}