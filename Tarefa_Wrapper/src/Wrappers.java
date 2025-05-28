public class Wrappers {

    public static void main(String[] args) {
        Conversor();
    }

    public static void Conversor() {
        int idade = 10;
        System.out.println(idade);

        short idade2 = (short) idade;
        System.out.println(idade2);

        Short idadeNova = idade2;
        System.out.println(idadeNova);
    }
}
