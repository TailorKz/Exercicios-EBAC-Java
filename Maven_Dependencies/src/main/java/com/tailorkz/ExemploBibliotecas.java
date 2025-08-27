package com.tailorkz;
import org.apache.commons.lang3.StringUtils;


public class ExemploBibliotecas {
    public static void main(String[] args) {
    String textoTeste = "Teste texto";
    boolean isBlankContain = StringUtils.isBlank(textoTeste);
        System.out.println("A string está vazia? "+isBlankContain);
    }
}
