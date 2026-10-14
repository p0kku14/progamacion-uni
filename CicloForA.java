//demostracion de for
//141026
//jdpl
import java.util.Scanner;
public class CicloForA{	
	public static void main(String[ ]args){
	//declara variables
	int i,num,j,k,l;
	//crear objeto Scanner
	Scanner EntradaDatos = new Scanner (System.in);
	System.out.println("demostracion con for ");
	System.out.println("dame un numero: ");
	num = EntradaDatos.nextInt();
	//parte de arriba
	//inicia ciclo for
	for(i=1;i<=num;i++){
	System.out.print(""+i);
	System.out.print("\t");
		//imprimir asteriscos
		for (j=1;j<=i;j++)
		{
		System.out.print("*");
		}
	System.out.println("");
	}
	//termina parte de arriba

	//inicia parte de abajo

	for(k=num-1;k>=1;k--){
	System.out.print(""+k);
	System.out.print("\t");
		//imprimir asteriscos
		for(l=k;l>=1;l--)
		{
		System.out.print("*");
		}
	System.out.println("");
	}
	//termina parte de abajo
	}	
}