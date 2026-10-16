import java.util.*;

public class practica2 {
public static void main(String[] args) {

int num, i, j, k, l;
Scanner tecladito = new Scanner(System.in);

//pedir datos
System.out.print("Dame un numero: ");
num = tecladito.nextInt();

for (i = 1; i <= num; i++) {
//fila
System.out.print(i + "\t");

//espacios
for (j = 1; j <= i - 1; j++) {
System.out.print(" ");
}

//k asteriscos lado izquierdo
for (k = 1; k <= num - i + 1; k++) {
System.out.print("*");
}

//l asteriscos lado derecho
for (l = 1; l <= num - i; l++) {
System.out.print("*");
}

//salto de linea
System.out.println();
}
}
}