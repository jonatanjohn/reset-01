package br.com.cwi.reset.tinderapi.service;

import br.com.cwi.reset.tinderapi.dominio.Filme;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FilmeService {

    private static Integer contador = 1;
    private static final List<Filme> filmes = new ArrayList<>();

    public Filme salvar(Filme filme) {

        filme.setId(contador++);

        filmes.add(filme);
        return filme;
    }

    public List<Filme> listar() {

        return filmes;
    }

    public Filme procurar(Integer id) {

        for (Filme filme : filmes) {
            if (filme.getId().equals(id)) {
                return filme;
            }
        }

        return null;

    }

    public boolean deletar(Integer id) {

        Filme filmeParaDeletar = procurar(id);
        if (filmeParaDeletar != null) {
            return filmes.remove(filmeParaDeletar);
        }

        return false;

    }
    public Filme editar(Filme filmeParaAtualizar, Integer id) {

        Filme filmeParaEditar = procurar(id);
        filmeParaEditar.setNome(filmeParaAtualizar.getNome());
        filmeParaEditar.setDiretor(filmeParaAtualizar.getDiretor());
        filmeParaEditar.setEstiloFilme(filmeParaAtualizar.getEstiloFilme());
        filmeParaEditar.setLancamento(filmeParaAtualizar.getLancamento());
        filmeParaEditar.setSinopse(filmeParaAtualizar.getSinopse());

        return filmeParaEditar;

    }

}
