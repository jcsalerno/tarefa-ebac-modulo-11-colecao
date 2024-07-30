package colecao;

import java.util.*;

public class OrdenaNomesGeneros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os nomes das pessoas e seus gêneros (M/F), separados por vírgula:");
        String input = scanner.nextLine();


        String[] pessoas = input.split(",");


        Map<String, String> sortedPessoas = new TreeMap<>();


        for (String pessoa : pessoas) {
            // Split each entry into name and gender
            String[] detalhes = pessoa.trim().split(" ");
            String nome = detalhes[0];
            String genero = detalhes[1];
            sortedPessoas.put(nome, genero);
        }


        System.out.println("Nomes e gêneros em ordem alfabética:");
        for (Map.Entry<String, String> entry : sortedPessoas.entrySet()) {
            System.out.println("Nome: " + entry.getKey() + ", Gênero: " + entry.getValue());
        }

        scanner.close();
    }
}
