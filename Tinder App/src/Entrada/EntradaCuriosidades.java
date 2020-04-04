package Entrada;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import Curiosidades.EstiloCuriosidades;
import Curiosidades.Curiosidade;
import Curiosidades.GerenciadorDeCuriosidade;

public class EntradaCuriosidades {
    private GerenciadorDeCuriosidade gerenciador;

    public EntradaCuriosidades() {
        this.gerenciador = new GerenciadorDeCuriosidade();
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

    public Curiosidade create() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nCriação de Curiosidade...");

        System.out.print("Discricao: ");
        String descricao = scanner.nextLine();

        System.out.println("Categoria: ");
        System.out.println("[ C ] COMPORTAMENTO");
        System.out.println("[ E ] EVENTO");
        System.out.println("[ B ] APARENCIA");
        System.out.println("[ A ] ALIMENTACAO");
        System.out.print("> ");
        String estilo = scanner.next();

        EstiloCuriosidades estiloCuriosidades;
        switch (estilo) {
            case "C":
                estiloCuriosidades = EstiloCuriosidades.COMPORTAMENTO;
                break;
            case "E":
                estiloCuriosidades = EstiloCuriosidades.EVENTO;
                break;
            case "B":
                estiloCuriosidades = EstiloCuriosidades.APARENCIA;
                break;
            case "A":
                estiloCuriosidades = EstiloCuriosidades.ALIMENTACAO;
                break;
            default:
                estiloCuriosidades = EstiloCuriosidades.COMPORTAMENTO;
                break;
        }

        Curiosidade curiosidade = new Curiosidade(descricao, estiloCuriosidades);
        return gerenciador.salvar(curiosidade);

    }

    public Curiosidade editar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEdição de Curiosidade...");
        System.out.println("Qual curiosidade deseja editar?");

        List<Curiosidade> curiosidades = gerenciador.listar();
        for (Curiosidade curiosidade : curiosidades) {
            System.out.println("[" + curiosidade.getId() + "] - " + curiosidade.getDescricao());
        }

        System.out.print("> ");
        int id = scanner.nextInt();

        System.out.print("Descricao: ");
        String descricao = scanner.nextLine();

        System.out.println("Estilo: ");
        System.out.println("[ C ] COMPORTAMENTO");
        System.out.println("[ E ] EVENTO");
        System.out.println("[ B ] APARENCIA");
        System.out.println("[ A ] ALIMENTACAO");
        System.out.print("> ");
        String estilo = scanner.next();

        EstiloCuriosidades estiloCuriosidades;
        switch (estilo) {
            case "C":
                estiloCuriosidades = EstiloCuriosidades.COMPORTAMENTO;
                break;
            case "E":
                estiloCuriosidades = EstiloCuriosidades.EVENTO;
                break;
            case "B":
                estiloCuriosidades = EstiloCuriosidades.APARENCIA;
                break;
            case "A":
                estiloCuriosidades = EstiloCuriosidades.ALIMENTACAO;
                break;
            default:
                estiloCuriosidades = EstiloCuriosidades.COMPORTAMENTO;
                break;
        }

        Curiosidade atualizacao = new Curiosidade(descricao, estiloCuriosidades);

        Curiosidade curiosidadeAtualizada = gerenciador.editar(id, atualizacao);

        if (curiosidadeAtualizada == null) {
            System.out.println("Curiosidade não encontrada.");
        } else {
            System.out.println(curiosidadeAtualizada);
        }

        return curiosidadeAtualizada;
    }

    private List<Curiosidade> listar() {

        System.out.println("\nListagem de Curiosidade...");
        List<Curiosidade> curiosidades = gerenciador.listar();

        for (Curiosidade curiosidade : curiosidades) {
            System.out.println(curiosidade);
        }

        return curiosidades;

    }

    private void procurar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPesquisa de Curiosidade...");
        System.out.println("Qual o código da curiosidade? ");

        System.out.print("> ");
        int id = scanner.nextInt();

        Curiosidade curiosidade = gerenciador.procurar(id);

        if (curiosidade == null) {
            System.out.println("Curiosidade não encontrada.");
        } else {
            System.out.println(curiosidade);
        }
    }

    private void deletar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nExclusão de Curiosidade...");
        System.out.println("Qual curiosidade deseja deletar?");

        List<Curiosidade> curiosidades = gerenciador.listar();
        for (Curiosidade curiosidade : curiosidades) {
            System.out.println("[" + curiosidade.getId() + "] - " + curiosidade.getDescricao());
        }

        System.out.print("> ");
        int id = scanner.nextInt();

        if (gerenciador.deletar(id)) {
            System.out.println("Curiosidade deletada.");
        } else {
            System.out.println("Curiosidade não encontrada.");
        }

    }
}
