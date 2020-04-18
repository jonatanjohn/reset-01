package br.com.cwi.reset.tinderapi.service;

import br.com.cwi.reset.tinderapi.dominio.Jogo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JogoService {

    private static Integer contador = 1;
    private static final List<Jogo> jogos = new ArrayList<>();

    public Jogo salvar(Jogo jogo) {

        jogo.setId(contador++);

        jogos.add(jogo);
        return jogo;
    }

    public List<Jogo> listar() {

        return jogos;
    }

    public Jogo procurar(Integer id) {

        for (Jogo jogo : jogos) {
            if (jogo.getId().equals(id)) {
                return jogo;
            }
        }

        return null;

    }

    public boolean deletar(Integer id) {

        Jogo jogoParaDeletar = procurar(id);
        if (jogoParaDeletar != null) {
            return jogos.remove(jogoParaDeletar);
        }

        return false;

    }
    public Jogo editar(Jogo jogoParaAtualizar, Integer id) {

        Jogo jogoParaEditar = procurar(id);
        jogoParaEditar.setNome(jogoParaAtualizar.getNome());
        jogoParaEditar.setPublisher(jogoParaAtualizar.getPublisher());
        jogoParaEditar.setEstiloJogo(jogoParaAtualizar.getEstiloJogo());
        jogoParaEditar.setLancamento(jogoParaAtualizar.getLancamento());
        jogoParaEditar.setPlataforma(jogoParaAtualizar.getPlataforma());

        return jogoParaEditar;

    }

}
