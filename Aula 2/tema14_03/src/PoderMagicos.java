public class PoderMagicos extends Personagem {

    float mana;

    public PoderMagicos(String nome, float vida, float defesa, float ataque, float mana) {
        super(nome, vida, defesa, ataque);
        this.mana = mana;
    }
    void imprimirEstado() {
        System.out.println("Nome: " + this.nome + " | Vida: " + this.vida + " | Mana: " + this.mana);
    }

    void atacar(Personagem alvo, Magia magia) {
        double dano = calcularDano(alvo.defesa, magia.poderAtaque);
        alvo.vida -= dano;
        this.mana -= magia.custoMana;
        registrar(alvo.nome, magia.nome, dano);
    }
}
