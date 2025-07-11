package com.tailorkz.streams;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class FiltraGeneroTest {

    @Test
    public void testSomenteFeminino() {
        String entrada = "João-M, Carla-F, Bruno-M, Beatriz-F";
        List<String> resultado = FiltraGenero.filtrarFeminino(entrada);
        List<String> esperado = List.of("Carla", "Beatriz");
        assertEquals(esperado, resultado);
    }
}