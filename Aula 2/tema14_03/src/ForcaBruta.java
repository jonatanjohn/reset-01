public class ForcaBruta extends Personagem {

    public ForcaBruta(String nome, float vida, float defesa, float ataque) {
        super(nome, vida, defesa, ataque);
    }

    void imprimirEstado() {
        System.out.println("Nome: " + this.nome + " | Vida: " + this.vida);
    }

    void atacar(Personagem alvo, Arma arma) {
        double dano = calcularDano(alvo.defesa, arma.poderAtaque);
        alvo.vida -= dano;
        registrar(alvo.nome, arma.nome, dano);
    }


}
