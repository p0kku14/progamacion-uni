import java.util.*;

public class Array2 {
    public static void main(String[] args){
        int[] edades = new int[5];
        int i, j, acumulador = 0, aux, auxPos = 0, auxM, auxPosM = 0;
        double promedio;
        Scanner tecladito = new Scanner(System.in);

        for (i = 0; i < edades.length; i++){
            System.out.print("Ingresa un valor: ");
            edades[i] = tecladito.nextInt();
        }

        aux  = edades[0];
        auxM = edades[0];

        for (j = 0; j < edades.length; j++){
            System.out.print(" Valor: " + edades[j]);
            System.out.println("  Posicion: " + j);

            acumulador += edades[j];

            if (edades[j] > aux){
                aux = edades[j];
                auxPos = j;
            }
            if (edades[j] < auxM){
                auxM = edades[j];
                auxPosM = j;
            }
        }

        System.out.println("Total: " + acumulador);
        promedio = (double) acumulador / edades.length;
        System.out.println("Promedio: " + promedio);
        System.out.println("El valor mayor es: " + aux);
        System.out.println("La posicion de valor mayor es: " + auxPos);
        System.out.println("El valor menor es: " + auxM);
        System.out.println("La posicion de valor menor es: " + auxPosM);
    }
}
