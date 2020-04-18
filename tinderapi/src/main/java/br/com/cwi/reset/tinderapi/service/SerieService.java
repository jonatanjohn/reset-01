package br.com.cwi.reset.tinderapi.service;

import br.com.cwi.reset.tinderapi.dominio.Serie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SerieService {

    private static Integer contador = 1;
    private static final List<Serie> series = new ArrayList<>();

    public Serie salvar(Serie serie) {

        serie.setId(contador++);

        series.add(serie);
        return serie;
    }

    public List<Serie> listar() {

        return series;
    }

    public Serie procurar(Integer id) {

        for (Serie serie : series) {
            if (serie.getId().equals(id)) {
                return serie;
            }
        }

        return null;

    }

    public boolean deletar(Integer id) {

        Serie serieParaDeletar = procurar(id);
        if (serieParaDeletar != null) {
            return series.remove(serieParaDeletar);
        }

        return false;

    }
    public Serie editar(Serie serieParaAtualizar, Integer id) {

        Serie serieParaEditar = procurar(id);
        serieParaEditar.setNome(serieParaAtualizar.getNome());
        serieParaEditar.setDiretor(serieParaAtualizar.getDiretor());
        serieParaEditar.setEstiloSerie(serieParaAtualizar.getEstiloSerie());
        serieParaEditar.setLancamento(serieParaAtualizar.getLancamento());
        serieParaEditar.setSinopse(serieParaAtualizar.getSinopse());
        serieParaEditar.setNumeroTemporada(serieParaAtualizar.getNumeroTemporada());
        serieParaEditar.setNumeroEpisodio(serieParaAtualizar.getNumeroEpisodio());

        return serieParaEditar;

    }

}
