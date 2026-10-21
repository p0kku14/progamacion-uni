public class Array{
	public static void main(String[]args){
	//Declarar e inicializar una sola linea
	int[] edades ={25, 30, 19, 22, 15 };
	int i, acumulador=0;
	double promedio;
		//inicia for
		for (i=0; i<=4;i++){
		System.out.print("valor del arreglo : "+edades[i]);
		System.out.println("   Posicion : "+i);	
		//acumulador
		acumulador=acumulador+edades[i];
		}//termina for
		System.out.println("   Acumulador "+ acumulador);
		//calcula promedio
		promedio=acumulador/i;
		System.out.println("   Promedio "+ promedio);
	}//termina main

}//termina clase 