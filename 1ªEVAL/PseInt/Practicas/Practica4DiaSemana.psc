Algoritmo Practica4DiaSemana
	
	//Dise�a un programa que pregunta al usuario:
	//�Quieres imprimir el d�a de la semana?,
	// Si teclea s, se pide al usuario el d�a de la semana (1-7) y escribe el nombre de ese d�a
	//Si teclea n, aparece un mensaje de que se acaba el juego.
	
	//definimos las variables
	Definir respuesta Como Caracter
	Definir dia como entero
	
	//se emplea una condici�n para empezar el juego
	Escribir "�Quieres imprimir el d�a de la semana?"
	leer respuesta
	
	si respuesta = "s" Entonces
		Escribir "dime un d�a de la semana"
		leer dia
		Segun dia Hacer
			1:
				Escribir "Ese d�a es LUNES"
			2:
				Escribir "Ese d�a es MARTES"
			3:
				Escribir "Ese d�a es MI�RCOLES"
			4:
				Escribir "Ese d�a es JUEVES"
			5:
				Escribir "Ese d�a es VIERNES"
			6: 
				Escribir "Ese d�a es S�BADO"
			7:
				Escribir "Ese d�a es DOMINGO"
			De Otro Modo:
				Escribir "No hay un d�a para eso :("
		FinSegun
	SiNo
		Escribir "El juego ha acabado"
			
		FinSi
	
FinAlgoritmo
