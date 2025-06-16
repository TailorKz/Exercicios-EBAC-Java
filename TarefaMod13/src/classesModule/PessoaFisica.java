package classesModule;

public class PessoaFisica extends Pessoa {
    private Double diasFerias;
    private Double valor13;

    public Double getDiasFerias() {
        return diasFerias;
    }

    public void setDiasFerias(Double diasFerias) {
        this.diasFerias = diasFerias;
    }

    public Double getValor13() {
        return valor13;
    }

    public void setValor13(Double valor13) {
        this.valor13 = valor13;
    }

    @Override
    public Double salarioAnual() {
        return getSalarioAnual()+valor13;
    }
}
