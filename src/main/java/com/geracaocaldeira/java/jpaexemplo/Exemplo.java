package com.geracaocaldeira.java.jpaexemplo;

import com.geracaocaldeira.java.jpaexemplo.repositorios.PessoaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;

public class Exemplo {
    @Autowired
    private PessoaRepositorio pessoaRepositorio;

    private void teste(){
        pessoaRepositorio.findPessoaByName();
    }
}
