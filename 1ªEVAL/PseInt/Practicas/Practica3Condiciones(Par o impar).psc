Algoritmo Practica32
	
	//Se pide un número por pantalla, comprobar si el número es par o
	//impar. En el caso de que sea par se muestra el mensaje: "El número es
	//par", en el caso de que sea impar aparace el mensaje "El número es
	//impar".
	
	//Definimos las variables necesarias y les damos un valor pedido al usuario
	Definir num1 como entero
	Escribir "Dime un número para ver si es par o impar"
	Leer num1
	//comprobamos si es par o impar
	si	num1%2=0 Entonces
		Escribir "El número es par"
	SiNo
		Escribir "El número es impar"
	FinSi
	
FinAlgoritmo
