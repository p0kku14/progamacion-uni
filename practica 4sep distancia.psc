Algoritmo d2
	// definimos variables
	Definir x1, x2, y1, y2 Como Real
	// le pedimos valores al usuario
	Escribir 'dame coordenada de x1'
	Leer x1
	Escribir 'dame coordenada de x2'
	Leer x2
	Escribir 'dame coordenada de y1'
	Leer y1
	Escribir 'dame coodernada de y2'
	Leer y2
	// vamos hacer operaciones
	resta1 <- (x2-x1)*(x2-x1)
	resta2 <- (y2-y1)*(y2-y1)
	resultado <- rc(resta1+resta2)
	Escribir 'la distancia entre 2 puntos es:', resultado
FinAlgoritmo
