//13 de octubre
//demostracion for, while y do-while
//escasto
//JDPL
import java.util.Scanner;
public class CiclowhileTeclado{
public static void main(String[ ]args){
	//crear objeto 
	 Scanner Entradateclado = new Scanner(System.in);
	int num ;
	//pedir los valores
	System.out.println("ciclo while ");
	System.out.println("dame un numero: ");
	num = Entradateclado.nextInt();

	//inicia ciclo 
	int i = 1;
	while ( i <= num){
	System.out.println("Numero:" + i);
	i++;
	}
	}

}