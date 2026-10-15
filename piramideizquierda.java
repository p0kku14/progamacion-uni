//demostracion de for
//141026
//jdpl
import java.util.Scanner;
public class piramideizquierda{
	public static void main(String[] args){
	//declara las variables
	int i, j,num,  k, l;
	//crear el objetoScanner
	Scanner EntradaDatos = new Scanner(System.in);
	System.out.println("Demostracion con for ");
	System.out.println("Dame un numero: ");
	num= EntradaDatos.nextInt();
	//parte de arribla
	//inicio ciclo
	for(i=1;i<=num;i++){
	System.out.print(""+i);
	System.out.print("\t");
		//espacios
		for(j=num-1;j>=i;j--){
		System.out.print(" ");		
		}
		//imprimnir asteriscos
		for(j=1;j<=i;j++){
		System.out.print("*");		
		}
	System.out.println("");
	}
	//termina parte de arriba
	//parte de abajo
	for(k=num-1;k>=1;k--){
	System.out.print(""+k);
	System.out.print("\t");
		//espacios
		for(l=k;l<=num-1;l++){
		System.out.print(" ");		
		}
		//imprimnir asteriscos
		for(l=k;l>=1;l--){
		System.out.print("*");		
		}
	System.out.println("");
	}

}
} 