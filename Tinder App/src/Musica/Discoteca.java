package Musica;

import java.util.ArrayList;
import java.util.List;
import Musica.Musica;

public class Discoteca {

        private static int contador = 1;
        private static final List<Musica> musicas = new ArrayList<>();

        public Musica salvar(Musica musica) {
            musica.setId(contador++);
            musicas.add(musica);
            return musica;
        }

        public List<Musica> listar() {

            return musicas;
        }

        public Musica procurar(int id) {

            for (Musica musica : musicas) {
                if (musica.getId() == id) {
                    return musica;
                }
            }

            return null;

        }

        public boolean deletar(int id) {

            Musica musicaParaDeletar = procurar(id);
            if (musicaParaDeletar != null) {
                return musicas.remove(musicaParaDeletar);
            }

            return false;

        }

        public Musica editar(final Musica musicaParaEditar, final Musica musicaAtualizada) {

            musicaParaEditar.setNome(musicaAtualizada.getNome());
            musicaParaEditar.setArtista(musicaAtualizada.getArtista());
            musicaParaEditar.setLancamento(musicaAtualizada.getLancamento());
            musicaParaEditar.setEstiloMusical(musicaAtualizada.getEstiloMusical());

            return musicaParaEditar;

        }
    }



