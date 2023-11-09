Algoritmo Comparación3Números
	
	
	//Diseñar un algoritmo que pide por pantalla 3 números, que no sean negativos, tampoco iguales. Se debe mostrar cuál de los tres es el mayor y cuál el menor.
	
	//variables
	
	Definir num1, num2, num3 como entero
	
	Escribir "Dime el primer número."
	leer num1
	Escribir "Dime el segundo número, distinto del primero."
	leer num2
	Escribir "Dime el tercer número, distinto de los dos anteriores."
	leer num3
	
	si num1 <> num2 y num1 <> num3 y num2 <> num3 y num1 >=0 y num2 >= 0 y num3 >= 0 Entonces
		si num1 > num2 y num1 > num3 Entonces
			Escribir "El número mayor es ", num1 
			si num2 > num3 Entonces
				Escribir " y el número menor es ", num3
			sino 
				Escribir " y el número menor es ", num2
			FinSi
		sino 
			si num2 > num3 Entonces
				Escribir "El número mayor es ", num2
				si num1>num3 Entonces
					Escribir " y el número menor es ", num3 
				sino 
					Escribir " y el número menor es ", num1
				FinSi
			sino 
				Escribir "El número mayor es ", num3
				si num1>num2 Entonces
					Escribir " y el número menor es ", num2
				sino 
					Escribir " y el número menor es ", num1 
				FinSi
			FinSi
		FinSi
	sino 
		Escribir "Números no válidos."
	
	FinSi
	
FinAlgoritmo
