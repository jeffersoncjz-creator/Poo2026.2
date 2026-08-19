package Atividade1;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = leitor.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = leitor.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = leitor.nextInt();

        int maior;

        // Verificando qual é o maior usando o operador lógico && (E)
        if (num1 >= num2 && num1 >= num3) {
            // Se num1 for maior ou igual ao num2 E maior ou igual ao num3
            maior = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            // Se num2 for maior ou igual ao num1 E maior ou igual ao num3
            maior = num2;
        } else {
            // Se nenhum dos dois anteriores for o maior, só sobra o num3
            maior = num3;
        }
        System.out.println("O maior número digitado é: " + maior);

    }
}
