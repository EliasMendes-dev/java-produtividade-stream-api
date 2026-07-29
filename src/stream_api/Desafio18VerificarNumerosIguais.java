package stream_api;

import java.util.List;

/**
 * Verifique se todos os números da lista são iguais.
 * Utilizando a Stream API, verifique se todos os números da lista são iguais
 * e exiba o resultado no console.
 */
public class Desafio18VerificarNumerosIguais {

    public static void main(String[] args) {

        List<Integer> numeros = Dados.NUMEROS;

        boolean todosIguais = numeros.stream()
                .distinct()
                .count() == 1;

        System.out.println("Todos os números são iguais? " + todosIguais);

    }

}