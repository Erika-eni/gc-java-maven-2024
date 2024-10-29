package com.geracaocaldeira.java.Aula08;
import org.junit.Test;
import org.junit.Assert;

public class Exercicio25Tests {
    private Exercicio25 exe25 = new Exercicio25();
    Double num1 = 1.3;
    Double num2 = 2.0;

    @Test
    public void soma(){
        Double resultE = 3.3;
        Double result = exe25.soma(num1,num2);
        Assert.assertEquals(resultE, result);
    }

    @Test
    public void diminui(){
        Double resultE = -0.7;
        Double result = exe25.diminui(num1,num2);
        Assert.assertEquals(resultE, result);
    }

    @Test
    public void multiplica(){
        Double resultE = 2.6;
        Double result = exe25.multiplica(num1,num2);
        Assert.assertEquals(resultE, result);
    }

    @Test
    public void divide(){
        Double resultE = 0.65;
        Double result = exe25.divide(num1,num2);
        Assert.assertEquals(resultE, result);
    }
    @Test
    public void divideNull(){
        CaldeiraException resultE = new CaldeiraException("Não pode por zero");
        Double result = exe25.divide(num1,0.0);
        Assert.assertEquals(resultE, result);
    }

}
