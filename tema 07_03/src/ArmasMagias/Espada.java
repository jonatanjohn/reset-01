package ArmasMagias;

public class Espada {
    String nome;
    float ataque;

           public Espada(String nome, float ataque){
            this.nome = nome;
            this.ataque = ataque;

        }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAtaque() {
        return ataque;
    }

    public void setAtaque(float ataque) {
        this.ataque = ataque;
    }
}
