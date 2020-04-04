package Usuario;

import java.time.LocalDate;
import java.util.List;

public class GerenciamentoDeUsuario {


        private AcervoUsuario acervo = new AcervoUsuario();

        public Usuario salvar(Usuario usuario) {

            List<Usuario> usuarios = acervo.listar();

            for (Usuario usuarioExistente : usuarios) {
                if (usuario.getNome().equals(usuarioExistente.getNome())) {
                    return usuarioExistente;
                }
            }

            if (usuario.getDataDeNascimento().isAfter(LocalDate.now())) {
                return null;
            }

            return acervo.salvar(usuario);
        }

        public Usuario editar(int id, Usuario usuarioAtualizada) {

            Usuario usuarioParaEditar = procurar(id);

            if (usuarioParaEditar == null) {
                return null;
            } else {
                return acervo.editar(usuarioParaEditar, usuarioAtualizada);
            }
        }

        public List<Usuario> listar() {
            return acervo.listar();
        }

        public Usuario procurar(int id) {

            if (id > 0) {
                return acervo.procurar(id);
            }

            return null;

        }

        public boolean deletar(int id) {
            if (id > 0) {
                return acervo.deletar(id);
            }

            return false;
        }
    }





