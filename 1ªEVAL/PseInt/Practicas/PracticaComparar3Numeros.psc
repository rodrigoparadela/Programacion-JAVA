Algoritmo Comparaci�n3N�meros
	
	
	//Dise�ar un algoritmo que pide por pantalla 3 n�meros, que no sean negativos, tampoco iguales. Se debe mostrar cu�l de los tres es el mayor y cu�l el menor.
	
	//variables
	
	Definir num1, num2, num3 como entero
	
	Escribir "Dime el primer n�mero."
	leer num1
	Escribir "Dime el segundo n�mero, distinto del primero."
	leer num2
	Escribir "Dime el tercer n�mero, distinto de los dos anteriores."
	leer num3
	
	si num1 <> num2 y num1 <> num3 y num2 <> num3 y num1 >=0 y num2 >= 0 y num3 >= 0 Entonces
		si num1 > num2 y num1 > num3 Entonces
			Escribir "El n�mero mayor es ", num1 
			si num2 > num3 Entonces
				Escribir " y el n�mero menor es ", num3
			sino 
				Escribir " y el n�mero menor es ", num2
			FinSi
		sino 
			si num2 > num3 Entonces
				Escribir "El n�mero mayor es ", num2
				si num1>num3 Entonces
					Escribir " y el n�mero menor es ", num3 
				sino 
					Escribir " y el n�mero menor es ", num1
				FinSi
			sino 
				Escribir "El n�mero mayor es ", num3
				si num1>num2 Entonces
					Escribir " y el n�mero menor es ", num2
				sino 
					Escribir " y el n�mero menor es ", num1 
				FinSi
			FinSi
		FinSi
	sino 
		Escribir "N�meros no v�lidos."
	
	FinSi
	
FinAlgoritmo
