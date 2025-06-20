public class Toyota extends Carro {
    public Toyota(String modelo, String cor, int ano) {
        super(new Modelo(modelo), cor, ano);
    }
}