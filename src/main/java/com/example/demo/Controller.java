package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class Controller {

    @Autowired
    private BancoDeDados bancoDeDados;

    @PostMapping("/")
    public Agenda criar(@RequestBody Agenda agenda){
        agenda = bancoDeDados.criar(agenda);
        return agenda;
    }

    @GetMapping
    public List<Agenda> listar(){
        return bancoDeDados.listar();
    }

    @PutMapping("/{id}")
    public Agenda atualizar(@PathVariable Long id, @RequestBody Agenda agenda){
        return bancoDeDados.atualizar(id, agenda);
    }


    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        bancoDeDados.deletar(id);
    }
}
