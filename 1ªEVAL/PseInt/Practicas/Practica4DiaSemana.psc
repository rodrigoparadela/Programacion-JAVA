Algoritmo Practica4DiaSemana
	
	//Diseña un programa que pregunta al usuario:
	//¿Quieres imprimir el día de la semana?,
	// Si teclea s, se pide al usuario el día de la semana (1-7) y escribe el nombre de ese día
	//Si teclea n, aparece un mensaje de que se acaba el juego.
	
	//definimos las variables
	Definir respuesta Como Caracter
	Definir dia como entero
	
	//se emplea una condición para empezar el juego
	Escribir "¿Quieres imprimir el día de la semana?"
	leer respuesta
	
	si respuesta = "s" Entonces
		Escribir "dime un día de la semana"
		leer dia
		Segun dia Hacer
			1:
				Escribir "Ese día es LUNES"
			2:
				Escribir "Ese día es MARTES"
			3:
				Escribir "Ese día es MIÉRCOLES"
			4:
				Escribir "Ese día es JUEVES"
			5:
				Escribir "Ese día es VIERNES"
			6: 
				Escribir "Ese día es SÁBADO"
			7:
				Escribir "Ese día es DOMINGO"
			De Otro Modo:
				Escribir "No hay un día para eso :("
		FinSegun
	SiNo
		Escribir "El juego ha acabado"
			
		FinSi
	
FinAlgoritmo
