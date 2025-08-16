package org.example;

import java.util.Scanner;

public class VerificaNumero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número para ver se ele é positivo ou negativo: ");
        int numero = sc.nextInt();

        if (numero >= 0) {
            System.out.println(numero + " é um numero Positivo!");
            return;
        }
        System.out.println(numero + " é um numero Negativo!");

//        Verificar se um número é positivo ou negativo
////
//        Peça um número ao usuário e diga se ele é positivo, negativo ou zero.
//
//        Variáveis úteis:
//        int numero
    }
}
