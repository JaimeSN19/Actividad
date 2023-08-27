package actividad_;
import java.util.Scanner;

public class Ejercicio__5{
    public static void main(String[] args) {
        double X, Y, SUMA = 0;
        Scanner Teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor de X: ");
        X = Teclado.nextFloat();
        System.out.println("Ingrese el valor de Y: ");
        Y = Teclado.nextFloat();
        

        SUMA = SUMA + X;
        X = X + Math.pow(Y, 2);
        SUMA = SUMA + (X / Y);
        System.out.println("EL VALOR DE LA SUMA ES: " + SUMA);

    }

}
