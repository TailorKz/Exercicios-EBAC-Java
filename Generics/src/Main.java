import CarList.Audi;
import CarList.Honda;
import CarList.ListaCarros;
import CarList.Mitsubishi;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ListaCarros<Object> carosList = new ListaCarros<>();
        carosList.adicionarCarro(new Honda ("Civic", 2024));
        carosList.adicionarCarro(new Honda ("HRV", 2019));
        carosList.adicionarCarro(new Audi ("A4", 2021));
        carosList.adicionarCarro(new Mitsubishi("Lancer", 2014));

        System.out.println("Carros na nossa lista: ");
        carosList.listaCarro();


    }
}