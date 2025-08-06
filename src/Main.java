import Cinema.Cinema;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main( String[] args) {

        int opcao;
        Scanner scanner = new Scanner(System.in);
        boolean menu = true;
        Cinema cinema = new Cinema();

        while (menu) {

            System.out.println("======Operações=======");
            System.out.println("= 1 - Cinema         =");
            System.out.println("= 2 - Empresa        =");
            System.out.println("= 3 - Relógio        =");
            System.out.println("= 4 - Sair           =");
            System.out.println("======================");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cinema.EscolheFilme();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção inválida!");
                    menu = false;
                    break;
            }
        }
    }

}