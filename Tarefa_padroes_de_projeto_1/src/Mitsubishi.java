public class Mitsubishi extends Carro {
    public Mitsubishi(String modelo, String cor, int ano) {
        super(new Modelo(modelo), cor, ano);
    }
}