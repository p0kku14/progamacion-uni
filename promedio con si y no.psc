Algoritmo promedio
	// definir variables
	Definir calificacion1, calificacion2, calificacion3 Como Entero
	Definir prom Como Real
	Escribir 'dame calificacion 1 del estudiante:'
	Leer calificacion1
	Escribir 'dame calificacion 2 del estudiante:'
	Leer calificacion2
	Escribir 'dame calificacion 3 del estudiante:'
	Leer calificacion3
	sum <- (calificacion1+calificacion2+calificacion3)
	prom <- sum/3
	Si prom>6 Entonces
		Escribir "el promedio del alumno es aprobatorio: " , prom
	SiNo
		Escribir "el promedio del alumno es reprobatorio" , prom
	FinSi
FinAlgoritmo
