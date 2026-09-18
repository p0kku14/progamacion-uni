Algoritmo Calculadora
    Definir continuar, opcion Como Entero
    Definir num1, num2, resultado Como Real
    
    continuar <- 1
    
    Mientras continuar = 1 Hacer
        Escribir "--- MENÚ DE CALCULADORA ---"
        Escribir "1. Suma"
        Escribir "2. Resta"
        Escribir "3. Multiplicación"
        Escribir "4. División"
        Escribir "5. Raíz Cuadrada"
        Escribir "6. Potencia"
        Escribir "Elija una opción:"
        Leer opcion
		
		Si opcion = 5 Entonces
            Escribir "Ingrese el número:"
            Leer num1
        Sino
            Si opcion >= 1 Y opcion <= 6 Entonces
                Escribir "Ingrese el primer número:"
                Leer num1
                Escribir "Ingrese el segundo número:"
                Leer num2
            FinSi
        FinSi
        
        Segun opcion Hacer
            1:
                resultado <- num1 + num2
                Escribir "El resultado de la suma es: ", resultado
            2:
                resultado <- num1 - num2
                Escribir "El resultado de la resta es: ", resultado
            3:
                resultado <- num1 * num2
                Escribir "El resultado de la multiplicación es: ", resultado
            4:
                Si num2 = 0 Entonces
                    Escribir "Error matemático: No se puede dividir entre cero."
                Sino
                    resultado <- num1 / num2
                    Escribir "El resultado de la división es: ", resultado
                FinSi
            5:
                Si num1 < 0 Entonces
                    Escribir "Error matemático: El número para la raíz cuadrada debe ser positivo."
                Sino
                    resultado <- RC(num1) // RC es la función nativa para Raíz Cuadrada
                    Escribir "El resultado de la raíz cuadrada es: ", resultado
                FinSi
            6:
                resultado <- num1 ^ num2
                Escribir "El resultado de la potencia es: ", resultado
            De Otro Modo:
                Escribir "Opción inválida. Intente de nuevo."
        FinSegun
        
        Escribir ""
        Escribir "¿Desea realizar otra operación?"
        Escribir "Ingrese 1 para Sí, o cualquier otro número para Salir:"
        Leer continuar
		Limpiar Pantalla
        
    FinMientras
    
    Escribir "Programa finalizado."
FinAlgoritmo