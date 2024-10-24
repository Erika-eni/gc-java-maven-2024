package com.geracaocaldeira.java.Aula12.exe28;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Autor")
@Getter
@Setter
@AllArgsConstructor
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer autorID;

    @Column(name = "nome")
    private String name;

    @Column(name = "data_de_nasc")
    private Date dataNascimento;

}
