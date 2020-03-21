import java.time.Instant;

public class ForcaBruta extends Personagem {

    public ForcaBruta(String nome, float vida, float defesa, float ataque) {
        super(nome, vida, defesa, ataque);
    }

    void imprimirEstado() {
        System.out.println("Nome: " + this.nome + " | Vida: " + this.vida);
    }

    void atacar(Personagem alvo, Armas arma) {
        double dano = calcularDano(alvo.defesa, arma.poderAtaque);
        System.out.println(Instant.now().toString() + " " + nome + " Atacou " + arma.nome + " Causando " + dano + " dano");
        alvo.vida -= dano;
        registrar(alvo.nome, arma.nome, dano);
    }


}
