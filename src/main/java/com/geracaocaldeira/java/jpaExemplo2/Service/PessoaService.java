package com.geracaocaldeira.java.jpaExemplo2.Service;
//lógica dos dados

import com.geracaocaldeira.java.jpaExemplo2.Entity.PessoaEntity;
import com.geracaocaldeira.java.jpaExemplo2.Repository.Repository;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {
    private final Repository repository;

    public PessoaService(Repository repository){
        this.repository = repository;
    }

    public PessoaEntity getById(Integer id){
        var pessoa = repository.findById(id);
        if(pessoa.isPresent()){
        return pessoa.get();
        } else {
            return null;
        }
    }

}
