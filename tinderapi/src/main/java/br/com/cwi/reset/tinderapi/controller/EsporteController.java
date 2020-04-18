package br.com.cwi.reset.tinderapi.controller;


import br.com.cwi.reset.tinderapi.dominio.Esporte;
import br.com.cwi.reset.tinderapi.service.EsporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/esportes")
public class EsporteController {

    @Autowired
    private EsporteService esporteService;

    @PostMapping
    public Esporte criarEsporte(@RequestBody Esporte esporte) {
        return esporteService.salvar(esporte);

    }

    @GetMapping
    public List<Esporte> listar(){
        return esporteService.listar();
    }

    @GetMapping("/{id}")
    public Esporte procurar(@PathVariable("id") Integer id) {
        return esporteService.procurar(id);

    }

    @DeleteMapping("/{id}")
    public boolean deletar (@PathVariable("id") Integer id) {
        return esporteService.deletar(id);

    }
    @PutMapping("/{id}")
    public Esporte editar(@RequestBody Esporte esporte, @PathVariable("id") Integer id) {
        return esporteService.editar(esporte, id);
    }

}
