package br.com.cwi.reset.tinderapi.controller;


import br.com.cwi.reset.tinderapi.dominio.Musica;
import br.com.cwi.reset.tinderapi.service.MusicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/musicas")
public class MusicaController {

    @Autowired
    private MusicaService musicaService;

    @PostMapping
    public Musica criarMusica(@RequestBody Musica musica) {
        return musicaService.salvar(musica);

    }

    @GetMapping
    public List<Musica> listar(){
        return musicaService.listar();
    }

    @GetMapping("/{id}")
    public Musica procurar(@PathVariable("id") Integer id) {
        return musicaService.procurar(id);

    }

    @DeleteMapping("/{id}")
    public boolean deletar (@PathVariable("id") Integer id) {
        return musicaService.deletar(id);

    }
    @PutMapping("/{id}")
    public Musica editar(@RequestBody Musica musica, @PathVariable("id") Integer id) {
        return musicaService.editar(musica, id);
    }

}
