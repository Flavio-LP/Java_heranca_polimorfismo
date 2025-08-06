import Cinema.Cinema;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main( String[] args )
    {

        Scanner scanner = new Scanner(System.in);
        int opcao;
        float valor;
        boolean menu = true;
        Cinema cinema = new Cinema();

        while (menu){
            System.out.println(" =========== Bilheteria ===========");
            System.out.println(" =  Escolha o filme:              =");
            System.out.println(" = 1 - Vingadores Ultimato        =");
            System.out.println(" = 2 - Vingadores Guerra Civil    =");
            System.out.println(" = 3 - Vingadores Guerra Infinita =");
            System.out.println(" = 4 - Vingadores Era de Ultron   =");
            System.out.println(" =========== Bilheteria ===========");

            opcao = scanner.nextInt();

            if(opcao>4){
                System.out.println("Opção inválida");
                menu = false;
            }else{

                switch (opcao) {
                    case 1:
                        valor = 30;
                        break;
                    case 2:
                        valor = 40;
                        break;
                    case 3:
                        valor = 70;
                        break;
                    default:
                        valor = 100;
                        break;
                }

                cinema.ComprarIngresso(opcao,valor);
            }

        }
    }
}