package com.geracaocaldeira.java.jpaexemplo.repositorios;


import com.geracaocaldeira.java.jpaexemplo.entidades.PessoaEntidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepositorio extends JpaRepository<PessoaEntidade, Integer> {
    @Query()
    void findPessoaByName();
}
