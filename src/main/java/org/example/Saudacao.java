package org.example;

import java.time.LocalTime;

public class Saudacao {

    public static void main(String[] args) {

//        Manhã → até 11h59
//        Tarde → até 17h59
//        Noite → depois disso

        //pega hora atual do sistema
        LocalTime horaAtual = LocalTime.now();

        //converte para int e pega somente os numeros
        int hora = horaAtual.getHour();

        if (hora >= 0 & hora < 12) {
                        System.out.println("Bom dia!");

        } else if (hora >= 12 & hora <= 18) {
                        System.out.println("Boa tarde!");

        } else {
            System.out.println("Boa noite!");
        }

        System.out.println("Agora São: " + horaAtual);


    }
}
