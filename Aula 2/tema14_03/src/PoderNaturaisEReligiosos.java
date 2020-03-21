import java.time.Instant;

public class PoderNaturaisEReligiosos extends Personagem {
    float fe;

    public PoderNaturaisEReligiosos(String nome, float vida, float defesa, float ataque, int fe) {
        super(nome, vida, defesa, ataque);
        this.fe = fe;
    }

    void imprimirEstado() {
        System.out.println("Nome: " + this.nome + " | Vida: " + this.vida + " | Fé: " + this.fe);
    }

    void atacar(Personagem alvo, PoderDivino poderDivino) {
        double dano = calcularDano(alvo.defesa, poderDivino.poderAtaque);
        System.out.println(Instant.now().toString() + " " + nome + " Atacou " + poderDivino.nome + " Causando " + dano + " dano");
        alvo.vida -= dano;
        this.fe -= poderDivino.fe;
        registrar(alvo.nome, poderDivino.nome, dano);
    }
}
