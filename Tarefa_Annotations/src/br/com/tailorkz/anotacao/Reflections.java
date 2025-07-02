package br.com.tailorkz.anotacao;

import java.lang.annotation.Annotation;

public class Reflections {

    private static void executeLeituraAnotacao() {

        AnnotationClass prod = new AnnotationClass();
        Annotation[] annotations = prod.getClass().getAnnotations();

        for (Annotation an : annotations) {
            System.out.println("Annotation type: " + an.annotationType());

            if (an instanceof Tabela) {
                Tabela tabela = (Tabela) an;
                System.out.println("Valor da anotação @Tabela: " + tabela.nomeTabela());
            }
        }
    }

    public static void main(String[] args) {
        executeLeituraAnotacao();
    }
}
