package com.geracaocaldeira.java.jpaExemplo2.Repository;

import com.geracaocaldeira.java.jpaExemplo2.Entity.PessoaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<PessoaEntity, Integer> { //refencia pelo id
}
