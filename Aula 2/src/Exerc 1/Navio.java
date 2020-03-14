public class Navio extends Maritima {
    public Navio(int combustivel, double profundidadeMaxima) {
        super(combustivel, profundidadeMaxima);

    }

    @Override
    public String toString() {
        return "Navio{" +
                "profundadeMaxima=" + profundadeMaxima +
                ", combustivel=" + combustivel +
                ", nome='" + nome + '\'' +
                ", terreno='" + terreno + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", lotacaoMaxima=" + lotacaoMaxima +
                '}';
    }
}
