//formula general
//jdpl ver 1.0
//07102026

import java.util.Scanner;

public class formula2{//1

	public static void main(String[] args) {//2
	//declarar variablñes
	double a,b,c,x1,x2,num1,num2,grad;
	char respuesta;
	//crear objeto
	Scanner objscanner = new Scanner(System.in);

	// Iniciar el bucle do-while
        do {//7

	   //pedir los valores
	   System.out.print("Dame el valor de a: ");
	   a= objscanner.nextDouble();
	   System.out.print("Dame el valor de b: ");
	   b= objscanner.nextDouble();
	   System.out.print("Dame el valor de c: ");
	   c= objscanner.nextDouble();
	   //validar el valor de a
	  	   if (a!=0){//3
			   //calcular gradiente 
			   grad = (b*b)-(4*a*c);
			   //validar grad mayor a cero
			   if(grad>0){//5
				   //caluclamos numerDOR
				   num1=-b-(Math.sqrt(grad));
				   num2=-b+(Math.sqrt(grad));
			   //caluclamos x1 y x2
			   x1=num1/(2*a);
			   x2=num2/(2*a);
			   System.out.println("El valor de x1 es: "+x1);
			   System.out.println("El valor de x2 es: "+x2);
			   }//5
			   else{//6
			   System.out.println("Valores imaginarios");
		  	   }//6
		   }//3
		   else{//4
		   System.out.println("Valor indeterminado ");
	
		   }//4
		   // Preguntar si desea repetir
		   System.out.print("¿Desea realizar otra operación? (s/n): ");
	           respuesta = objscanner.next().charAt(0);
		   } while (respuesta == 's' || respuesta == 'S'); // Evaluar condición //7
	   }//2
   }//1