package Musica;

import java.time.LocalDate;
import java.util.List;



public class GerenciadorDeMusica {

     
        private Discoteca acervo = new Discoteca();

        public Musica salvar(Musica musica) {

            List<Musica> musicas = acervo.listar();

            for (Musica musicaExistente : musicas) {
                if (musica.getNome().equals(musicaExistente.getNome())) {
                    return musicaExistente;
                }
            }

            if (musica.getLancamento().isAfter(LocalDate.now())) {
                return null;
            }

            return acervo.salvar(musica);
        }

        public Musica editar(int id, Musica musicaAtualizada) {

            Musica musicaParaEditar = procurar(id);

            if (musicaParaEditar == null) {
                return null;
            } else {
                return acervo.editar(musicaParaEditar, musicaAtualizada);
            }
        }

        public List<Musica> listar() {
            return acervo.listar();
        }

        public Musica procurar(int id) {

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

