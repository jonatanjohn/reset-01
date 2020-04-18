package br.com.cwi.reset.tinderapi.controller;


import br.com.cwi.reset.tinderapi.dominio.Curiosidade;
import br.com.cwi.reset.tinderapi.service.CuriosidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/curiosidades")
public class CuriosidadeController {

    @Autowired
    private CuriosidadeService curiosidadeService;

    @PostMapping
    public Curiosidade criarCuriosidade(@RequestBody Curiosidade curiosidade) {
        return curiosidadeService.salvar(curiosidade);

    }

    @GetMapping
    public List<Curiosidade> listar(){
        return curiosidadeService.listar();
    }

    @GetMapping("/{id}")
    public Curiosidade procurar(@PathVariable("id") Integer id) {
        return curiosidadeService.procurar(id);

    }

    @DeleteMapping("/{id}")
    public boolean deletar (@PathVariable("id") Integer id) {
        return curiosidadeService.deletar(id);

    }
    @PutMapping("/{id}")
    public Curiosidade editar(@RequestBody Curiosidade curiosidade, @PathVariable("id") Integer id) {
        return curiosidadeService.editar(curiosidade, id);
    }

}
