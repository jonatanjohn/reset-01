package br.com.cwi.reset.tinderapi.service;

import br.com.cwi.reset.tinderapi.dominio.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {

    private static Integer contador = 1;
    private static final List<Usuario> usuarios = new ArrayList<>();

    public Usuario salvar(Usuario usuario) {

        usuario.setId(contador++);

        usuarios.add(usuario);
        return usuario;
    }

    public List<Usuario> listar() {

        return usuarios;
    }

    public Usuario procurar(Integer id) {

        for (Usuario usuario : usuarios) {
            if (usuario.getId().equals(id)) {
                return usuario;
            }
        }

        return null;

    }

    public boolean deletar(Integer id) {

        Usuario usuarioParaDeletar = procurar(id);
        if (usuarioParaDeletar != null) {
            return usuarios.remove(usuarioParaDeletar);
        }

        return false;

    }
    public Usuario editar(Usuario usuarioParaAtualizar, Integer id) {

        Usuario usuarioParaEditar = procurar(id);
        usuarioParaEditar.setNome(usuarioParaAtualizar.getNome());
        usuarioParaEditar.setEmail(usuarioParaAtualizar.getEmail());
        usuarioParaEditar.setTelefone(usuarioParaAtualizar.getTelefone());
        usuarioParaEditar.setDataDeNascimento(usuarioParaAtualizar.getDataDeNascimento());
        usuarioParaEditar.setBio(usuarioParaAtualizar.getBio());
        usuarioParaEditar.setLatitude(usuarioParaAtualizar.getLatitude());
        usuarioParaEditar.setLongitude(usuarioParaAtualizar.getLongitude());

        return usuarioParaEditar;

    }

}
