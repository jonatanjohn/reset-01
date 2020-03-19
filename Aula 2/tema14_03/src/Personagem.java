public class Personagem {
    String nome;
    float vida;
    float defesa;
    float ataque;

    public Personagem(String nome, float vida, float defesa, float ataque) {
        this.nome = nome;
        this.vida = vida;
        this.defesa = defesa;
        this.ataque = ataque;
    }
    double calcularDano(double defesa, double poder) {
        return ataque * poder - defesa;
    }

    void registrar(String nomeAlvo, String habilidade, double dano) {
        System.out.println(this.nome + " atacou " + nomeAlvo + " com " + habilidade + " causando " + dano + " de dano");
    }
}
