package Filme;

import java.util.ArrayList;
import java.util.List;


public class AcervoDeFilme {

    private static int contador = 1;
    private static final List<Filme> filmes = new ArrayList<>();

    public Filme salvar(Filme filme) {
        filme.setId(contador++);
        filmes.add(filme);
        return filme;
    }

    public List<Filme> listar() {

        return filmes;
    }

    public Filme procurar(int id) {

        for (Filme filme : filmes) {
            if (filme.getId() == id) {
                return filme;
            }
        }

        return null;

    }

    public boolean deletar(int id) {

        Filme filmeParaDeletar = procurar(id);
        if (filmeParaDeletar != null) {
            return filmes.remove(filmeParaDeletar);
        }

        return false;

    }

    public Filme editar(Filme filmeParaEditar, Filme filmeAtualizada) {

        filmeParaEditar.setNome(filmeAtualizada.getNome());
        filmeParaEditar.setDiretor(filmeAtualizada.getDiretor());
        filmeParaEditar.setLancamento(filmeAtualizada.getLancamento());
        filmeParaEditar.setEstiloFilme(filmeAtualizada.getEstiloFilme());
        filmeParaEditar.setSinopseFilme(filmeAtualizada.getSinopseFilme());



        return filmeParaEditar;

    }
}
