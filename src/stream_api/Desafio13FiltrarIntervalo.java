package stream_api;

import java.util.List;

/**
 * Filtre os números que estão dentro de um intervalo.
 * Utilize a Stream API para filtrar os números que estão dentro de um intervalo
 * específico (por exemplo, entre 5 e 10) e exiba o resultado no console.
 */
public class Desafio13FiltrarIntervalo {

    public static void main(String[] args) {

        List<Integer> numeros = Dados.NUMEROS;

        List<Integer> numerosNoIntervalo = numeros.stream()
                .filter(numero -> numero >= 5 && numero <= 10)
                .toList();

        System.out.println("Números entre 5 e 10: " + numerosNoIntervalo);

    }

}