package com.geracaocaldeira.java.Aula13.Exercicio29.MinibossExemplo.Controller;

import com.geracaocaldeira.java.Aula13.Exercicio29.MinibossExemplo.Model.Livro;
import com.geracaocaldeira.java.Aula13.Exercicio29.MinibossExemplo.Service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/livros")
public class LivroController {
    @Autowired
    private LivroService livroService;

    @GetMapping
    public List<Livro> getAllLivros() {
        return livroService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Livro> getLivroById(@PathVariable Long id) {
        return livroService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Livro createLivro(@RequestBody Livro livro) {
        return livroService.save(livro);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLivro(@PathVariable Long id) {
        livroService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
