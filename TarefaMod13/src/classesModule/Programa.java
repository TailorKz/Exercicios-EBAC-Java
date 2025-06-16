package classesModule;

public class Programa {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setNome("João");
        pessoaFisica.setDiasFerias(30d);
        pessoaFisica.setIdade(23);
        pessoaFisica.setFuncao("Front end developer");
        pessoaFisica.setSalarioAnual(60000d);
        pessoaFisica.setValor13(4000d);
        System.out.println(pessoaFisica.getNome() + " De " + pessoaFisica.getIdade() + " anos, tem salário anual de R$: " + pessoaFisica.salarioAnual() + " correspondente a função de " + pessoaFisica.getFuncao() + " e um valor de 13 de R$ " + pessoaFisica.getValor13() + ".");

        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setNome("Maria");
        pessoaJuridica.setFuncao("Analista de TI");
        pessoaJuridica.setSalarioAnual(70000d);
        pessoaJuridica.setIdade(25);
        pessoaJuridica.setTempoContrato(12);
        System.out.println(pessoaJuridica.getNome() + " De " + pessoaJuridica.getIdade() + " anos, tem salário anual de R$: " + pessoaJuridica.salarioAnual() + " correspondente a função de " + pessoaJuridica.getFuncao() + " e um tempo de contrato de " + pessoaJuridica.getTempoContrato() + " meses.");

    }
}
