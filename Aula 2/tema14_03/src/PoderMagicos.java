import java.time.Instant;

public class PoderMagicos extends Personagem {

    float mana;

    public PoderMagicos(String nome, float vida, float defesa, float ataque, float mana) {
        super(nome, vida, defesa, ataque);
        this.mana = mana;
    }
    void imprimirEstado() {
        System.out.println("Nome: " + this.nome + " | Vida: " + this.vida + " | Mana: " + this.mana);
    }

    void atacar(Personagem alvo, MagiasFeiticarias magia) {
        double dano = calcularDano(alvo.defesa, magia.poderAtaque);
        System.out.println(Instant.now().toString() + " " + nome + " Atacou " + magia.nome + " Causando " + dano + " dano");
        alvo.vida -= dano;
        this.mana -= magia.custoMana;
        registrar(alvo.nome, magia.nome, dano);
    }
    //i.	Exemplo: [14/03/2020 15:01:35.0001] Ramza atacou Wiegraf com Espada Longa causando 45 de dano
}
