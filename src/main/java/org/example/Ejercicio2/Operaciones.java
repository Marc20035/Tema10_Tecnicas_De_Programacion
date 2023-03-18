package org.example.Ejercicio2;


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
}
