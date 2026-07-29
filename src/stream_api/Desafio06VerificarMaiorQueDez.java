package stream_api;

import java.util.List;

/**
 * Verifique se a lista contém algum número maior que 10.
 * Utilize a Stream API para verificar se a lista contém algum número maior que
 * 10 e exiba o resultado no console.
 */
public class Desafio06VerificarMaiorQueDez {

    public static void main(String[] args) {
        List<Integer> numeros = Dados.NUMEROS;
         List<Integer> numerosMaioresQueDez = numeros.stream()
                .filter(n -> n > 10)
                .toList();
        boolean contemMaiorQueDez = numerosMaioresQueDez.stream()
                .anyMatch(n -> n > 10);
        System.out.println("Contém algum número maior que 10: " + contemMaiorQueDez);
    }
}