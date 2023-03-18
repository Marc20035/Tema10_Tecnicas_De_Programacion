package org.example.Ejericicio1;

import java.util.Scanner;

public class RaizCuadrada {
    public void raizCuadrada(double numero) {
        if (numero < 0) {
            System.out.println("No se puede sacar la raiz cuadrada de un numero negativo");
            return;
        }else {
            double raiz = Math.sqrt(numero);
            System.out.println("La raiz cuadrada de " + numero + " es " + raiz);
        }
    }
    public void mostrarMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero para sacar su raiz cuadrada: ");
        double numero = sc.nextDouble();
        raizCuadrada(numero);
    }
    public static void auxiliar() {
        RaizCuadrada raiz = new RaizCuadrada();
        raiz.mostrarMenu();
    }
}
