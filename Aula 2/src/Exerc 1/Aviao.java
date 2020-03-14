public class Aviao extends Aereo {
    public Aviao(int combustivel, int altitudeMaxima) {
        super(combustivel, altitudeMaxima);
    }

    @Override
    public String toString() {
        return "Aviao{" +
                "altitudeMaxima=" + altitudeMaxima +
                ", combustivel=" + combustivel +
                ", nome='" + nome + '\'' +
                ", terreno='" + terreno + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", lotacaoMaxima=" + lotacaoMaxima +
                '}';
    }
}
