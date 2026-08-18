package arrays;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class exemploArrays {
    static void main() {

        //declarando array vazio
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Indice: " + i + " - valor: " + numeros[i]);
        }
        System.out.println("************************************");
        //declarando array com valores
        int[] numeros2 = new int[]{3, 8, 7, 4, 9, 10};
        for (int i = 0; i < numeros2.length; i++) {
            System.out.println("Indice: " + i + " - valor: " + numeros2[i]);
        }
        System.out.println("************************************");
        //inserindo valores no array
        for (int i = 0; i < numeros.length; i++){
            numeros[i] = (i + 1) * 10;
        }
        //exibindo so valores do array
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Indice: " + i + " - valor: " + numeros[i]);
        }
        //for aprimorado / foreach
        for (int num : numeros){
            System.out.println(num);
        }


        int comecaEm = 10;
        int terminaEm = 10;


        System.out.println("****************************************");
        System.out.println("Executando while");

        while (comecaEm != terminaEm){
            System.out.println("O While nunca será executado");
            System.out.println("Comeca em: " +comecaEm);

            comecaEm++;
        }
        System.out.println("****************************************");
        System.out.println("Executando com do-while");

        do {
            System.out.println("Comeca em: " +comecaEm);
            comecaEm++;
        }while (comecaEm != terminaEm);



    }

}