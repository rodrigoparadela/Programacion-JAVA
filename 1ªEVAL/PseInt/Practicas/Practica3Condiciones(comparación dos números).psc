Algoritmo Práctica31
	
	//Se pide por pantalla dos números, la aplicación debe mostrar un 
	//mensaje con un mensaje del tipo:
	//"El numero: ... es mayor que el número ..."
	//"El numero: ... es menor que el numero ..."
	
	//Definimos las variables necesarias
	Definir num1, num2 Como Entero
	
	//Pedimos al usuario los dos números
	Escribir "Dime el primer número"
	Leer num1
	Escribir "Dime el segundo número"
	Leer num2
	
	//Comparamos los números mediante una condición
	Si num1>num2 Entonces
		Escribir "El número: ", num1 ," es mayor que el número: ", num2
		Escribir "El número: ", num2, " es menor que el número: ", num1
	SiNo
		Si num2> num1 Entonces
			Escribir "El número: ", num2, " es mayor que el número: ", num1
			Escribir "El número: ", num1, " es menor que el número: ", num2
		SiNo
			Escribir "Los dos números son iguales"
			
		FinSi
		
	FinSi
FinAlgoritmo
