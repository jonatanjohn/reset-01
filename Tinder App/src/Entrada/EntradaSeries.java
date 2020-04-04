package Entrada;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import Serie.Serie;
import Serie.GerenciamentoDeSerie;
import Serie.EstiloSerie;

public class EntradaSeries {

    private GerenciamentoDeSerie gerenciador;

    public EntradaSeries() {
        this.gerenciador = new GerenciamentoDeSerie();
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

    public Serie create() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nCriação de Serie...");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Diretor: ");
        String diretor = scanner.nextLine();

        System.out.print("Ano de Lançamento: ");
        int ano = scanner.nextInt();

        System.out.print("Mês de Lançamento: ");
        int mes = scanner.nextInt();

        System.out.print("Dia de Lançamento: ");
        int dia = scanner.nextInt();

        System.out.print("Sinopse: ");
        String sinopse = scanner.nextLine();

        System.out.print("NumeroTemporada: ");
        int numeroTemporada = scanner.nextInt();

        System.out.print("NumeroEpisodio: ");
        int numeroEpisodio = scanner.nextInt();

        System.out.println("Estilo: ");
        System.out.println("[ D ] DRAMA");
        System.out.println("[ C ] COMÉDIA");
        System.out.println("[ S ] SUSPENSE");
        System.out.println("[ T ] TERROR");
        System.out.println("[ A ] AÇÃO");
        System.out.println("[ SM ] SITCOM");
        System.out.print("> ");
        String estilo = scanner.next();

        EstiloSerie estiloFilme;
        switch (estilo) {
            case "D":
                estiloFilme = EstiloSerie.DRAMA;
                break;
            case "C":
                estiloFilme = EstiloSerie.COMEDIA;
                break;
            case "S":
                estiloFilme = EstiloSerie.SUSPENSE;
                break;
            case "T":
                estiloFilme = EstiloSerie.TERROR;
                break;
            case "A":
                estiloFilme = EstiloSerie.ACAO;
                break;
            case "SM":
                estiloFilme= EstiloSerie.SITCOM;
                break;
            default:
                estiloFilme = EstiloSerie.DRAMA;
                break;
        }

        Serie serie = new Serie(nome, diretor, estiloFilme, LocalDate.of(ano, mes, dia), sinopse, numeroTemporada, numeroEpisodio);
        return gerenciador.salvar(serie);

    }

    public Serie editar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEdição de serie...");
        System.out.println("Qual serie deseja editar?");

        List<Serie> series = gerenciador.listar();
        for (Serie serie : series) {
            System.out.println("[" + serie.getId() + "] - " + serie.getNome());
        }

        System.out.print("> ");
        int id = scanner.nextInt();scanner.nextLine();

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Diretor: ");
        String diretor = scanner.nextLine();

        System.out.print("Ano de Lançamento: ");
        int ano = scanner.nextInt();

        System.out.print("Mês de Lançamento: ");
        int mes = scanner.nextInt();

        System.out.print("Dia de Lançamento: ");
        int dia = scanner.nextInt();

        System.out.print("Sinopse: ");
        String sinopse = scanner.nextLine();

        System.out.print("NumeroTemporada: ");
        int numeroTemporada = scanner.nextInt();

        System.out.print("NumeroEpisodio: ");
        int numeroEpisodio = scanner.nextInt();

        System.out.println("Estilo: ");
        System.out.println("[ D ] DRAMA");
        System.out.println("[ C ] COMÉDIA");
        System.out.println("[ S ] SUSPENSE");
        System.out.println("[ T ] TERROR");
        System.out.println("[ A ] AÇÃO");
        System.out.println("[ SM ] SITCOM");
        System.out.print("> ");
        String estilo = scanner.next();

        EstiloSerie estiloSerie;
        switch (estilo) {
            case "D":
                estiloSerie = EstiloSerie.DRAMA;
                break;
            case "C":
                estiloSerie = EstiloSerie.COMEDIA;
                break;
            case "S":
                estiloSerie = EstiloSerie.SUSPENSE;
                break;
            case "T":
                estiloSerie = EstiloSerie.TERROR;
                break;
            case "A":
                estiloSerie = EstiloSerie.ACAO;
                break;
            case "SM":
                estiloSerie = EstiloSerie.SITCOM;
                break;
            default:
                estiloSerie = EstiloSerie.DRAMA;
                break;
        }

        Serie atualizacao = new Serie(nome, diretor, estiloSerie, LocalDate.of(ano, mes, dia), sinopse, numeroTemporada,numeroEpisodio);

        Serie serieAtualizada = gerenciador.editar(id, atualizacao);

        if (serieAtualizada == null) {
            System.out.println("Serie não encontrada.");
        } else {
            System.out.println(serieAtualizada);
        }

        return serieAtualizada;
    }

    private List<Serie> listar() {

        System.out.println("\nListagem de Serie...");
        List<Serie> series = gerenciador.listar();

        for (Serie serie : series) {
            System.out.println(serie);
        }

        return series;

    }

    private void procurar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPesquisa de Serie...");
        System.out.println("Qual o código da Serie? ");

        System.out.print("> ");
        int id = scanner.nextInt();

        Serie serie = gerenciador.procurar(id);

        if (serie == null) {
            System.out.println("Serie não encontrada.");
        } else {
            System.out.println(serie);
        }
    }

    private void deletar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nExclusão de Serie...");
        System.out.println("Qual serie deseja deletar?");

        List<Serie> series = gerenciador.listar();
        for (Serie serie : series) {
            System.out.println("[" + serie.getId() + "] - " + serie.getNome());
        }

        System.out.print("> ");
        int id = scanner.nextInt();

        if (gerenciador.deletar(id)) {
            System.out.println("Serie deletada.");
        } else {
            System.out.println("Serie não encontrada.");
        }

    }
}
