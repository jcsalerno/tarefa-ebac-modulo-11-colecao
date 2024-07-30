package colecao;

import java.util.*;

public class OrdenaNomes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os nomes das pessoas, separados por vírgula:");
        String input = scanner.nextLine();


        String[] nomesArray = input.split(",");


        List<String> nomes = new ArrayList<>();
        for (String nome : nomesArray) {
            nomes.add(nome.trim());
        }


        Collections.sort(nomes);


        System.out.println("Nomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        scanner.close();
    }
}
