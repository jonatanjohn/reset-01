package br.com.cwi.reset.tinderapi.controller;


import br.com.cwi.reset.tinderapi.dominio.Serie;
import br.com.cwi.reset.tinderapi.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/series")
public class SerieController {

    @Autowired
    private SerieService serieService;

    @PostMapping
    public Serie criarSerie(@RequestBody Serie serie) {
        return serieService.salvar(serie);

    }

    @GetMapping
    public List<Serie> listar(){
        return serieService.listar();
    }

    @GetMapping("/{id}")
    public Serie procurar(@PathVariable("id") Integer id) {
        return serieService.procurar(id);

    }

    @DeleteMapping("/{id}")
    public boolean deletar (@PathVariable("id") Integer id) {
        return serieService.deletar(id);

    }
    @PutMapping("/{id}")
    public Serie editar(@RequestBody Serie serie, @PathVariable("id") Integer id) {
        return serieService.editar(serie, id);
    }

}
