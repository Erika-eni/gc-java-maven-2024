package com.geracaocaldeira.java.Aula08;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExemploExcecaoTests {

    private ExemploExcecao exemplo;

    @Test
    public void isEvenSucess(){
        exemplo = new ExemploExcecao();
        Boolean result = exemplo.isEven(3);
        Assert.assertTrue(result);

    }

}
