package Entrada;

import Curiosidades.Curiosidade;
import Usuario.*;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Usuario();
        Musica();
        Filme();
        Serie();
        jogos();
        curiosidades();
        esportes();
    }

    public void Likes()
    {
        GerenciamentoDeUsuario gerenciamentoDeUsuario;
    }

    public static void Usuario() {

        EntradaUsuario usuarioMenu = new EntradaUsuario();

        Scanner scanner = new Scanner(System.in);
        char opcao = ' ';

        while (opcao != 'X') {

            System.out.println("\nSelecione uma opção");
            System.out.println("[ U ] Usuário");
            System.out.println("[ X ] Encerrar");
            System.out.print("> ");
            opcao = scanner.next().charAt(0);

            switch (opcao) {
                case 'U':
                    usuarioMenu.opcoes();
                    break;

                case 'X':
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("... opção inválida ...");
            }
        }
    }

        public static void Musica() {

            EntradaMusica musicaMenu = new EntradaMusica();

            Scanner scanner = new Scanner(System.in);
            char opcao = ' ';

            while (opcao != 'X') {

                System.out.println("\nSelecione uma opção");
                System.out.println("[ M ] Músicas");
                System.out.println("[ X ] Encerrar");
                System.out.print("> ");
                opcao = scanner.next().charAt(0);

                switch (opcao) {
                    case 'M':
                        musicaMenu.opcoes();
                        break;

                    case 'X':
                        System.out.println("Encerrando...");
                        break;

                    default:
                        System.out.println("... opção inválida ...");
                }
            }
        }
        public static void Filme () {

            EntradaFilme EntradaFilme = new EntradaFilme();

            Scanner scanner = new Scanner(System.in);
            char opcao = ' ';

            while (opcao != 'X') {

                System.out.println("\nSelecione uma opção");
                System.out.println("[ F ] FILME");
                System.out.println("[ X ] Encerrar");
                System.out.print("> ");
                opcao = scanner.next().charAt(0);

                switch (opcao) {
                    case 'F':
                        EntradaFilme.opcoes();
                        break;

                    case 'X':
                        System.out.println("Encerrando...");
                        break;

                    default:
                        System.out.println("... opção inválida ...");
                }
            }

        }
    public static void Serie () {

        EntradaSeries EntradaSeries = new EntradaSeries();

        Scanner scanner = new Scanner(System.in);
        char opcao = ' ';

        while (opcao != 'X') {

            System.out.println("\nSelecione uma opção");
            System.out.println("[ S ] SERIE");
            System.out.println("[ X ] Encerrar");
            System.out.print("> ");
            opcao = scanner.next().charAt(0);

            switch (opcao) {
                case 'S':
                    EntradaSeries.opcoes();
                    break;

                case 'X':
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("... opção inválida ...");
            }
        }

    }

    public static void jogos () {

        EntradaJogos EntradaJogos = new EntradaJogos();

        Scanner scanner = new Scanner(System.in);
        char opcao = ' ';

        while (opcao != 'X') {

            System.out.println("\nSelecione uma opção");
            System.out.println("[ J ] SERIE");
            System.out.println("[ X ] Encerrar");
            System.out.print("> ");
            opcao = scanner.next().charAt(0);

            switch (opcao) {
                case 'S':
                    EntradaJogos.opcoes();
                    break;

                case 'X':
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("... opção inválida ...");
            }
        }

    }
    public static void curiosidades () {

        EntradaCuriosidades EntradaCuriosidades = new EntradaCuriosidades();

        Scanner scanner = new Scanner(System.in);
        char opcao = ' ';

        while (opcao != 'X') {

            System.out.println("\nSelecione uma opção");
            System.out.println("[ C ] CURIOSIDADE");
            System.out.println("[ X ] Encerrar");
            System.out.print("> ");
            opcao = scanner.next().charAt(0);

            switch (opcao) {
                case 'S':
                    EntradaCuriosidades.opcoes();
                    break;

                case 'X':
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("... opção inválida ...");
            }
        }

    }
    public static void esportes () {

        EntradaEsporte EntradaEsporte = new EntradaEsporte();

        Scanner scanner = new Scanner(System.in);
        char opcao = ' ';

        while (opcao != 'X') {

            System.out.println("\nSelecione uma opção");
            System.out.println("[ E ] ESPORTE");
            System.out.println("[ X ] Encerrar");
            System.out.print("> ");
            opcao = scanner.next().charAt(0);

            switch (opcao) {
                case 'S':
                    EntradaEsporte.opcoes();
                    break;

                case 'X':
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("... opção inválida ...");
            }
        }

    }
}
