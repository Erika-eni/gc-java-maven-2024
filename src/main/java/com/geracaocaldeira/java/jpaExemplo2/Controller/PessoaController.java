package com.geracaocaldeira.java.jpaExemplo2.Controller;
//classe para enviar e receber os dados(regras)

import com.geracaocaldeira.java.jpaExemplo2.Entity.PessoaEntity;
import com.geracaocaldeira.java.jpaExemplo2.Service.PessoaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pessoa") //pra acessar no end-point
public class PessoaController {
    private PessoaService service;

    public PessoaController(PessoaService service){ //porta de entrada pro spring
        this.service = service;
    }

    @GetMapping("/getById/{id}") //pega info do banco e devolve pro usuário
    public ResponseEntity<PessoaEntity> getPeessoaById (@PathVariable Integer id){ //PathVariable faz com que tranforme o num q o usuário colocou na url ali em {id}
        var result = service.getById(id);
        if (result == null) return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);//retorna o código http q foi decidico

        return new ResponseEntity<>(result, HttpStatus.OK);
    }


}
