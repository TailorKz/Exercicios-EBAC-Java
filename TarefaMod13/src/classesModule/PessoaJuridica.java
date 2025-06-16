package classesModule;

public class PessoaJuridica extends Pessoa {
    private Integer tempoContrato;


    public Integer getTempoContrato() {
        return tempoContrato;
    }

    public void setTempoContrato(Integer tempoContrato) {
        this.tempoContrato = tempoContrato;
    }
    @Override
    public Double salarioAnual() {
        return getSalarioAnual();
    }
}
