Algoritmo general
	//d efinir variables
	definir a,b,c,grad,num1,num2, x1,x2 Como Real 
	//le pedimos valores al usuario
	Escribir "Dame el valor de a "
	leer a
	Escribir "Dame el valor de b "
	leer b
	Escribir "Dame el valor de c "
	leer c
	//validar el valor de a
	Si a<>0 Entonces
		//calculamoa el gradiente
		grad<-(b*b)-(4*a*c)
		//validamo gradiente
		Si grad>0 Entonces
			//calculamos numeradores
			num1<-(-b)-rc(grad)
			num2<-(-b)+rc(grad)
			//el entrepaentesis el valor al que le sacamos la raiz y todo eso se asigna anum1 y calculamos num1
			x1<-num1/(2*a)
			x2<-num2/(2*a)
			//mostrar los datos
			escribir "el valor de x1 es:",x1
			escribir "el valor de x2 es:",x2
	
		SiNo
			escribir "valores imaginarios"
		Fin Si
		
	SiNo
		escribir "Es un valor indeterminado"
	Fin Si
FinAlgoritmo
