public abstract class Carro {
    protected Modelo modelo;
    protected String cor;
    protected int ano;
    protected boolean ligado;

    protected Carro(Modelo modelo, String cor, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.ligado = false;
    }

    public void ligar() {
        this.ligado = true;
        System.out.println(modelo + " está ligado.");
    }

    public void desligar() {
        this.ligado = false;
        System.out.println(modelo + " está desligado.");
    }

    public Modelo getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }

    public boolean isLigado() {
        return ligado;
    }

    @Override
    public String toString() {
        return "Carro: " + modelo
                + " | Ano: " + ano
                + " | Cor: " + cor
                + " | Status: " + (ligado ? "Ligado" : "Desligado");
    }
}
