package stream_api;

import java.util.List;

/**
 * Verifique se todos os números da lista são positivos.
 * Com a ajuda da Stream API, verifique se todos os números da lista são
 * positivos e exiba o resultado no console.
 */
public class Desafio03VerificarPositivos {

    public static void main(String[] args) {
        List<Integer> numeros = Dados.NUMEROS;
        boolean todosPositivos = numeros.stream()
                .allMatch(n -> n > 0);
        System.out.println("Todos os números são positivos? " + todosPositivos);
    }

}
