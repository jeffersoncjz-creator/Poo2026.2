package atividade;

import java.util.Scanner;

public class calculadora {

    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        String operacao = sc.next();

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        switch (operacao) {
            case "+" -> System.out.println("O resultado da soma de " + num1 + " + " + num2 + " é " + (num1 + num2));

            case "-" -> System.out.println("O resultado da subtração de " + num1 + " - " + num2 + " é " + (num1 - num2));

            case "*" -> System.out.println("O resultado da multiplicação de " + num1 + " x " + num2 + " é " + (num1 * num2));

            case "/" -> System.out.println("O resultado da divisão de " + num1 + " / " + num2 + " é " + (num1 / num2));

            default -> System.out.println("Operação inválida");
        }

    }
}