public class Bicicleta extends Terrestre {

    public Bicicleta(int combustivel, int numeroDeRodas) {
        super(combustivel, numeroDeRodas);
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "combustivel=" + combustivel +
                ", numeroDeRodas=" + numeroDeRodas +
                ", nome='" + nome + '\'' +
                ", terreno='" + terreno + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", lotacaoMaxima=" + lotacaoMaxima +
                '}';
    }
}
