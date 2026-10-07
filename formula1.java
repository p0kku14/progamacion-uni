//formula general
//esca sto tomas
//JDPL ver 1.0

import java.util.Scanner;

public class formula1 {//1
          public static void main (String[] args){//2
          //declarando las variables
          double a,b,c,x1,x2,grad,num1,num2;
          //creando el objeto
          Scanner objscanner= new Scanner(System.in);
          System.out.print("Dame el valor de a: ");
          a=objscanner.nextDouble();
          System.out.print("Dame el valor de b: ");
          b=objscanner.nextDouble();
          System.out.print("Dame el valor de c: ");
          c=objscanner.nextDouble();
         //validamos el valor de a
         if(a!=0){//3
         //calculamos el gradiente
                   grad=(b*b)-(4*a*c);
                   //validamos el valor del gradiente
                   if(grad>0){//4
                   //calculamos el numerador
                   num1= -b-(Math.sqrt(grad));
                   num2= -b+(Math.sqrt(grad));
                   //calculamos los valores de x
                   x1=num1/(2*a);
                   x2=num1/(2*a);
        //mostramos los valores de x1 y x2
        System.out.println("Valor de x1 es : "+x1);
        System.out.println("Valor de x2 es : "+x2);
                   }//4
                   else{//5 
                          System.out.print("Numeros imaginarios");
                           }//5
                   }//3
                   else{
                   System.out.print("Valor infinito ");
                   }//6
         }//2
}//1