package com.geracaocaldeira.java.jpaExemplo2.Entity;

import javax.persistence.*;

//define o comportamento das tabelas do banco
@Entity //definir como entidade, jpa q traz
@Table(name = "Pessoa")
public class PessoaEntity {

    @Id //define como id
    @GeneratedValue(strategy = GenerationType.AUTO) //gera o id automático
    private Integer id;
    private String nome;
    private Integer idade;
}
