package com.geracaocaldeira.java.Aula12.exe28;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Table(name = "Emprestimo")
@Getter
@Setter
@AllArgsConstructor
public class Emprestimo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer emrpestimoID;

    @Column(name = "nomePessoa")
    private String nomePessoa;

    @Column(name = "dataEmprestimo")
    private Date dataEmprestimo;

    @Column(name = "dataDevolucao")
    private Date dataDevolucao;

    @OneToMany //relacao
    @JoinColumn(name = "livroID", referencedColumnName = "livroID") //fk
    private Livro livro;
}
