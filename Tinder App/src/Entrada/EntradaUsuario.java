package Entrada;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Usuario.Usuario;
import Usuario.GerenciamentoDeUsuario;

public class EntradaUsuario {
    private GerenciamentoDeUsuario gerenciador;

    public EntradaUsuario() {
        this.gerenciador = new GerenciamentoDeUsuario();
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

    public Usuario create() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nCriação de Usuario...");

        boolean nomeValid = false;
        while (!nomeValid){

            String nome = null;
            System.out.print("Nome: ");
            nome = scanner.nextLine();
            if (!nome.isEmpty()) {
                nomeValid = true;
            }

        }



        boolean emailExistente = false;
        boolean emailValidado = false;

        String email = null;

        while(!emailValidado) {
            System.out.print("Email: ");
            email = scanner.nextLine();

            List<Usuario> usuarios = gerenciador.listar();
            for (Usuario usuario : usuarios) {
                if (email.equals(usuario.getEmail())) {
                    System.out.println("Email existente!!!");

                    emailExistente = true;
                }

            }
            if (!emailExistente);
            {
                emailValidado = true;
            }
        }




        System.out.print("Ano de Nascimento: ");
        int ano = scanner.nextInt();

        System.out.print("Mês de Nascimento: ");
        int mes = scanner.nextInt();

        System.out.print("Dia de Nascimento: ");
        int dia = scanner.nextInt();

        System.out.print("Telefone: ");
        int telefone = scanner.nextInt();

        System.out.print("Bio: ");
        String bio = scanner.nextLine();

        System.out.print("Localização latitude: ");
        double latitude = scanner.nextInt();

        System.out.print("Localização longitude: ");
        int longitude = scanner.nextInt();

        Usuario usuario = new Usuario(nome, email, telefone, LocalDate.of(ano, mes, dia), bio,latitude, longitude);
        return gerenciador.salvar(usuario);

    }

    public Usuario editar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEdição de Usuário...");
        System.out.println("Qual usuário deseja editar?");

        List<Usuario> usuarios = gerenciador.listar();
        for (Usuario usuario : usuarios) {
            System.out.println("[" + usuario.getId() + "] - " + usuario.getNome());
        }

        System.out.print("> ");
        int id = scanner.nextInt();

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Ano de Nascimento: ");
        int ano = scanner.nextInt();

        System.out.print("Mês de Nascimento: ");
        int mes = scanner.nextInt();

        System.out.print("Dia de Nascimento: ");
        int dia = scanner.nextInt();

        System.out.print("Telefone: ");
        double telefone = scanner.nextInt();

        System.out.print("Bio: ");
        String bio = scanner.nextLine();

        System.out.print("Localização latitude: ");
        double latitude = scanner.nextInt();

        System.out.print("Localização longitude: ");
        double longitude = scanner.nextInt();




        Usuario atualizacao = new Usuario(nome, email, telefone, LocalDate.of(ano, mes, dia), bio, latitude, longitude);

        Usuario usuarioAtualizada = gerenciador.editar(id, atualizacao);

        if (usuarioAtualizada == null) {
            System.out.println("Usuário não encontrada.");
        } else {
            System.out.println(usuarioAtualizada);
        }

        return usuarioAtualizada;
    }

    private List<Usuario> listar() {

        System.out.println("\nListagem de usuário...");
        List<Usuario> usuarios = gerenciador.listar();

        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }

        return usuarios;

    }

    private void procurar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPesquisa de usuário...");
        System.out.println("Qual o código da usuário? ");

        System.out.print("> ");
        int id = scanner.nextInt();

        Usuario usuario = gerenciador.procurar(id);

        if (usuario == null) {
            System.out.println("Usuário não encontrada.");
        } else {
            System.out.println(usuario);
        }
    }

    private void deletar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nExclusão de usuário...");
        System.out.println("Qual usuário deseja deletar?");

        List<Usuario> usuarios = gerenciador.listar();
        for (Usuario usuario : usuarios) {
            System.out.println("[" + usuario.getId() + "] - " + usuario.getNome());
        }

        System.out.print("> ");
        int id = scanner.nextInt();

        if (gerenciador.deletar(id)) {
            System.out.println("Usuário deletada.");
        } else {
            System.out.println("Usuário não encontrada.");
        }

    }
}
