Algoritmo ElegirColor
	
	//Pedir por pantalla, que elija un color: rojo, verde, azul
	
	//Declaramos variables
	Definir colores Como Caracter
	
	Escribir "Elije un color:rojo, verde o azul"
	Leer colores
	
	Si colores="verde" Entonces
		Escribir "Has elegido el color verde"
	SiNo
		si	colores="rojo" Entonces
			Escribir "Has elegido el color rojo"
		SiNo
			si colores="azul" Entonces
				Escribir "Has elegido el color azul"
			SiNo
				Escribir "Error"
			FinSi
		FinSi
	FinSi
	
	//utilizamos con segun (switch)
	//Pedimos por pantalla un n�mero del 1 al 10
	Definir num1 Como Entero
	Escribir "Introduce un n�mero:"
	Leer num1
	
	Segun num1 Hacer
		1:
			Escribir "Has elegido el n�mero 1, no has acertado!"
		2:
			Escribir "Has elegido el n�mero 2, no has acertado!"
		3: 
			Escribir "Has elegido el n�mero3, no has acertado!"
		4:
			Escribir "Has elegido el n�mero 4, no has acertado!"
		5:
			Escribir "Has elegido el n�mero5, no has acertado!"
		6:
			Escribir "Has elegido el n�mero 6, no has acertado!"
		7:
			Escribir "Has elegido el n�mero 7, no has acertado!"
		8: 
			Escribir "Has elegido el n�mero 8, no has acertado!"
		9: 
			Escribir "Has elegido el n�mero 9, has acertado!"
		10: 
			Escribir "Has elegido el n�mero 10, no has acertado!"
		De Otro Modo:
			Escribir "No has tecleado un dato v�lido"
	FinSegun
	
FinAlgoritmo
