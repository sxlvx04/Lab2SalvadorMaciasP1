package com.mycompany.lab2salvador_macias;

import java.util.Scanner;

public class Lab2salvador_macias {

    public static void main(String[] args) {
        Scanner moly = new Scanner(System.in);
        System.out.println("Bienvenido al menu");
        System.out.println("1.Indice Academico ");
        System.out.println("2.Ok boomer! ");
        System.out.println("3.Gotta know them all!  ");
        System.out.println("Ingrese una opcion: ");
        int opcion = moly.nextInt();
        if (opcion == 1) {
            System.out.println("Ingrese un numero : ");
            int n1 = moly.nextInt();
            System.out.println("Ingrese otro numero : ");
            int n2 = moly.nextInt();
            while (n1 != n2) {

                if (n1 > n2) {
                    n1 = n1 - n2;
                } else {
                    n2 = n2 - n1;
                }
            }
            System.out.println("El maximo comun divisor es:" +n1);

        } else if (opcion == 2) {
            System.out.println("Ingrese su año de nacimiento: ");
            int fecha = moly.nextInt();
            if (fecha <= 1946 && fecha < 1964) {
                System.out.println("usted es um baby boomer ");
            } else if ((fecha >= 1960) && (fecha < 1979)) {
                System.out.println("usted es generacion x");
            } else if ((fecha >= 1975) && (fecha < 1985)) {
                System.out.println("usted es un xellenial");
            } else if ((fecha >= 1980) && (fecha < 1994)) {
                System.out.println("usted es un millenial");
            } else if ((fecha >= 1990) && (fecha < 2012)) {
                System.out.println("usted es un Gen Z");
            } else if ((fecha >= 2013) && (fecha < 2025)) {
                System.out.println("usted es un Gen Alpha");
            }
        } else if (opcion == 3) {
            System.out.println("Bienvenido a la lucha de pokemons");
            System.out.println("Pokemones disponibles!");
            System.out.println("1. Hada");
            System.out.println("2. Hierro");
            System.out.println("3. Luchador");
            System.out.println("4. Psiquico");
            System.out.println("Ingrese el tipo de atacador : ");
            int atacador = moly.nextInt();
            System.out.println("Ingrese el tipo de defensor : ");
            int defensor = moly.nextInt();
            if (atacador == 1 && defensor == 1) {
                System.out.println("El tipo fairy es neutral contra el tipo fairy");
            } else if (atacador == 1 && defensor == 2) {
                System.out.println("El tipo fairy es debil contra el tipo steel  ");
            } else if (atacador == 1 && defensor == 3) {
                System.out.println("El tipo fairy es super eficaz contra el tipo fighting");
            } else if (atacador == 1 && defensor == 4) {
                System.out.println("El tipo fairy es neutral contra el tipo phychic");
            } else if (atacador == 2 && defensor == 1) {
                System.out.println("El tipo steel es super eficaz contra el tipo fairy");
            } else if (atacador == 2 && defensor == 2) {
                System.out.println("El tipo steel es debil contra el tipo steel");
            } else if (atacador == 2 && defensor == 3) {
                System.out.println("El tipo steel es neutral contra el tipo steel");
            } else if (atacador == 2 && defensor == 4) {
                System.out.println("El tipo steel es neutral contra el tipo phychic");
            } else if (atacador == 3 && defensor == 1) {
                System.out.println("El tipo fighting es debil contra el tipo fairy");
            } else if (atacador == 3 && defensor == 2) {
                System.out.println("El tipo fighting es super eficaz contra el tipo steel");
            } else if (atacador == 3 && defensor == 3) {
                System.out.println("El tipo fighting es neutral contra el tipo fighting");
            } else if (atacador == 3 && defensor == 4) {
                System.out.println("El tipo fighting es debil contra el tipo psychic");
            } else if (atacador == 4 && defensor == 1) {
                System.out.println("El tipo pyschic es neutral contra el tipo fairy");
            } else if (atacador == 4 && defensor == 2) {
                System.out.println("El tipo psychic es debil contra el tipo steel");
            } else if (atacador == 4 && defensor == 3) {
                System.out.println("El tipo psychic es super eficaz contra el tipo fighting");
            } else if (atacador == 4 && defensor == 4) {
                System.out.println("El tipo psychic es debil contra el tipo phychic");
            }
        } else {
            System.out.println("Opcion ingresada no existe");
        }
    }
}
