//Calculadora basica 
//191026
//
import java.util.Scanner;

public class CalculadoraB{
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
	System.out.println("5. Potencia m a la n de un numero ");
	System.out.println("6. Raiz cuadrada ");
	System.out.println("7. Formula General ");
	System.out.println("8. Porcentaje ");
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
	case 5: System.out.println("Exponente m a la n de 2 números");
		System.out.println("Dame el valor de la base  :");
		num1 = entrada.nextDouble();
		System.out.println("Dame el valor del exponente :");
		num2 = entrada.nextDouble();
		exp=Math.pow(num1, num2);
		System.out.println ("El valor del exponente es: ");
		break;	
	case 6:	System.out.println("Raíz cuadrada");
        System.out.print("Dame el valor del número: ");
        num1 = entrada.nextDouble();
        if (num1 >= 0) {
        	rc = Math.sqrt(num1);
            System.out.println("La raíz cuadrada es: " + rc);
        } else {
            System.out.println("Error: No existen raíces cuadradas reales de números negativos.");
        }
        break;	
	case 7: // CASO 7(Fórmula general: ax^2 + bx + c = 0)
        System.out.println("Fórmula General (ax^2 + bx + c = 0)");
        System.out.print("Dame el valor de a: ");
        a = entrada.nextDouble();
        System.out.print("Dame el valor de b: ");
        b = entrada.nextDouble();
        System.out.print("Dame el valor de c: ");
        c = entrada.nextDouble();

        if (a == 0) {
           System.out.println("Error: El valor de 'a' no puede ser 0 en una ecuación de segundo grado.");
        } else {
            discriminante = Math.pow(b, 2) - (4 * a * c);

            if (discriminante >= 0) {
            	x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            	x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            	System.out.println("x1 = " + x1);
        	    System.out.println("x2 = " + x2);
            } else {
                            System.out.println("Error: Las soluciones son números complejos / imaginarios.");
                       }
        }
        break;

    case 8: System.out.println("Cálculo de Porcentaje");
        System.out.print("Dame la cantidad total: ");
        num1 = entrada.nextDouble();
        System.out.print("Dame el porcentaje que deseas calcular (%): ");
        num2 = entrada.nextDouble();
        porcentaje = (num1 * num2) / 100;
        System.out.println("El " + num2 + "% de " + num1 + " es: " + porcentaje);
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