package org.example.Ejercicio2;


import java.util.Scanner;

public class Operaciones {
    private int capacidad;

    public Operaciones() {

    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int suma(int b) throws DesbordaCapacidadException {
        int resultado = getCapacidad() + b;

            if(resultado == (long)getCapacidad()+b){
                setCapacidad(resultado);
                mostrar();
                return resultado;
            }else {
                throw new DesbordaCapacidadException("El resultado de la suma es mayor que la capacidad");
            }

    }

    public int resta(int b) throws DesbordaCapacidadException {
        int resultado = getCapacidad() - b;
            if(resultado == (long)getCapacidad()-b){
                setCapacidad(resultado);
                mostrar();
                return resultado;
            }else {
                throw new DesbordaCapacidadException("El resultado de la resta es mayor que la capacidad");
            }

    }

    public int multiplicacion(int b) throws DesbordaCapacidadException {
        int resultado = getCapacidad() * b;
            if(resultado == (long)getCapacidad()*b){
                setCapacidad(resultado);
                mostrar();
                return resultado;
            }else {
                throw new DesbordaCapacidadException("El resultado de la multiplicacion es mayor que la capacidad");
            }

    }

    public int division(int b){
        int resultado = 0;
        try {
            resultado = getCapacidad() / b;
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por 0");
            e.getMessage();
        }
        return resultado;
    }

    public void mostrar(){
        System.out.println("El resultado es: " + getCapacidad());
    }
    public void mostrarMenuMain(){
        Operaciones op = new Operaciones();
        Scanner sc = new Scanner(System.in);
        while(op.getCapacidad() > -2147483648 && op.getCapacidad() < 2147483647){
            try {
                System.out.println("Introduce un numero");
                int num = sc.nextInt();
                System.out.println("Introduce una operacion: +, -, *, /");
                String operacion = sc.next();
                switch (operacion) {
                    case "+":
                        try {
                            op.suma(num);
                        } catch (DesbordaCapacidadException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case "-":
                        try {
                            op.resta(num);
                        } catch (DesbordaCapacidadException e) {
                            System.out.println(e.getMessage());
                        }

                        break;
                    case "*":
                        try {
                            op.multiplicacion(num);
                        } catch (DesbordaCapacidadException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case "/":
                        op.division(num);
                        break;
                    case "s":
                        System.out.println("Saliendo...");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Operacion no valida");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Introduce un numero valido");
                sc.next();
            }

        }

    }
    public static void auxiliar(){
        Operaciones op = new Operaciones();
        op.mostrarMenuMain();
    }
}
