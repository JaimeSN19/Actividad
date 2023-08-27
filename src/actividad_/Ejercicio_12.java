package actividad_;
import java.util.Scanner;

public class Ejercicio_12 {
    public static void main(String[] args) {
        int horas = 0, valor_horas = 0;
        Scanner Teclado = new Scanner(System.in);
        double retencion = 0;
        System.out.println("Ingrese las horas de trabajo a la semana: ");
        horas = (int) Teclado.nextFloat();
        System.out.println("Ingrese el valor por hora: ");
        valor_horas = (int) Teclado.nextFloat();
        System.out.println("Ingrese el valor de retencion: 1 - 100");
        retencion = Teclado.nextFloat();

        float salario_bruto = horas * valor_horas;
        float Retencion_fuente = (float) (salario_bruto * (retencion / 100));
        float salario_neto = salario_bruto - Retencion_fuente;

        System.out.println("El salario bruto es: " + salario_bruto);
        System.out.println("La Retención a la fuente es: " + Retencion_fuente);
        System.out.println("El salario neto es: " + salario_neto);

    }

}
