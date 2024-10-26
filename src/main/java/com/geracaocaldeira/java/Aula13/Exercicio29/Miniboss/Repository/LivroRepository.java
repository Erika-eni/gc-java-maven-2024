package com.geracaocaldeira.java.Aula13.Exercicio29.Miniboss.Repository;

import com.geracaocaldeira.java.Aula13.Exercicio29.Miniboss.Model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
