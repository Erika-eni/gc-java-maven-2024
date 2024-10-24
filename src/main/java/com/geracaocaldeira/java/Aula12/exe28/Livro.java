package com.geracaocaldeira.java.Aula12.exe28;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "Livro")
@Getter
@Setter
@AllArgsConstructor
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer livroID;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "anoPublicacao")
    private Integer anoPublicacao;

    @ManyToMany
    @JoinColumn(name = "autorID", referencedColumnName = "autorID")
    private Autor autor;
}
