package com.geracaocaldeira.java.jpaexemplo.entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "pessoa")
@Getter
@Setter
@AllArgsConstructor
public class PessoaEntidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pessoaID;

    @Column(name = "pessoa_name")
    private String name;


}
