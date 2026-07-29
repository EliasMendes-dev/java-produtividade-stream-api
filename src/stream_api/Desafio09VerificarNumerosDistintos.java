package stream_api;

import java.util.List;

/**
 * Verifique se todos os números da lista são distintos (não se repetem).
 * Com a Stream API, verifique se todos os números da lista são distintos (não se repetem)
 * e exiba o resultado no console.
 */
public class Desafio09VerificarNumerosDistintos {

    public static void main(String[] args) {

        List<Integer> numeros = Dados.NUMEROS;

        boolean todosDistintos = numeros.stream()
                .distinct()
                .count() == numeros.size();

        System.out.println("Todos os números são distintos? " + todosDistintos);

    }

}