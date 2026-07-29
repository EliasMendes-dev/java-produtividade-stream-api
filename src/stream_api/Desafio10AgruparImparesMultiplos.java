package stream_api;

import java.util.List;

/**
 * Agrupe os valores ímpares múltiplos de 3 ou de 5.
 * Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5
 * e exiba o resultado no console.
 */
public class Desafio10AgruparImparesMultiplos {

    public static void main(String[] args) {

        List<Integer> numeros = Dados.NUMEROS;

        List<Integer> imparesMultiplos = numeros.stream()
                .filter(numero -> numero % 2 != 0)
                .filter(numero -> numero % 3 == 0 || numero % 5 == 0)
                .toList();

        System.out.println("Ímpares múltiplos de 3 ou 5: " + imparesMultiplos);

    }

}