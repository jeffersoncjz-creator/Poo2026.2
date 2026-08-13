package estruturas_condicionais;

import java.util.Scanner;

public class App {
    static void main() {
//        boolean estaChovendo = true;
//        if (estaChovendo){
//            System.out.println("Leve um guarda chuva");
//        }
//
//        int num1 = 1;
//        int num2 = 2;
//        boolean saoIguais = num1 == num2;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Digite um numero: ");
//        int num = sc.nextInt();
//
//        if(num % 3 == 0){
//            System.out.println("Múltiplo de 3");
//        }else if(num % 5 == 0){
//            System.out.println("Múltiplo de 5");
//        }else {
//            System.out.println("Número invalido");



//        Scanner sc = new Scanner(System.in);
//        System.out.print("Digite a nota final: ");
//        int nota = sc.nextInt();
//        switch (nota){
//            case 4:
//                System.out.println("Em recuperação");
//            break;
//            case 7:
//                System.out.println("Aprovado!");
//            break;
//            case 10:
//                System.out.println("Excelente!");
//            break;
//            default:
//                System.out.println("Nota invalida");
//            break;


        String menu = """
                1-Entrar
                2-Cadastrar
                3-Listar
                """;
        System.out.print(menu);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma opçao: ");
        int opcao = sc.nextInt();

        switch (opcao){
            case 1 -> System.out.println("Entrar");
            case 2 -> System.out.println("Cadastrar");
            case 3 -> System.out.println("Lista");
            default -> System.out.println("Opção Invalida");
        }



        }
    }

