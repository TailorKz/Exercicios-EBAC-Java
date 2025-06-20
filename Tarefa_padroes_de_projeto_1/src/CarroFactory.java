public class CarroFactory {
    public static Carro criarToyota(String modelo, String cor, int ano) {
        return new Toyota(modelo, cor, ano);
    }

    public static Carro criarMitsubishi(String modelo, String cor, int ano) {
        return new Mitsubishi(modelo, cor, ano);
    }
}