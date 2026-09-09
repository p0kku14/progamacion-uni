Algoritmo comparaciones
	Definir  a , b , c Como Entero
	escribir "dame el valor de a: "
	leer a 
	escribir "dame el valor de b: "
	leer b
	escribir "dame el valor de c: "
	leer c
	//cuando  a es mayor
	Si a>b y b>c Entonces
		escribir " a es mayor : ",a
		escribir " b es medio : ",b
		escribir " c es menor : ",c
	finsi
	Si a>c y c>b
		escribir " a es mayor : ",a
		escribir " c es medio : ",c
		escribir " b es menor : ",b
	Fin Si
	
	// cuando b es mayor 
	Si b>a y a>c Entonces
		escribir " b es mayor : ",b
		escribir " a es medio : ",a
		escribir " c es menor : ",c
		
	finsi
	si b>c y a>c Entonces
		escribir " b es mayor : ",b
		escribir " c es medio : ",c
		escribir " a es menor : ",a
	Fin Si
	
	// cuando b es mayor 
	Si c>a y a>b Entonces
		escribir " c es mayor : ",c
		escribir " a es medio : ",a
		escribir " b es menor : ",b
		
	FinSi
	si c>b y a<b Entonces
		
		escribir " c es mayor : ",c
		escribir " b es medio : ",b
		escribir " a es menor : ",a
	Fin Si
	//cuando a y b son iguales
	si a == b y a>c Entonces
		
		Escribir "a y b son igules: ",a
		Escribir "c es menor ", c
	FinSi
	si a == b y a<c Entonces
		
		Escribir "a y b son igules: ",a
		Escribir "c es mayor ", c
	FinSi
	//cuando a y c son iguales
	si a == c y a>b Entonces
		
		Escribir "a y c son igules: ",a
		Escribir "b es menor ", b
	FinSi
	si a==c y a<b Entonces
		
		Escribir "a y c son igules: ",a
		Escribir "b es mayor ", b
	FinSi
	//cuando by c son iguales
	si c==b y a>c Entonces
		
		Escribir "c y b son igules: ",b
		Escribir "a es menor ", a
	FinSi
	si c==b y a<c Entonces
		
		Escribir "c y b son igules: ",b
		Escribir "a es mayor ", a
	FinSi
	//cuando son  a b c iguales
	si a==b y b==c Entonces
		
		Escribir "a,b y c son igules: ",a
	FinSi
	
		
	
FinAlgoritmo
