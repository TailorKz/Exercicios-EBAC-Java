package com.tailorkz.streams;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FiltraGenero {

    public static List<String> filtrarFeminino(String entrada) {
        String[] pessoas = entrada.split(",");

        return Arrays.stream(pessoas)
                .map(String::trim)
                .filter(pessoa -> {
                    String[] partes = pessoa.split("-");
                    return partes[1].equalsIgnoreCase("F");
                })
                .map(pessoa -> pessoa.split("-")[0])
                .collect(Collectors.toList());
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os nomes e sexos separados por vírgula. Exemplo: João-M, Maria-F, Juca-M");
        String valores = scanner.nextLine();

        List<String> feminino = filtrarFeminino(valores);

        System.out.println("Lista de pessoas do gênero feminino:");
        for (String nome : feminino) {
            System.out.println(nome);
        }
    }
}
