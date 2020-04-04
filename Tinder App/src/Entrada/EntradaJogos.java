package Entrada;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import Jogos.Jogo;
import Jogos.GerenciadorDeJogo;
import Jogos.EstiloJogo;
import Jogos.Plataformas;

public class EntradaJogos {

    private GerenciadorDeJogo gerenciador;

    public EntradaJogos() {
        this.gerenciador = new GerenciadorDeJogo();
    }

    public void opcoes() {
        Scanner scanner = new Scanner(System.in);
        char opcao = ' ';

        while (opcao != 'X') {

            System.out.println("\nSelecione uma opção");
            System.out.println("[ C ] Criar");
            System.out.println("[ E ] Editar");
            System.out.println("[ L ] Listar");
            System.out.println("[ P ] Procurar");
            System.out.println("[ D ] Deletar");
            System.out.println("[ X ] Voltar");
            System.out.print("> ");
            opcao = scanner.next().charAt(0);

            switch (opcao) {
                case 'C':
                    create();
                    break;
                case 'E':
                    editar();
                    break;
                case 'L':
                    listar();
                    break;
                case 'P':
                    procurar();
                    break;
                case 'D':
                    deletar();
                    break;
                case 'X':
                    System.out.println("...");
                    break;
                default:
                    System.out.println("... opção inválida ...");
            }
        }
    }

    public Jogo create() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nCriação de Jogo...");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print(": ");
        String publisher = scanner.nextLine();

        System.out.print("Ano de Lançamento: ");
        int ano = scanner.nextInt();

        System.out.print("Mês de Lançamento: ");
        int mes = scanner.nextInt();

        System.out.print("Dia de Lançamento: ");
        int dia = scanner.nextInt();





        System.out.println("Plataforma: ");
        System.out.println("[ X ] XBOX");
        System.out.println("[ 4 ] PS4");
        System.out.println("[ P ] PC");
        System.out.println("[ S ] SNES");
        System.out.print("> ");
        String plataforma = scanner.next();

        Plataformas plataformaJogo;
        switch (plataforma) {
            case "X":
                plataformaJogo = Plataformas.XBOX;
                break;
            case "4":
                plataformaJogo = Plataformas.PS4;
                break;
            case "S":
                plataformaJogo = Plataformas.SNES;
                break;
            default:
                plataformaJogo = Plataformas.XBOX;
                break;
        }








        System.out.println("Estilo: ");
        System.out.println("[ D ] DRAMA");
        System.out.println("[ C ] COMÉDIA");
        System.out.println("[ S ] SUSPENSE");
        System.out.println("[ T ] TERROR");
        System.out.println("[ A ] AÇÃO");
        System.out.println("[ M ] MUSICAL");
        System.out.print("> ");
        String estilo = scanner.next();

        EstiloJogo estiloJogo;
        switch (estilo) {
            case "D":
                estiloJogo = EstiloJogo.DRAMA;
                break;
            case "C":
                estiloJogo = EstiloJogo.COMEDIA;
                break;
            case "S":
                estiloJogo = EstiloJogo.SUSPENSE;
                break;
            case "T":
                estiloJogo = EstiloJogo.TERROR;
                break;
            case "A":
                estiloJogo = EstiloJogo.ACAO;
                break;
            case "M":
                estiloJogo= EstiloJogo.MUSICAL;
                break;
            default:
                estiloJogo = EstiloJogo.MUSICAL;
                break;
        }

        Jogo jogo = new Jogo(nome, publisher, estiloJogo, LocalDate.of(ano, mes, dia), plataformaJogo);
        return gerenciador.salvar(jogo);

    }

    public Jogo editar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEdição de jogo...");
        System.out.println("Qual jogo deseja editar?");

        List<Jogo> jogos = gerenciador.listar();
        for (Jogo jogo : jogos) {
            System.out.println("[" + jogo.getId() + "] - " + jogo.getNome());
        }

        System.out.print("> ");
        int id = scanner.nextInt();scanner.nextLine();

       System.out.print("Nome: ");
       String nome = scanner.nextLine();

        System.out.print("Publisher: ");
        String publisher = scanner.nextLine();

        System.out.print("Ano de Lançamento: ");
        int ano = scanner.nextInt();

        System.out.print("Mês de Lançamento: ");
        int mes = scanner.nextInt();

        System.out.print("Dia de Lançamento: ");
        int dia = scanner.nextInt();

        System.out.println("Estilo: ");
        System.out.println("[ D ] DRAMA");
        System.out.println("[ C ] COMÉDIA");
        System.out.println("[ S ] SUSPENSE");
        System.out.println("[ T ] TERROR");
        System.out.println("[ A ] AÇÃO");
        System.out.println("[ M ] MUSICAL");
        System.out.print("> ");
        String estilo = scanner.next();

        EstiloJogo estiloJogo;
        switch (estilo) {
            case "D":
                estiloJogo = EstiloJogo.DRAMA;
                break;
            case "C":
                estiloJogo = EstiloJogo.COMEDIA;
                break;
            case "S":
                estiloJogo = EstiloJogo.SUSPENSE;
                break;
            case "T":
                estiloJogo = EstiloJogo.TERROR;
                break;
            case "A":
                estiloJogo = EstiloJogo.ACAO;
                break;
            case "M":
                estiloJogo = EstiloJogo.MUSICAL;
                break;
            default:
                estiloJogo = EstiloJogo.DRAMA;
                break;
        }

        System.out.println("Plataforma: ");
        System.out.println("[ X ] XBOX");
        System.out.println("[ 4 ] PS4");
        System.out.println("[ P ] PC");
        System.out.println("[ S ] SNES");
        System.out.print("> ");
        String plataformaJogo = scanner.next();

        Plataformas plataforma;
        switch (plataformaJogo) {
            case "X":
                plataforma = Plataformas.XBOX;
                break;
            case "4":
                plataforma = Plataformas.PS4;
                break;
            case "P":
                plataforma = Plataformas.PC;
                break;
            case "S":
                plataforma = Plataformas.SNES;
                break;
                default:
                plataforma = Plataformas.XBOX;
                break;
        }


        Jogo Atualizacao = new Jogo(nome, publisher, estiloJogo, LocalDate.of(ano, mes, dia), plataforma);

        Jogo jogoAtualizada = gerenciador.editar(id, Atualizacao);

        if (jogoAtualizada == null) {
            System.out.println("Jogo não encontrada.");
        } else {
            System.out.println(jogoAtualizada);
        }

        return jogoAtualizada;
    }

    private List<Jogo> listar() {

        System.out.println("\nListagem de Jogo...");
        List<Jogo> jogos = gerenciador.listar();

        for (Jogo jogo : jogos) {
            System.out.println(jogo);
        }

        return jogos;

    }

    private void procurar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPesquisa de Jogo...");
        System.out.println("Qual o código da jogo? ");

        System.out.print("> ");
        int id = scanner.nextInt();

        Jogo jogo = gerenciador.procurar(id);

        if (jogo == null) {
            System.out.println("Jogo não encontrada.");
        } else {
            System.out.println(jogo);
        }
    }

    private void deletar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nExclusão de Jogo...");
        System.out.println("Qual jogo deseja deletar?");

        List<Jogo> jogos = gerenciador.listar();
        for (Jogo jogo : jogos) {
            System.out.println("[" + jogo.getId() + "] - " + jogo.getNome());
        }

        System.out.print("> ");
        int id = scanner.nextInt();

        if (gerenciador.deletar(id)) {
            System.out.println("Jogo deletada.");
        } else {
            System.out.println("Jogo não encontrada.");
        }

    }

    }

