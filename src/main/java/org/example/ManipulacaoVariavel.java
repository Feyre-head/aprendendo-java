package org.example;

import java.sql.SQLOutput;

public class ManipulacaoVariavel {

    int personAge = 24;
    double personHeight = 1.68;
    String personName = "Feyre";

    boolean isStudent = true;

    //função(metodo)
    public int doubleAge(){
        return (personAge + personAge);
    }

    public double doubleHeight(){
        return(personHeight * 2);
    }

    public String nameConcat(){
        return ("Olá "+ personName );
    }

    public static void main(String[] args) {

        ManipulacaoVariavel m = new ManipulacaoVariavel();

        System.out.println("Nome: " + m.personName);
        System.out.println("Idade: "+ m.personAge);
        System.out.println("Altura:" + m.personHeight);
        System.out.println("Estudante: " + m.isStudent);
        System.out.println("Dobro da Idade: " + m.doubleAge());
        System.out.println("Dobro Altura: " + m.doubleHeight());
        System.out.println(m.nameConcat());



    }
}
