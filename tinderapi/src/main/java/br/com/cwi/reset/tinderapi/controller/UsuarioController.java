package br.com.cwi.reset.tinderapi.controller;


import br.com.cwi.reset.tinderapi.dominio.Usuario;
import br.com.cwi.reset.tinderapi.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public Usuario criarUsuario(@RequestBody Usuario usuario) {
        return usuarioService.salvar(usuario);

    }

    @GetMapping
    public List<Usuario> listar(){
        return usuarioService.listar();
    }

    @GetMapping("/{id}")
    public Usuario procurar(@PathVariable("id") Integer id) {
        return usuarioService.procurar(id);

    }

    @DeleteMapping("/{id}")
    public boolean deletar (@PathVariable("id") Integer id) {
        return usuarioService.deletar(id);

    }
    @PutMapping("/{id}")
    public Usuario editar(@RequestBody Usuario usuario, @PathVariable("id") Integer id) {
        return usuarioService.editar(usuario, id);
    }

}
