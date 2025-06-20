//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Carro carro1 = CarroFactory.criarMitsubishi("Lancer", "Preto", 2008);
        Carro carro2 = CarroFactory.criarMitsubishi("Eclipse", "Azul", 2025);
        Carro carro3 = CarroFactory.criarToyota("Corolla", "Vermelho", 2010);

        carro2.ligar();

        System.out.println(carro1);
        System.out.println(carro2);
        System.out.println(carro3);
    }
}