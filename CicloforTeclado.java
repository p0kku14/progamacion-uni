//13 de octubre
//demostracion for, while y do-while
//escasto
//JDPL
import java.util.Scanner;
public class CicloforTeclado{
public static void main(String[ ]args){
	//crear objeto 
	 Scanner Entradateclado = new Scanner(System.in);
	int num ;
	//pedir los valores
	System.out.println("dame un numero: ");
	num = Entradateclado.nextInt();
	for (int i = 1; i <= num; i++){
	System.out.println("Numero:" + i);
	}
	}

}