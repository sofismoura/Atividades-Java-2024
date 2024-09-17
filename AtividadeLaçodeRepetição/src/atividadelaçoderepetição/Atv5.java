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
public class Atv5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int comeco = entrada.nextInt();

        System.out.print("Digite outro número: ");
        int fim = entrada.nextInt();

        System.out.println("Os números ímpares entre os números escolhidos são: " + comeco + " e " + fim + " =");

        for (int i = comeco; i <= fim; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
    
}
