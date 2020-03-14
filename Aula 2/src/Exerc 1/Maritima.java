public class Maritima extends veiculo {

    double profundadeMaxima;
    int combustivel;

    public Maritimas(double profundadeMaxima, int combustivel) {
        this.profundadeMaxima = profundadeMaxima;
        this.combustivel = combustivel;


    }

    @Override
    public String toString() {
        return "Maritima{" +
                "profundadeMaxima=" + profundadeMaxima +
                ", combustivel=" + combustivel +
                ", nome='" + nome + '\'' +
                ", terreno='" + terreno + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", lotacaoMaxima=" + lotacaoMaxima +
                '}';
    }
}
