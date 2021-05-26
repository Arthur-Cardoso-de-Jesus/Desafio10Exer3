/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio10exer3;

import java.util.Scanner;

/**
 *
 * @author baung
 */
public class Desafio10Exer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int nTermos, a1, aN, n, rProgresso,acumulador ;
        
        System.out.println("Insira o numero de termos");
        nTermos = ler.nextInt();
        n = 1;
        acumulador = 0;
        a1 = 0;
        rProgresso = 0;
        for (int cont = 0; cont < nTermos;cont++) {
            if (cont == 0) {
                System.out.println("Insira o termo inicial:");
                a1 = ler.nextInt();
                System.out.println("Insira a razao da PA:");
                rProgresso = ler.nextInt();
                System.out.println("------------------------");
            }

            aN = a1 + (n - 1) * rProgresso;

            acumulador = acumulador + aN;
            n++;
            System.out.println(aN);
        }
        System.out.println("Total da soma:"+acumulador);
    }
}
