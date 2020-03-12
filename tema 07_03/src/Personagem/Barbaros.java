package Personagem;

import ArmasMagias.Machado;

public class Barbaros {
    private String nome;
    private float vida;
    private float defesa;
    private float ataque;

            Barbaros(String nome, float vida, float defesa, float ataque) {
            this.nome = nome;
            this.vida = vida;
            this.defesa = defesa;
            this.ataque = ataque;

        }
    public void atacar(Barbaros oponente, Machado laminaDupla) {
        oponente.setVida(oponente.getVida() - (this.ataque + laminaDupla.getAtaque()));

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getVida() {
        return vida;
    }

    public void setVida(float vida) {
        this.vida = vida;
    }

    public float getDefesa() {
        return defesa;
    }

    public void setDefesa(float defesa) {
        this.defesa = defesa;
    }

    public float getAtaque() {
        return ataque;
    }

    public void setAtaque(float ataque) {
        this.ataque = ataque;
    }
}
