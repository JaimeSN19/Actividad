package actividad_;

import java.util.Scanner;

public class Ejercicio_14 {

    public static void main(String[] args) {
        double numero;
        Scanner Teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero para hallar su raiz cuadrada y cubica respectivamente:  ");

        numero = Teclado.nextInt();

        double Cuadrado = Math.sqrt(numero);
        double Cubo = Math.cbrt(numero);

        System.out.println("El cuadrado de  este numero es: " + Cuadrado);
        System.out.println("El cubo de este numero es: " + Cubo);
    }
}

