import java.util.Scanner;

public class ControleDeFluxo {
    public static void main(String[] args) {
        Calculo();
    }
    public static void Calculo() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a nota do primeiro bimestre: ");
        double first = scanner.nextDouble();

        System.out.println("Digite a nota do segundo bimestre: ");
        double second = scanner.nextDouble();

        System.out.println("Digite a nota do terceiro bimestre: ");
        double third = scanner.nextDouble();

        System.out.println("Digite a nota do quarto bimestre: ");
        double fourth = scanner.nextDouble();

        double soma = first + second + third + fourth;
        double media = soma / 4;

        if (media >= 7) {
            System.out.println("Você está aprovado, média final " + media);
        } else if (media >= 5) {
            System.out.println("Você está de recuperação, média final " + media);
        } else System.out.println("Você está reprovado, média final " + media);

    }
}
