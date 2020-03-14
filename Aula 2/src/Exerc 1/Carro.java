public class Carro extends Terrestre {

    public Carro(int combustivel, int numeroDeRodas) {
        super(combustivel, numeroDeRodas);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "combustivel=" + combustivel +
                ", numeroDeRodas=" + numeroDeRodas +
                ", nome='" + nome + '\'' +
                ", terreno='" + terreno + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", lotacaoMaxima=" + lotacaoMaxima +
                '}';
    }
}
