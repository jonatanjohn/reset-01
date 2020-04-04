package Entrada;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import Esportes.Esporte;
import Esportes.GerenciadorDeEsporte;

public class EntradaEsporte {
    private GerenciadorDeEsporte gerenciador;

    public EntradaEsporte() {
        this.gerenciador = new GerenciadorDeEsporte();
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

    public Esporte create() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nCriação de Esporte...");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();



        Esporte esporte = new Esporte(nome);
        return gerenciador.salvar(esporte);

    }

    public Esporte editar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEdição de Esporte...");
        System.out.println("Qual esporte deseja editar?");

        List<Esporte> esportes = gerenciador.listar();
        for (Esporte esporte : esportes) {
            System.out.println("[" + esporte.getId() + "] - " + esporte.getNome());
        }

        System.out.print("> ");
        int id = scanner.nextInt();scanner.nextLine();

        System.out.print("Nome: ");
        String nome = scanner.nextLine();


        Esporte atualizacao = new Esporte(nome);

        Esporte esporteAtualizada = gerenciador.editar(id, atualizacao);

        if (esporteAtualizada == null) {
            System.out.println("Esporte não encontrada.");
        } else {
            System.out.println(esporteAtualizada);
        }

        return esporteAtualizada;
    }

    private List<Esporte> listar() {

        System.out.println("\nListagem de Esporte...");
        List<Esporte> esportes = gerenciador.listar();

        for (Esporte esporte : esportes) {
            System.out.println(esporte);
        }

        return esportes;

    }

    private void procurar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPesquisa de Esporte...");
        System.out.println("Qual o código da esporte? ");

        System.out.print("> ");
        int id = scanner.nextInt();

        Esporte esporte = gerenciador.procurar(id);

        if (esporte == null) {
            System.out.println("Esporte não encontrada.");
        } else {
            System.out.println(esporte);
        }
    }

    private void deletar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nExclusão de Esporte...");
        System.out.println("Qual esporte deseja deletar?");

        List<Esporte> esportes = gerenciador.listar();
        for (Esporte esporte : esportes) {
            System.out.println("[" + esporte.getId() + "] - " + esporte.getNome());
        }

        System.out.print("> ");
        int id = scanner.nextInt();

        if (gerenciador.deletar(id)) {
            System.out.println("Esporte deletada.");
        } else {
            System.out.println("Esporte não encontrada.");
        }

    }
}
