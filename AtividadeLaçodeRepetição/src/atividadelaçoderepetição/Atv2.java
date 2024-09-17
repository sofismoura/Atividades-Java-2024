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
public class Atv2 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();

        System.out.println("A tabuada do número escolhido é " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
    
        }
    }
}
