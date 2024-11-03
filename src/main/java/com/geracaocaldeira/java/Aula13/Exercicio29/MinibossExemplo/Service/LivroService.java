package com.geracaocaldeira.java.Aula13.Exercicio29.MinibossExemplo.Service;


import com.geracaocaldeira.java.Aula13.Exercicio29.MinibossExemplo.Model.Livro;
import com.geracaocaldeira.java.Aula13.Exercicio29.MinibossExemplo.Repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {
    @Autowired
    private LivroRepository livroRepository;

    public List<Livro> findAll() {
        return livroRepository.findAll();
    }

    public Optional<Livro> findById(Long id) {
        return livroRepository.findById(id);
    }

    public Livro save(Livro livro) {
        return livroRepository.save(livro);
    }

    public void deleteById(Long id) {
        livroRepository.deleteById(id);
    }
}
