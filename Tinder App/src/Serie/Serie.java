package Serie;

import java.time.LocalDate;

public class Serie {


        private int id;

        private String nome;

        private String diretor;

        private EstiloSerie estiloSerie;

        private LocalDate lancamento;

        private String sinopse;

        private int numeroTemporada;

        private int numeroEpisodio;

        public Serie(String nome, String diretor, EstiloSerie estiloSerie, LocalDate lancamento, String sinopse, int numeroTemporada, int numeroEpisodio) {

            this.nome = nome;
            this.diretor = diretor;
            this.estiloSerie = estiloSerie;
            this.lancamento = lancamento;
            this.sinopse = sinopse;
            this.numeroTemporada = numeroTemporada;
            this.numeroEpisodio = numeroEpisodio;
        }

        public int getId() {
            return id;
        }

        public void setId(final int id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getDiretor() {
            return diretor;
        }

        public void setDiretor(String diretor) {
            this.diretor = diretor;
        }

        public EstiloSerie getEstiloSerie() {
            return estiloSerie;
        }

        public void setEstiloSerie(final EstiloSerie estiloSerie) {
            this.estiloSerie = estiloSerie;
        }

        public LocalDate getLancamento() {
            return lancamento;
        }

        public void setLancamento(LocalDate lancamento) {
            this.lancamento = lancamento;
        }

        public  String getSinopseSerie() {
            return sinopse;
        }
        public void setSinopseSerie(String sinopse) {
            this.sinopse = sinopse;
        }

    public  int getNumeroTemporada() {
        return numeroTemporada;
    }
    public void setNumeroTemporada(int numeroTemporada) {
        this.numeroTemporada = numeroTemporada;
    }

    public  int getNumeroEpisodio() {
        return numeroEpisodio;
    }
    public void setNumeroEpisodio(int numeroEpisodio) {
        this.numeroEpisodio = numeroEpisodio;
    }

        @Override
        public String toString() {
            return "Filme{" +
                    "id: " + id +
                    ", nome: '" + nome + '\'' +
                    ", diretor: '" + diretor + '\'' +
                    ", estiloFilme: " + estiloSerie +
                    ", lancamento: " + lancamento +
                    ", sinopse: " + sinopse +
                    ", numeroTemporada: " + numeroTemporada +
                    ", numeroEpisodio: " + numeroEpisodio +
                    '}';
        }
    }




