public class Caminhao extends Terrestre {

    public Caminhao(int combustivel, int numeroDeRodas) {
        super(combustivel, numeroDeRodas);
    }

    @Override
    public String toString() {
        return "Caminhao{" +
                "combustivel=" + combustivel +
                ", numeroDeRodas=" + numeroDeRodas +
                ", nome='" + nome + '\'' +
                ", terreno='" + terreno + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", lotacaoMaxima=" + lotacaoMaxima +
                '}';
    }
}
