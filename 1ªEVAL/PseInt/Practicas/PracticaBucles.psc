Algoritmo PracticaBucles
	
	//1.Dise�a un algoritmo, que imprime los n�meros del 1 al 100, con un intervalo de 10 en 10.
	//Se debe realizar con un bucle for
	
	Definir num1 Como Entero
	Escribir 1
	Para num1<-10 hasta 100 con paso 10 Hacer
		Escribir num1
	FinPara
	
	//2.Dise�ar un algoritmo, que pide constantemente n�meros por pantalla, mientras que sea
	//mayor que cero, para mostrar el doble de su valor.(mientras)
		
	Definir num2 Como Entero
	num2<-1
	Mientras num2 > 0 Hacer
		Escribir "Dime un n�mero"
		Leer num2
		Escribir "El doble de su valor es: ", num2*2
	FinMientras
	
	//3.Dise�ar un algoritmo que pregunta cuantos n�meros se van a introducir, posteriormente
	//se piden esos n�meros. Debe de aparecer cuantos n�meros negativos se han tecleado y 
	//cuantos positivos.
	
	Definir num3, num4, pos, neg Como Entero
	Escribir "�Cuantos n�meros vas a introducir?"
	leer num3
	pos = 0
	neg = 0
	mientras num3>0 Hacer
		Escribir "Dime un n�mero"
		leer num4
		
		si pos>=0 Entonces
			pos = pos+1
			Escribir "Has escrito ", pos "n�meros mayores o iguales a 0"
		SiNo
			neg = neg+1
			Escribir "Has escrito ", neg "n�meros menores o iguales a 0"
 		FinSi
		num3<-num3-1
	FinMientras
	
	
FinAlgoritmo
