public class Trem extends Terrestre  {

    public Trem(int combustivel, int numeroDeRodas) {
        super(combustivel, numeroDeRodas);
    }

    @Override
    public String toString() {
        return "Trem{" +
                "combustivel=" + combustivel +
                ", numeroDeRodas=" + numeroDeRodas +
                ", nome='" + nome + '\'' +
                ", terreno='" + terreno + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", lotacaoMaxima=" + lotacaoMaxima +
                '}';
    }
}
