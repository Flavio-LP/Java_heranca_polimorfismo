package Cinema;

import Cinema.Ingressos.*;

import java.util.Scanner;

public class Cinema {

    public static void EscolheFilme(){

        Scanner scanner = new Scanner(System.in);
        int opcao;
        float valor;
        boolean menu = true;

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

                ComprarIngresso(opcao,valor);
            }

        }
    }


    public static void ComprarIngresso(int opcao, float valor) {

        Scanner scanner = new Scanner(System.in);
        int tipoIngresso;
        int tipoFilme;
        String Filme;

        switch (opcao) {
            case 1:
                Filme = "Vingadores Ultimato";
                break;
            case 2:
                Filme = "Vingadores Guerra Civil";
                break;
            case 3:
                Filme = "Vingadores Guerra Infinita";
                break;
            default:
                Filme = "Vingadores Era de Ultron";
                break;
        }


        System.out.println("Escolha o tipo de ingresso:");
        System.out.println("1 - Meia entrada");
        System.out.println("2 - Ingresso família");
        tipoIngresso = scanner.nextInt();

        System.out.println("Escolha o tipo de filme:");
        System.out.println("1 - Dublado");
        System.out.println("2 - Legendado");
        tipoFilme = scanner.nextInt();

        switch (tipoIngresso) {
            case 1:
                IngressoMeiaEntrada ingressoMeiaEntrada = new IngressoMeiaEntrada();
                ingressoMeiaEntrada.setFilme(Filme);
                if (tipoFilme == 1) {
                    ingressoMeiaEntrada.setDublado(true);
                    ingressoMeiaEntrada.setValor(valor / 2);
                } else {
                    ingressoMeiaEntrada.setDublado(false);
                    ingressoMeiaEntrada.setValor(valor);
                }

                ingressoMeiaEntrada.imprimeIngresso();

                break;
            case 2:

                System.out.println("Quantas pessoas irão assistir o filme?");
                int pessoas = scanner.nextInt();

                IngressoFamilia ingressoFamilia = new IngressoFamilia();
                ingressoFamilia.setFilme(Filme);
                ingressoFamilia.setPessoas(pessoas);
                if (tipoFilme == 1) {
                    ingressoFamilia.setDublado(true);

                    ingressoFamilia.setValor(valor / 2);
                } else {
                    ingressoFamilia.setDublado(false);
                    ingressoFamilia.setValor(valor);
                }

                ingressoFamilia.imprimeIngresso();

                break;
            default:
                break;


        }


    }

}
