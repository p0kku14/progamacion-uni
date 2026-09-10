Algoritmo sin_titulo
	//definir las variables
	definir i,j,k,num Como Entero
	//pedir los valores
	Escribir "dame un número: "
	Leer num
	//inicia ciclo de numeros
	i<-1
	Mientras i<= num Hacer
		Escribir "",i Sin Saltar
		Escribir "    " Sin Saltar
		// cilco de -
		j<-1
		Mientras j<=i-1 Hacer
			escribir "-" Sin Saltar
			j<-j+1
		Fin Mientras
		//ciclo de asteristos
		i<-i+1
		Para j<-num-i Hasta 0 Con Paso -1 Hacer
			Escribir "*" Sin Saltar
		Fin Para
		Escribir "*"
	Fin Mientras
FinAlgoritmo
