//Calculadora basica 
//191026
//
import java.util.Scanner;

public class CalculadoraC{
	public static void main(String[ ] args){
	//definir las variables
	double num1, num2 , sum , res , mult , div;
	int op , op1;
	//crear objeto para entrada de teclado
	Scanner entrada = new Scanner (System.in);
	do{

	//crear menu
	System.out.println("Menu de operaciones");
	System.out.println("1. Suma" );	
	System.out.println("2. Resta ");
	System.out.println("3. Multiplicación ");
	System.out.println("4. División ");
	System.out.println("dame una opción ");	
	op = entrada.nextInt();
	//pedir los valores
	System.out.println("dame el primer numero");	
	num1 = entrada.nextDouble();
	System.out.println("dame el segundo numero");	
	num2 = entrada.nextDouble();
	
	//iniciar switch
	switch(op)
	{
	case 1:
		sum=num1+num2;
		System.out.println("el valor de la suma es " +sum);	
		break;
	case 2: 
		res=num1-num2;
		System.out.println("el valor de la resta es " +res);	
		break;
	case 3:
		mult=num1*num2;
		System.out.println("el valor de la multiplicacion es " +mult);	
		break;
	case 4:
		//validar el num2 !=0
		if (num2!=0){
		div=num1/num2;
		System.out.println("el valor de la division es " +div);
		} else{
		System.out.println("Valor indeterminado");
		}
		break;
	default:
		System.out.println("ese no tenemos");	
	}//termina switch
	System.out.println("Deseas realizar otra operaacion?");
	System.out.println("1 para cualquier otra cosa para SALIR");
	op1=entrada.nextInt();
	}while(op1==1);
	}//main
	
}//principal
