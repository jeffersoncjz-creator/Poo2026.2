package Atividade1;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        System.out.print("Digite um número inteiro: ");
        int numero = leitor.nextInt();

        // Condição para verificar se é par ou ímpar
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }

    }
}
