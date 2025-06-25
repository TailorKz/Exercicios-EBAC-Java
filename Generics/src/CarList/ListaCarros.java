package CarList;

import java.util.ArrayList;
import java.util.List;

public class ListaCarros<T> {

    private List<T> carros;

    public ListaCarros() {
        this.carros = new ArrayList<>();
    }

    public void adicionarCarro(T carro) {
        carros.add(carro);
    }

    public void listaCarro() {
        for (T carro : carros) {
            System.out.println(carro);
        }
    }
}
