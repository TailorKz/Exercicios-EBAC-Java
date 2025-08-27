package com.tailorkz.test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FullTests {
    @Test
    void testeSoma() {
        int A = 5;
        int B = 2;
        int soma = A + B;

        Assertions.assertEquals(7, soma);
        System.out.println("O teste passou.");
    }
}
