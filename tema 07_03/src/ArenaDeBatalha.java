import Personagem.Guerreiros;
import ArmasMagias.Besta;

import Personagem.Barbaros;

public class ArenaDeBatalha{

    public static void main (String[] args){
        Guerreiros william = new Guerreiros("William",1500f,165f,76f);

        Guerreiros jonatan = new Guerreiros("jonatan",1600f,185f,96f);

        william.atacar(jonatan, new Besta("metralhadoraDeFlechas",78f));
        System.out.println("Ataque "+ william.getNome() +" Vida jonatan = "+ jonatan.getVida());

       System.out.println("Turno 1");
        jonatan.atacar(william, new Besta("metralhadoraDeFlechas",78f));
        System.out.println("Ataque "+ jonatan.getNome() +" Vida william = "+ william.getVida());
    }

}
