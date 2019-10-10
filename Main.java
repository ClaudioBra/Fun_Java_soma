package com.company;

import java.util.Scanner;

public class Main {

    static int soma(int a, int b) {
        int s = a + b;
        return s;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int resultado, a, b;
        char sn = 0;
        System.out.print("Primeiro valor: ");
        a = teclado.nextInt();
        System.out.print("Segundo valor: ");
        b = teclado.nextInt();
        resultado = soma(a, b);
        System.out.println("Soma: " + resultado);

    }
}
