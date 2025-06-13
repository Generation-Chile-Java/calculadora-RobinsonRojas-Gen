import java.util.Scanner; // Importa Scanner

public class Calculadora {

    public static void main(String[] args) {

        Scanner ingresoTeclado = new Scanner(System.in); // Variable Scanner para ingresar por teclado

        System.out.println("\nBienvenido a la calculadora Java, que procesa sumas, restas, multiplicación, divisiones y calcula restos de divisiones"); // Saluda

        System.out.println("\nEsta calculadora funciona con el ingreso de 2 números, suma estos 2 números, resta el segundo número del primero, "); // Explica lo que hace el programa
        System.out.println("multiplica ámbos números e imprime el resultado, entrega el cociente de una división (del primer número dividido por el segundo), ");
        System.out.println("y también entrega el resto del primer número dividido por el segundo, resultando en otro valor esta división");

        System.out.println("\n[Ingrese el primer número]: "); // Pide ingreso de 2 válores
        int primerNumero = ingresoTeclado.nextInt();
        System.out.println("\n[Ingrese el segundo número]: ");
        int segundoNumero = ingresoTeclado.nextInt();

        // Imprime los 3 primeros cálculos por separado

        System.out.println("\nLa suma de ambos números es: " + primerNumero + " + " + segundoNumero + " = " + (primerNumero + segundoNumero));
        System.out.println("\nEl resultado de restar el segundo número al primer número es: " + primerNumero + " - " + segundoNumero + " = " + (primerNumero - segundoNumero));
        System.out.println("\nEl producto de la multiplicación de ámbos números es: " + primerNumero + " * " + segundoNumero + " = " + (primerNumero*segundoNumero));

        // Imprime división y resto juntos (pegados)

        float divisionDeAmbosNumerosIngresados = (float)primerNumero / segundoNumero; // Hace posible resultado de división con decimales
        System.out.println("\nEl cociente, resultado de la división del primer número ingresado por el segundo en ingresar es: " + primerNumero + " / " + segundoNumero + " = " + divisionDeAmbosNumerosIngresados);
        System.out.println("Y el resto de esta división es: " + (primerNumero % segundoNumero) + ", en este caso, el resultado de la división con resto es: " + (primerNumero / segundoNumero));

    }
}
