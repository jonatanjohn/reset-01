package Usuario;

import java.util.ArrayList;
import java.util.List;


public class AcervoUsuario {

    private static int contador = 1;
    private static final List<Usuario> usuarios = new ArrayList<>();

    public Usuario salvar(Usuario usuario) {
        usuario.setId(contador++);
        usuarios.add(usuario);
        return usuario;
    }

    public List<Usuario> listar() {

        return usuarios;
    }

    public Usuario procurar(int id) {

        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }

        return null;

    }

    public boolean deletar(int id) {

        Usuario usuarioParaDeletar = procurar(id);
        if (usuarioParaDeletar != null) {
            return usuarios.remove(usuarioParaDeletar);
        }

        return false;

    }

    public Usuario editar(Usuario usuarioParaEditar, Usuario usuarioAtualizada) {

        usuarioParaEditar.setNome(usuarioAtualizada.getNome());
        usuarioParaEditar.setEmail(usuarioAtualizada.getEmail());
        usuarioParaEditar.setTelefone(usuarioAtualizada.getTelefone());
        usuarioParaEditar.setDataDeNascimento(usuarioAtualizada.getDataDeNascimento());
        usuarioParaEditar.setBio(usuarioAtualizada.getBio());
        usuarioParaEditar.setLatitude(usuarioAtualizada.getLatitude());
        usuarioParaEditar.setLongitude(usuarioAtualizada.getLongitude());



        return usuarioParaEditar;

    }
}


