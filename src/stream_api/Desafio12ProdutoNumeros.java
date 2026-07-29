package stream_api;

import java.util.List;

/**
 * Encontre o produto de todos os números da lista.
 * Com a ajuda da Stream API, encontre o produto de todos os números da lista
 * e exiba o resultado no console.
 */
public class Desafio12ProdutoNumeros {

    public static void main(String[] args) {

        List<Integer> numeros = Dados.NUMEROS;

        int produto = numeros.stream()
                .reduce(1, (a, b) -> a * b);

        System.out.println("Produto dos números: " + produto);

    }

}