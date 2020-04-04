package Esportes;

import java.time.LocalDate;
import java.util.List;

public class GerenciadorDeEsporte {
    private AcervoDeEsporte acervo = new AcervoDeEsporte();

    public Esporte salvar(Esporte esporte) {

        List<Esporte> esportes = acervo.listar();

        for (Esporte esporteExistente : esportes) {
            if (esporte.getNome().equals(esporteExistente.getNome())) {
                return esporteExistente;
            }
        }

        return acervo.salvar(esporte);
    }

    public Esporte editar(int id, Esporte esporteAtualizada) {

        Esporte esporteParaEditar = procurar(id);

        if (esporteParaEditar == null) {
            return null;
        } else {
            return acervo.editar(esporteParaEditar, esporteAtualizada);
        }
    }

    public List<Esporte> listar() {
        return acervo.listar();
    }

    public Esporte procurar(int id) {

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
