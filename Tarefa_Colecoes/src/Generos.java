import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Generos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> masculino = new ArrayList<>();
        List<String> feminino = new ArrayList<>();

        System.out.println("Digite os nomes e sexos separados por vírgula. Exemplo: João-M, Maria-F, Juca-M");
        String res = scanner.nextLine().trim();

        String[] entradas = res.split(",");

        for (String entrada : entradas) {
            String[] partes = entrada.trim().split("-");

            if (partes.length == 2) {
                String nome = partes[0].trim();
                String sexo = partes[1].trim().toUpperCase();

                if (sexo.equals("M")) {
                    masculino.add(nome);
                } else if (sexo.equals("F")) {
                    feminino.add(nome);
                } else {
                    System.out.println("Sexo inválido em: " + entrada + " (Use apenas M ou F)");
                }
            } else {
                System.out.println("Formato inválido em: " + entrada + " (Use Nome-M ou Nome-F)");
            }
        }

        System.out.println("Grupo masculino possui " + masculino.size() + " integrante(s), contendo o(s) nome(s): " + masculino);
        System.out.println("Grupo feminino possui " + feminino.size() + " integrante(s), contendo o(s) nome(s): " + feminino);
    }
}
