import java.util.Scanner;

public class Comparaciones {
    public static void main(String[] args) {
        Scanner objscanner = new Scanner(System.in);
        int a, b, c;
        String respuesta = "si";

        while (respuesta.equalsIgnoreCase("si") || respuesta.equalsIgnoreCase("s")) {
            
            System.out.print("Ingresa el numero a: ");
            a = objscanner.nextInt();

            System.out.print("Ingresa el numero b: ");
            b = objscanner.nextInt(); // Corregido: nextInt() en vez de nextInit()

            System.out.print("Ingresa el numero c: ");
            c = objscanner.nextInt();

            // CUANDO A ES MAYOR
            if (a > b && b > c) {
                System.out.println(" a es mayor : " + a);
                System.out.println(" b es medio : " + b);
                System.out.println(" c es menor : " + c);
            } else if (a > c && c > b) {
                System.out.println(" a es mayor : " + a);
                System.out.println(" c es medio : " + c);
                System.out.println(" b es menor : " + b);
            }
            // CUANDO B ES MAYOR
            else if (b > a && a > c) {
                System.out.println(" b es mayor : " + b);
                System.out.println(" a es medio : " + a);
                System.out.println(" c es menor : " + c);
            } else if (b > c && c > a) {
                System.out.println(" b es mayor : " + b);
                System.out.println(" c es medio : " + c);
                System.out.println(" a es menor : " + a);
            }
            // CUANDO C ES MAYOR
            else if (c > a && a > b) {
                System.out.println(" c es mayor : " + c);
                System.out.println(" a es medio : " + a);
                System.out.println(" b es menor : " + b);
            } else if (c > b && b > a) {
                System.out.println(" c es mayor : " + c);
                System.out.println(" b es medio : " + b);
                System.out.println(" a es menor : " + a);
            }
            // COMPARACIONES CUANDO A Y B SON IGUALES
            else if (a == b && a > c) {
                System.out.println(" a y b son iguales:" + a);
                System.out.println(" c es menor " + c);
            } else if (a == b && a < c) {
                System.out.println(" a y b son iguales:" + a);
                System.out.println(" c es mayor " + c);
            }
            // CUANDO A Y C SON IGUALES
            else if (a == c && a > b) {
                System.out.println(" a y c son iguales:" + a);
                System.out.println(" b es menor " + b);
            } else if (a == c && a < b) {
                System.out.println(" a y c son iguales:" + a);
                System.out.println(" b es mayor " + b);
            }
            // CUANDO B Y C SON IGUALES
            else if (c == b && a > c) {
                System.out.println(" c y b son iguales:" + b);
                System.out.println(" a es mayor " + a);
            } else if (c == b && a < c) {
                System.out.println(" c y b son iguales:" + b);
                System.out.println(" a es menor " + a);
            }
            // Cuando A, B Y C SON IGUALES
            else if (a == b && b == c) {
                System.out.println("a, b y c son iguales: " + a);
            }

            // Pregunta para continuar (DENTRO del ciclo while)
            System.out.print("\n¿Deseas realizar otra operacion? (si/no): ");
            respuesta = objscanner.next();
            System.out.println();
            
        } // Cierra el ciclo while

        System.out.println("Programa finalizado.");
    } // Cierra el método main
} // Cierra la clase Comparaciones