package Atividade1;

import java.util.Scanner;

public class q1 {

    static void main() {

        Scanner sc = new Scanner(System.in);
        //questão 1 Peça ao usuário para digitar seu nome e idade.

        System.out.print("Digite seu nome: ");
        String nome = sc.next();
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Olá! " +nome +" Você tem: " +idade +" anos");
    }


}
