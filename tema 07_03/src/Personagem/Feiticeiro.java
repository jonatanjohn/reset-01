package Personagem;

import ArmasMagias.Besta;
import ArmasMagias.Relampago;

public class Feiticeiro {
    String nome;
    private float vida;
    private float mana;
    private float defesa;
    private float ataque;

            public Feiticeiro(String nome, float vida, float mana, float defesa, float ataque) {
            this.nome = nome;
            this.vida = vida;
            this.mana = mana;
            this.defesa = defesa;
            this.ataque = ataque;

    }
    public void atacar(Feiticeiro oponente, Relampago trovoes) {
        oponente.setVida(oponente.getVida()-(this.ataque+trovoes.getAtaque()));

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

    public float getMana() {
        return mana;
    }

    public void setMana(float mana) {
        this.mana = mana;
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
