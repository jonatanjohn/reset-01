package Personagem;

import ArmasMagias.Besta;
import ArmasMagias.FuriaDaNatureza;
import ArmasMagias.FuriaDosDeuses;
public class Clerigo {
    String nome;
    float vida;
    float fe;
    float defesa;
    float ataque;

           public Clerigo(String nome, float vida, float fe, float defesa, float ataque) {
            this.nome = nome;
            this.vida = vida;
            this.fe = fe;
            this.defesa = defesa;
            this.ataque = ataque;

    }
    public void atacar(Clerigo oponente, FuriaDosDeuses vozDeZeus) {
        oponente.setVida(oponente.getVida() - (this.ataque + vozDeZeus.getAtaque()));
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

    public float getFe() {
        return fe;
    }

    public void setFe(float fe) {
        this.fe = fe;
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

