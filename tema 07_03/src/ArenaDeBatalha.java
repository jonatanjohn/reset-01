import ArmasMagias.*;
import Personagem.*;

public class ArenaDeBatalha{

    public static void main (String[] args){
 //turno 1
//guerreiros
        Guerreiros william = new Guerreiros("William",1500f,165f,76f);

        Guerreiros jonatan = new Guerreiros("jonatan",1600f,185f,96f);

        william.atacar(jonatan, new Besta("metralhadoraDeFlechas",78f));
        System.out.println("Ataque "+ william.getNome() +" Vida jonatan = "+ jonatan.getVida());

       System.out.println("Turno 1");
        jonatan.atacar(william, new Besta("metralhadoraDeFlechas",78f));
        System.out.println("Ataque "+ jonatan.getNome() +" Vida william = "+ william.getVida());

//barbaros
        Barbaros juliano = new Barbaros("juliano",1800f,135f,55f);

        Barbaros leonardo = new Barbaros("leonardo",1300f,125f,63f);

        juliano.atacar(leonardo, new Espada("matadoraDeDragoes", 350f));

        System.out.println("Ataque "+ juliano.getNome() +" Vida leonardo = "+ leonardo.getVida());

        leonardo.atacar(juliano, new Espada("escalibor", 195f));

        System.out.println("Ataque "+ leonardo.getNome() +" Vida juliano = "+ juliano.getVida());

//mago
        Mago alakazam = new Mago("alakaazam",2500f,50f,98f, 125f);

        Mago mew = new Mago("mew",2900f,179f,98f, 145f);

        alakazam.atacar(mew, new BolaDeFogo("esplosaoSolar", 670f, 45f));

        System.out.println("Ataque "+ alakazam.getNome() +" Vida mew = "+ mew.getVida());

        mew.atacar(alakazam, new BolaDeFogo("relampago", 489f, 12f));

        System.out.println("Ataque "+ mew.getNome() +" Vida alakazam = "+ alakazam.getVida());

//feiticeiro

        Feiticeiro bruxo = new Feiticeiro("bruxo",1300f,193f,243f, 96f);

        Feiticeiro dambodor  = new Feiticeiro("dambodor",4590f,364f,420f, 112f);

        bruxo.atacar(bruxo, new Relampago("claraoDaNoite", 263f, 45f));

        System.out.println("Ataque "+ bruxo.getNome() +" Vida dambodor = "+ dambodor.getVida());

        dambodor.atacar(dambodor, new Relampago("trovaoDorado", 630f, 25f));

        System.out.println("Ataque "+ dambodor.getNome() +" Vida bruxo = "+ bruxo.getVida());

//druidas

        Druida velhoElfo = new Druida("velhoElfo",560f,23f,239f, 236f);

        Druida mineiro  = new Druida("mineiro",652f,41f,96f, 20f);

        velhoElfo.atacar(velhoElfo, new FuriaDaNatureza("florestaNebulosa", 746f, 36f));

        System.out.println("Ataque "+ velhoElfo.getNome() +" Vida mineiro = "+ mineiro.getVida());

        mineiro.atacar(mineiro, new FuriaDaNatureza("terremoto", 900f, 450f));

        System.out.println("Ataque "+ mineiro.getNome() +" Vida velhoElfo = "+ velhoElfo.getVida());

//clerigo

        Clerigo donFrancisco = new Clerigo("donFrancisco",420f,800f,150f, 320f );

        Clerigo donJoao  = new Clerigo("donJoao",589f,795f,156f, 124f);

        donFrancisco.atacar(donFrancisco, new FuriaDosDeuses("vozDeDeus", 956f, 362f));

        System.out.println("Ataque "+ donFrancisco.getNome() +" Vida donJoao = "+ donJoao.getVida());

        donJoao.atacar(donJoao, new FuriaDosDeuses("asasDeIkaro", 420f, 213f));

        System.out.println("Ataque "+ donJoao.getNome() +" Vida donFrancisco = "+ donFrancisco.getVida());

        //turno 2
//guerreiros
        Guerreiros william = new Guerreiros("William",1500f,165f,76f);

        Guerreiros jonatan = new Guerreiros("jonatan",1600f,185f,96f);

        william.atacar(jonatan, new Besta("metralhadoraDeFlechas",78f));
        System.out.println("Ataque "+ william.getNome() +" Vida jonatan = "+ jonatan.getVida());

        System.out.println("Turno 1");
        jonatan.atacar(william, new Besta("metralhadoraDeFlechas",78f));
        System.out.println("Ataque "+ jonatan.getNome() +" Vida william = "+ william.getVida());

//barbaros
        Barbaros juliano = new Barbaros("juliano",1800f,135f,55f);

        Barbaros leonardo = new Barbaros("leonardo",1300f,125f,63f);

        juliano.atacar(leonardo, new Espada("matadoraDeDragoes", 350f));

        System.out.println("Ataque "+ juliano.getNome() +" Vida leonardo = "+ leonardo.getVida());

        leonardo.atacar(juliano, new Espada("escalibor", 195f));

        System.out.println("Ataque "+ leonardo.getNome() +" Vida juliano = "+ juliano.getVida());

//mago
        Mago alakazam = new Mago("alakaazam",2500f,50f,98f, 63f);

        Mago mew = new Mago("mew",2900f,179f,98f, 56f);

        alakazam.atacar(mew, new BolaDeFogo("esplosaoSolar", 670f, 36f));

        System.out.println("Ataque "+ alakazam.getNome() +" Vida mew = "+ mew.getVida());

        mew.atacar(alakazam, new BolaDeFogo("relampago", 489f, 45f));

        System.out.println("Ataque "+ mew.getNome() +" Vida alakazam = "+ alakazam.getVida());

//feiticeiro

        Feiticeiro bruxo = new Feiticeiro("bruxo",1300f,193f,243f, 145f);

        Feiticeiro dambodor  = new Feiticeiro("dambodor",4590f,364f,420f, 246f);

        bruxo.atacar(bruxo, new Relampago("claraoDaNoite", 263f, 245f));

        System.out.println("Ataque "+ bruxo.getNome() +" Vida dambodor = "+ dambodor.getVida());

        dambodor.atacar(dambodor, new Relampago("trovaoDorado", 630f, 245f));

        System.out.println("Ataque "+ dambodor.getNome() +" Vida bruxo = "+ bruxo.getVida());

//druidas

        Druida velhoElfo = new Druida("velhoElfo",560f,23f,239f, 124f);

        Druida mineiro  = new Druida("mineiro",652f,41f,96f, 36f);

        velhoElfo.atacar(velhoElfo, new FuriaDaNatureza("florestaNebulosa", 746f, 314f));

        System.out.println("Ataque "+ velhoElfo.getNome() +" Vida mineiro = "+ mineiro.getVida());

        mineiro.atacar(mineiro, new FuriaDaNatureza("terremoto", 900f, 78f));

        System.out.println("Ataque "+ mineiro.getNome() +" Vida velhoElfo = "+ velhoElfo.getVida());

//clerigo

        Clerigo donFrancisco = new Clerigo("donFrancisco",420f,800f,150f, 475f);

        Clerigo donJoao  = new Clerigo("donJoao",589f,795f,156f, 36f);

        donFrancisco.atacar(donFrancisco, new FuriaDosDeuses("vozDeDeus", 956f, 47f));

        System.out.println("Ataque "+ donFrancisco.getNome() +" Vida donJoao = "+ donJoao.getVida());

        donJoao.atacar(donJoao, new FuriaDosDeuses("asasDeIkaro", 420f, 245f));

        System.out.println("Ataque "+ donJoao.getNome() +" Vida donFrancisco = "+ donFrancisco.getVida());


    }

}
