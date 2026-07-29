package stream_api;

import java.util.List;

/**
 * Verifique se a lista contém pelo menos um número negativo.
 * Utilizando a Stream API, verifique se a lista contém pelo menos um número negativo
 * e exiba o resultado no console.
 */
public class Desafio15VerificarNumeroNegativo {

    public static void main(String[] args) {

        List<Integer> numeros = Dados.NUMEROS;

        boolean possuiNegativo = numeros.stream()
                .anyMatch(numero -> numero < 0);

        System.out.println("A lista possui número negativo? " + possuiNegativo);

    }

}