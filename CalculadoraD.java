//calculadora Básica swith do while
//19 de octubre 2026
//Programación para negocios digitales
//TFO

import java.util.Scanner;

public class CalculadoraD{
	public static void main (String [] args){
	//definir las variables
	double num1,num2,sum,res,mult,div,exp,rc,x1,x2,a,b,c,grad,por;
	int op,op1 ;
	//crear el objeto para entrada de teclado
	Scanner entrada = new Scanner (System.in);
	do{
	
	//crear menú
	System.out.println("Menú de operaciones");
	System.out.println("1. Suma");
	System.out.println("2. Resta");
	System.out.println("3. Multiplicación");
	System.out.println("4. División");
	System.out.println("5. Potencia m a la n un número");
	System.out.println("6. raíz cuadrada");
	System.out.println("7. Formula general");
	System.out.println("8. Porcentaje");
	System.out.println("Dame una opción : ");
	op = entrada.nextInt();

	
	//inicia switch
	switch(op)
	{
	case 1 : 
		//pedir los valores
		System.out.println("Dame el primer número : ");
		num1 = entrada.nextDouble();
		System.out.println("Dame el segundo número : ");
		num2 = entrada.nextDouble();
		sum = num1+num2;
		System.out.println("El valor de la suma es : " + sum);
		break;
	case 2 : 
		//pedir los valores
		System.out.println("Dame el primer número : ");
		num1 = entrada.nextDouble();
		System.out.println("Dame el segundo número : ");
		num2 = entrada.nextDouble();
		res = num1-num2;
		System.out.println("El valor de la resta es : " + res);
		break;
	case 3 : 
		//pedir los valores
		System.out.println("Dame el primer número : ");
		num1 = entrada.nextDouble();
		System.out.println("Dame el segundo número : ");
		num2 = entrada.nextDouble();
		mult = num1*num2;
		System.out.println("El valor de la multiplicación es : " + mult);
		break;
	case 4 : 
		//pedir los valores
		System.out.println("Dame el primer número : ");
		num1 = entrada.nextDouble();
		System.out.println("Dame el segundo número : ");
		num2 = entrada.nextDouble();
		//validar num2 !=0
		if (num2!=0){
		div=num1/num2;
		System.out.println("El valor de la división es : " + div);

		}else{
		System.out.println("Valor indeterminado");
		}
		break;
	case 5 : System.out.println("Exponente de m a la n de 2 números");
		System.out.println("Dame el valor de la base : ");
		num1 = entrada.nextDouble();
		System.out.println("Dame el valor del exponente : ");
		num2 = entrada.nextDouble();
		exp =Math.pow(num1,num2);
		System.out.println("El valor del exponente es : " + exp);
		break; 
	case 6 :
		System.out.println("Dame el valor del radicando : ");
		num1 = entrada.nextDouble(); 
		rc =Math.sqrt(num1);
		System.out.println("El valor del raíz es : " + rc);
		break; 
	case 7 : 
		System.out.print("Dame el valor de a : ");
		a = entrada.nextDouble();
		System.out.print("Dame el valor de b : ");
		b = entrada.nextDouble();
		System.out.print("Dame el valor de c : ");
		c = entrada.nextDouble();
		//validar el valor de a
		if(a!=0){
			//calcular gradiente
			grad = (b*b)-(4*a*c);
			if(grad>0){
				//calculamos numerador
				num1=-b-(Math.sqrt(grad));
				num2=-b+(Math.sqrt(grad));
			//calculamos x1 y x2
			x1=num1/(2*a);
			x2=num2/(2*a);
			System.out.println("El valor de x1 : " + x1);
			System.out.println("El valor de x2 : " + x2);
			}

			else{
			System.out.print("Valores Imaginarios");
			}
		}
		else{
		System.out.print("Valor indeterminado");
		}
		break; 
	case 8 :
		System.out.println("Dame el número : ");
		num1 = entrada.nextDouble(); 
		System.out.println("Dame el porcentaje : ");
		num2 = entrada.nextDouble(); 
		por = (num1*num2)/100;
		System.out.println("El porcentaja del número es : " + por + "%");
		break; 
	default : 
		System.out.println("Ese no tenemos¡¡¡" );
	}//termina switch
	System.out.println("Deseas realizar otra operción ? ");
	System.out.println("1 para continuar, cualquier otra cosa para SALIR");
	op1 = entrada.nextInt();
	}while (op1==1);
	}//main
}//principal