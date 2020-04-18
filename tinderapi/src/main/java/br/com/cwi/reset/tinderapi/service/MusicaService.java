package br.com.cwi.reset.tinderapi.service;

import br.com.cwi.reset.tinderapi.dominio.Musica;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MusicaService {

    private static Integer contador = 1;
    private static final List<Musica> musicas = new ArrayList<>();

    public Musica salvar(Musica musica) {

        musica.setId(contador++);

        musicas.add(musica);
        return musica;
    }

    public List<Musica> listar() {

        return musicas;
    }

    public Musica procurar(Integer id) {

        for (Musica musica : musicas) {
            if (musica.getId().equals(id)) {
                return musica;
            }
        }

        return null;

    }

    public boolean deletar(Integer id) {

        Musica musicaParaDeletar = procurar(id);
        if (musicaParaDeletar != null) {
            return musicas.remove(musicaParaDeletar);
        }

        return false;

    }
    public Musica editar(Musica musicaParaAtualizar, Integer id) {

        Musica musicaParaEditar = procurar(id);
        musicaParaEditar.setNome(musicaParaAtualizar.getNome());
        musicaParaEditar.setArtista(musicaParaAtualizar.getArtista());
        musicaParaEditar.setEstiloMusical(musicaParaAtualizar.getEstiloMusical());
        musicaParaEditar.setLancamento(musicaParaAtualizar.getLancamento());

        return musicaParaEditar;

    }

}
