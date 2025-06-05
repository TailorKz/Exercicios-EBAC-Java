import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NomesOrdemAlfabetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite no mínimo 3 nomes, separados por vírgula: ");
        String res = scanner.nextLine();

        String[] nomes = res.split(",");
        List<String> nomesLista = new ArrayList<>();

        for (String nome : nomes) {
            nomesLista.add(nome.trim());
        }

        Collections.sort(nomesLista);
        System.out.println("Os nomes em ordem alfabética são: " + nomesLista);
    }
}

