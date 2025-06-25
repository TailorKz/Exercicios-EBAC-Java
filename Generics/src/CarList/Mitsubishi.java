package CarList;

public class Mitsubishi {
    private String modelo;
    private int ano;

    public Mitsubishi(String modelo, int ano) {
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
        return "Mitsubishi {" +
                "modelo='" + modelo + '\'' +
                ", ano=" + ano +
                '}';
    }
}
