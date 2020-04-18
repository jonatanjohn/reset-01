package br.com.cwi.reset.tinderapi.service;

import br.com.cwi.reset.tinderapi.dominio.Curiosidade;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CuriosidadeService {

    private static Integer contador = 1;
    private static final List<Curiosidade> curiosidades = new ArrayList<>();

    public Curiosidade salvar(Curiosidade curiosidade) {

        curiosidade.setId(contador++);

        curiosidades.add(curiosidade);
        return curiosidade;
    }

    public List<Curiosidade> listar() {

        return curiosidades;
    }

    public Curiosidade procurar(Integer id) {

        for (Curiosidade curiosidade : curiosidades) {
            if (curiosidade.getId().equals(id)) {
                return curiosidade;
            }
        }

        return null;

    }

    public boolean deletar(Integer id) {

        Curiosidade curiosidadeParaDeletar = procurar(id);
        if (curiosidadeParaDeletar != null) {
            return curiosidades.remove(curiosidadeParaDeletar);
        }

        return false;

    }
    public Curiosidade editar(Curiosidade curiosidadeParaAtualizar, Integer id) {

        Curiosidade curiosidadeParaEditar = procurar(id);
        curiosidadeParaEditar.setDescricao(curiosidadeParaAtualizar.getDescricao());
        curiosidadeParaEditar.setEstiloCuriosidades(curiosidadeParaAtualizar.getEstiloCuriosidades());

        return curiosidadeParaEditar;

    }

}
