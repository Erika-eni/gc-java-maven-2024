package com.geracaocaldeira.java.Aula08;

public class Exercicio25 {
    public double soma(Double num1, Double num2){
        return num1 + num2;
    }
    public double diminui(Double num1, Double num2){
        return num1 - num2;
    }
    public double multiplica(Double num1, Double num2){
        return num1 * num2;
    }
    public Double divide(Double num1, Double num2){
        if(num2 != 0.0){
            return num1 / num2;
        }
        else {
            return null;
        }
    }
}
