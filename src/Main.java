import java.util.Scanner;
public class Main {
public static void main(String[] args) {
int x;
Scanner entrada = new Scanner(System.in);
System.out.println("Ingrese un valor entero:");
x = entrada.nextInt();
if (x % 2 == 0){
System.out.println("El valor ingresado es par");
}
else{
System.out.println("El valor ingresado es impar");
}
}
}
