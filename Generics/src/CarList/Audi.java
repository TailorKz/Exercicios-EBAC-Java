package CarList;

public class Audi {
    private String modelo;
    private int ano;

    public Audi(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return "Audi {" +
                "modelo='" + modelo + '\'' +
                ", ano=" + ano +
                '}';
    }
}
