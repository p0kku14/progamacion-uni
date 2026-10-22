//Calculadora Basica

import java.util.Scanner;

public class CalculadorC{
	public static void main(String[] args){
	//definir las variables
	double num1, num2, num3, sum, res, mult, div,exp,rc, a, b, x1, x2, grad, por, entre;
	int op, op1;
	//crear objeto para entrada de teclado
	Scanner entrada = new Scanner(System.in);
	do{

	//crear menu
	System.out.println("Menu de operaciones ");
	System.out.println("1. Suma ");
	System.out.println("2. Resta ");
	System.out.println("3. Multiplicacion ");
	System.out.println("4. Division ");
	System.out.println("5. Potencia m a la n un numero");
	System.out.println("6. Raiz cuadrada");
	System.out.println("7. Formula General");
	System.out.println("8. Porcentaje ");
	System.out.println("9. Valores ");
	System.out.println("dame una opcion:  ");
	op = entrada.nextInt();
	//Pedir los valores


	//inicia switch

	switch(op)
	{
	case 1 : 
	System.out.println("dame el primer numero:  ");
	num1 = entrada.nextDouble();
	System.out.println("dame el segundo numero:  ");
	num2 = entrada.nextDouble();
		sum = num1+num2;
		System.out.println("El valor de la suma es: " + sum);
		break;
	case 2 : 
	System.out.println("dame el primer numero:  ");
	num1 = entrada.nextDouble();
	System.out.println("dame el segundo numero:  ");
	num2 = entrada.nextDouble();
		res = num1-num2;
		System.out.println("El valor de la Resta es: " + res);
		break;
	case 3 : 
	System.out.println("dame el primer numero:  ");
	num1 = entrada.nextDouble();
	System.out.println("dame el segundo numero:  ");
	num2 = entrada.nextDouble();
		mult = num1*num2;
		System.out.println("El valor de la multiplicacion es: " + mult);
		break;
	case 4 : 
	System.out.println("dame el primer numero:  ");
	num1 = entrada.nextDouble();
	System.out.println("dame el segundo numero:  ");
	num2 = entrada.nextDouble();
		//validar el num2 !=0
		if (num2!=0){
		div = num1/num2;
		System.out.println("El valor de la division es: " + div);
		} else{
		System.out.println("Valor indeterminado");
		}
		break;
	case 5 :
		System.out.println("Exponente m a la n de 2 numeros");
		System.out.println("Dame el valor de la base");
		num1 = entrada.nextDouble();
		System.out.println("Dame el valor del exponente");
		num2 = entrada.nextDouble();
		exp=Math.pow(num1,num2);
		System.out.println("el valor de tu exponente es:  " +exp);
		break; 
	case 6 :
		
		System.out.println("Dame el numero");
		num1 = entrada.nextDouble();
		rc=Math.sqrt(num1);
		System.out.println("El valor de la raiz es: "+rc);
		break;
	case 7 :
		System.out.print("Dame el valor de a: ");
	num1 = entrada.nextDouble();
	System.out.print("Dame el valor de b: ");
	num2 = entrada.nextDouble();
	System.out.print("Dame el valor de c: ");
	num3 = entrada.nextDouble();
	//validar el valor de a
		if(num1!=0){//3
			//calcular gradiente
			grad = (num2*num2)-(4*num1*num3);
			//validar gradiente mayor a cero				
			if(grad>0){//5
				//calculamos numerador
				a=-num2-(Math.sqrt(grad));
				b=-num2+(Math.sqrt(grad));
			//calculamos x1 y x2
			x1=a/(2*num1);
			x2=b/(2*num1);
			System.out.println("El valor de x1 es: " + x1);
			System.out.println("El valor de x2 es: " + x2);
			}//5
			else{//6
			System.out.print("Valores imaginarios");
			}//6
		}//3
		else{//4
		System.out.print("Valor indeterminado");
		}//4
break;
	case 8 :
		System.out.println(" Dame el numero : ");
num1 = entrada.nextDouble();
System.out.println(" Dame el porcentaje : ");
num2 = entrada.nextDouble();
entre = num2 /100; 
por = num1 * entre;
System.out.println(" El valor es : "+por);
break;

	case 9 :
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
    
break;
	default:
		System.out.println("Ese no tenemos¡¡¡ ");
	}//termina switch
	System.out.println("Deseas realizar otra operacion? ");
	System.out.println("1 para continuar otra cosa Salir");
	op1=entrada.nextInt();
	}while(op==1);

	}
}