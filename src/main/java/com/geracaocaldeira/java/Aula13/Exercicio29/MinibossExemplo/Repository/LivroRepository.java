package com.geracaocaldeira.java.Aula13.Exercicio29.MinibossExemplo.Repository;

import com.geracaocaldeira.java.Aula13.Exercicio29.MinibossExemplo.Model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
