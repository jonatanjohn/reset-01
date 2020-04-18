package br.com.cwi.reset.tinderapi.controller;


import br.com.cwi.reset.tinderapi.dominio.Jogo;
import br.com.cwi.reset.tinderapi.service.JogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jogos")
public class JogoController {

    @Autowired
    private JogoService jogoService;

    @PostMapping
    public Jogo criarJogo(@RequestBody Jogo jogo) {
        return jogoService.salvar(jogo);

    }

    @GetMapping
    public List<Jogo> listar(){
        return jogoService.listar();
    }

    @GetMapping("/{id}")
    public Jogo procurar(@PathVariable("id") Integer id) {
        return jogoService.procurar(id);

    }

    @DeleteMapping("/{id}")
    public boolean deletar (@PathVariable("id") Integer id) {
        return jogoService.deletar(id);

    }
    @PutMapping("/{id}")
    public Jogo editar(@RequestBody Jogo jogo, @PathVariable("id") Integer id) {
        return jogoService.editar(jogo, id);
    }

}
