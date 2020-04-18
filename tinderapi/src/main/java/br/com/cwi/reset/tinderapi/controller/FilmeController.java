package br.com.cwi.reset.tinderapi.controller;


import br.com.cwi.reset.tinderapi.dominio.Filme;
import br.com.cwi.reset.tinderapi.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmeController {

    @Autowired
    private FilmeService filmeService;

    @PostMapping
    public Filme criarFilme(@RequestBody Filme filme) {
        return filmeService.salvar(filme);

    }

    @GetMapping
    public List<Filme> listar(){
        return filmeService.listar();
    }

    @GetMapping("/{id}")
    public Filme procurar(@PathVariable("id") Integer id) {
        return filmeService.procurar(id);

    }

    @DeleteMapping("/{id}")
    public boolean deletar (@PathVariable("id") Integer id) {
        return filmeService.deletar(id);

    }
    @PutMapping("/{id}")
    public Filme editar(@RequestBody Filme filme, @PathVariable("id") Integer id) {
        return filmeService.editar(filme, id);
    }

}
