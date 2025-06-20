public class Modelo {
    private String nome;

    protected Modelo(String nome){
        this.nome = nome;
    }


    public String getNome() {return nome;}

    @Override
    public String toString() {
        return nome;
    }
}
