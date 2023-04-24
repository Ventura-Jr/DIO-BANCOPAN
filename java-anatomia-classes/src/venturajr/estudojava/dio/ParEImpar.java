package venturajr.estudojava.dio;

import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0;

        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();

        int count = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0)
                quantPares++; // se o resto da divisão do número for 0, então ele é par
            else
                quantImpares++; // se não, ele é impar

            // count = count + 1;
            count++; // incremento

        } while (count < quantNumeros);

        System.out.println("A quantidade de números pares é: " + quantPares);
        System.out.println("A quantidade de números ímpares é: " + quantImpares);
    }
}
