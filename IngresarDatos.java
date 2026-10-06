import java.util.Scanner;

public class IngresarDatos {
    public static void main(String[] args) {
	//creando el objeto         
	Scanner objscanner = new Scanner(System.in);
	//mensaje para el usuario 
        System.out.print("Ingresa tu nombre: ");
        //guardando el valor en la variable 
	String nombre = objscanner.nextLine();
	//mensaje para el usuario 
        System.out.print("Ingresa tu apellido paterno: ");
        //guardando el valor en la variable 
	String apellidopaterno = objscanner.nextLine();
	//mensaje para el usuario 
        System.out.print("Ingresa tu apellido materno: ");
        //guardando el valor en la variable 
	String apellidomaterno= objscanner.nextLine();
	//mensaje para el usuario 
        System.out.print("Ingresa tu correo: ");
        //guardando el valor en la variable 
	String correo = objscanner.nextLine();

        System.out.print("Ingresa tu edad: ");
        int edad = objscanner.nextInt();
        System.out.println("Hola " + nombre + apellidopaterno + apellidomaterno + correo+", tienes " + edad + " años.");
    }
}