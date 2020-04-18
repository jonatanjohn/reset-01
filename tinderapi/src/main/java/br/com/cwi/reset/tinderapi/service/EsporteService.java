package br.com.cwi.reset.tinderapi.service;

import br.com.cwi.reset.tinderapi.dominio.Esporte;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class EsporteService {

    private static Integer contador = 1;
    private static final List<Esporte> esportes = new ArrayList<>();

    public Esporte salvar(Esporte esporte) {

        esporte.setId(contador++);

        esportes.add(esporte);
        return esporte;
    }

    public List<Esporte> listar() {

        return esportes;
    }

    public Esporte procurar(Integer id) {

        for (Esporte esporte : esportes) {
            if (esporte.getId().equals(id)) {
                return esporte;
            }
        }

        return null;

    }

    public boolean deletar(Integer id) {

        Esporte esporteParaDeletar = procurar(id);
        if (esporteParaDeletar != null) {
            return esportes.remove(esporteParaDeletar);
        }

        return false;

    }
    public Esporte editar(Esporte esporteParaAtualizar, Integer id) {

        Esporte esporteParaEditar = procurar(id);
        esporteParaEditar.setNome(esporteParaAtualizar.getNome());


        return esporteParaEditar;

    }

}
