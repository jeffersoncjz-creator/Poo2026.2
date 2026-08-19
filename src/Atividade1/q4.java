package Atividade1;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o seu peso (em kg, ex: 70.5): ");
        double peso = leitor.nextDouble();

        System.out.print("Digite a sua altura (em metros, ex: 1.75): ");
        double altura = leitor.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Seu IMC calculado é: " + imc);

        // 3. Condições: Classificação do IMC
        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Classificação: Peso normal");
        } else if (imc < 30) {
            System.out.println("Classificação: Sobrepeso");
        } else {
            System.out.println("Classificação: Obeso");
        }

    }
}
