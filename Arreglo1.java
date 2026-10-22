//arrelgos
//221026
//escasto
import java.util.Scanner;

public class Arreglo1{
	public static void main(String[]args){
	//declarar variables
	int i, j, acum=0, prom=0, aux=0, aux2=100, auxPos=0, auxPos2=0;
	//Declarar e inicializar una sola linea
	//declarar arrelgo
        int[] edades = new int[5];
	//generar objeto
        Scanner Entrada = new Scanner(System.in);
        // Ingresar los valores con el for
        for (i = 0; i <= 4; i++) {
        	System.out.print("Ingresa valor: ");
	        edades[i] = Entrada.nextInt();
       		} // Termina for
        // Imprimir los valores
        for (j = 0; j <= 4; j++) {
        	System.out.print("Valor: " + edades[j]);
	        System.out.println(" Posicion: " + j);		
		acum=acum+edades[j];
			//busca mayor
			if (edades[j] > aux) {
			aux = edades[j]; // Actualizamos el mayor
			auxPos=j;
			}//termina busca

            // Busca menor
            if (edades[j] < aux2) {
                aux2 = edades[j]; // Actualizamos el menor
                auxPos2 = j;
            }	

	}//termina for de imprimir valores
        System.out.println(" Total: " + acum);
        
        // Calcula promedio 
        prom = acum / 5;
        System.out.println(" El promedio es: " + prom);
	//imprimir valor mayor
	System.out.println ( " El valor mayor es :  "+aux );
	System.out.println ( " La posición de valor mayor es :  "+auxPos );
        // Imprimir valor menor
        System.out.println(" El valor menor es: " + aux2);
        System.out.println(" La posicion de menor valor es: " + auxPos2);
	}//termina main

}//termina clase 
