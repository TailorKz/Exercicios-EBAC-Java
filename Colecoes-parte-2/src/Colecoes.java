import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Colecoes {
    public static void main(String[] args) {
        Cadastro();
    }

    private static void Cadastro() {
        Scanner scanner = new Scanner(System.in);
        List<String> masculino = new ArrayList<>();
        List<String> feminino = new ArrayList<>();

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();
        System.out.println("Digite seu sexo: (Masculino ou Feminino)");
        String sexo = scanner.nextLine();

        if (sexo.equals("Masculino") || sexo.equals("masculino")) {
            masculino.add(nome);
        } else if (sexo.equals("Feminino") || sexo.equals("feminino")) {
            feminino.add(nome);
        } else {
            System.out.println("Sexo inválido, digite novamente.");
        }
        System.out.println("A lista masculina possui " + masculino.size() +" cadastrados, contendo "+ masculino);
        System.out.println("A lista feminina possui " + feminino.size() +" cadastrados, contendo "+ feminino);
    }
}
