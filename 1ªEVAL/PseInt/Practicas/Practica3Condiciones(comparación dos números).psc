Algoritmo Pr�ctica31
	
	//Se pide por pantalla dos n�meros, la aplicaci�n debe mostrar un 
	//mensaje con un mensaje del tipo:
	//"El numero: ... es mayor que el n�mero ..."
	//"El numero: ... es menor que el numero ..."
	
	//Definimos las variables necesarias
	Definir num1, num2 Como Entero
	
	//Pedimos al usuario los dos n�meros
	Escribir "Dime el primer n�mero"
	Leer num1
	Escribir "Dime el segundo n�mero"
	Leer num2
	
	//Comparamos los n�meros mediante una condici�n
	Si num1>num2 Entonces
		Escribir "El n�mero: ", num1 ," es mayor que el n�mero: ", num2
		Escribir "El n�mero: ", num2, " es menor que el n�mero: ", num1
	SiNo
		Si num2> num1 Entonces
			Escribir "El n�mero: ", num2, " es mayor que el n�mero: ", num1
			Escribir "El n�mero: ", num1, " es menor que el n�mero: ", num2
		SiNo
			Escribir "Los dos n�meros son iguales"
			
		FinSi
		
	FinSi
FinAlgoritmo
