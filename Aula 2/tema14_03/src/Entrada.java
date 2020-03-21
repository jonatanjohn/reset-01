import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

import static sun.rmi.transport.TransportConstants.Return;

public class Entrada {

    public static void main(String[] args){

        ArrayList<Personagem> listaDePersonagens = criarPersonagen();
        for (Personagem P : listaDePersonagens)
        {
            System.out.println(P.nome);

        }

    }
    public static ArrayList<Personagem> criarPersonagen() {

        ArrayList<Personagem> listaDePersonagens = new ArrayList<>();
        int numeroMinimoDePersonagens = 6;
        int contador = 0;
        boolean usuarioQuerContinuarCriandoPersonagens = true;

        while (usuarioQuerContinuarCriandoPersonagens) {

            Scanner in = new Scanner(System.in);
            System.out.println("Crie seu próprio herói!" + " " + contador);
            System.out.println("Primeiro, escolha a classe do personagem:");
            System.out.println("G - Guerreiro");
            System.out.println("B - Bárbaro");
            System.out.println("C - Clérigo");
            System.out.println("D - Druida");
            System.out.println("M - Mago");
            System.out.println("F - Feiticeiro");

            System.out.print("Tipo: ");
            char tipo = in.next().charAt(0);
            System.out.print("Nome: ");
            String nome = in.next();
            System.out.print("Vida: ");
            float vida = in.nextFloat();
            System.out.print("Ataque: ");
            float ataque = in.nextFloat();
            System.out.print("Defesa: ");
            float defesa = in.nextFloat();

            int fe;
            int mana;

            switch (tipo) {
                case 'G':
                    System.out.println("Criando guerreiro...");
                    Guerreiro guerreiro = new Guerreiro(nome, vida, ataque, defesa);
                    guerreiro.imprimirEstado();
                    listaDePersonagens.add(guerreiro);
                    break;

                case 'B':
                    System.out.println("Criando bárbaro...");
                    Barbaro barbaro = new Barbaro(nome, vida, ataque, defesa);
                    barbaro.imprimirEstado();
                    listaDePersonagens.add(barbaro);
                    break;

                case 'C':
                    System.out.print("Fé: ");
                    fe = in.nextInt();

                    System.out.println("Criando clérigo...");
                    Clerigo clerigo = new Clerigo(nome, vida, ataque, defesa, fe);
                    clerigo.imprimirEstado();
                    listaDePersonagens.add(clerigo);
                    break;

                case 'D':
                    System.out.print("Fé: ");
                    fe = in.nextInt();

                    System.out.println("Criando druida...");
                    Druida druida = new Druida(nome, vida, ataque, defesa, fe);
                    druida.imprimirEstado();
                    listaDePersonagens.add(druida);
                    break;

                case 'M':
                    System.out.print("Mana: ");
                    mana = in.nextInt();

                    System.out.println("Criando mago...");
                    Mago mago = new Mago(nome, vida, ataque, defesa, mana);
                    mago.imprimirEstado();
                    listaDePersonagens.add(mago);
                    break;

                case 'F':
                    System.out.print("Mana: ");
                    mana = in.nextInt();

                    System.out.println("Criando feiticeiro...");
                    Feiticeiro feiticeiro = new Feiticeiro(nome, vida, ataque, defesa, mana);
                    feiticeiro.imprimirEstado();
                    listaDePersonagens.add(feiticeiro);
                    break;
            }
contador++;
            if (contador >= numeroMinimoDePersonagens) {
                System.out.println("Deseja continuar criando personagens? (y/n)");
                char escolha = in.next().charAt(0);

                if (escolha == 'n') {
                    usuarioQuerContinuarCriandoPersonagens = false;
                }

            }

        }
        return  listaDePersonagens;

    }

}
