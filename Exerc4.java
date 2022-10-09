package Questao4;

import java.util.Scanner;

//Faça um Programa que peça as 4 notas bimestrais e mostre a média.
public class Exerc4 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        double n1, n2, n3, n4;
        Double media;

        Scanner sc1 = new Scanner(System.in);

        System.out.println("Insira as notas de cada bimestre:");

        n1 = sc1.nextDouble();
        n2 = sc1.nextDouble();
        n3 = sc1.nextDouble();
        n4 = sc1.nextDouble();
        
        media = ((n1 + n2 + n3 + n4) / 4);

        System.out.println("A média anual é: " + media);

        sc1.close();

    }
    
}
