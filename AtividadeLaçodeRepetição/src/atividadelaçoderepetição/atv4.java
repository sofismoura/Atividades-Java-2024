/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadelaçoderepetição;

import java.util.Scanner;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class atv4 {
    
     public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inicial: ");
        int comeco = entrada.nextInt();

        System.out.print("Digite um número final: ");
        int fim = entrada.nextInt();

        int soma = 0;

        for (int i = comeco; i <= fim; i++) {
            if (i % 2 != 0) { 
                soma += i;
            }
        }

        System.out.println("A soma dos números ímpares entre os números escolhidos é de: " + comeco + " e " + fim + " = " + soma);
    }
    
}
