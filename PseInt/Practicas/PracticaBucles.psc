Algoritmo PracticaBucles
	
	//1.Diseña un algoritmo, que imprime los números del 1 al 100, con un intervalo de 10 en 10.
	//Se debe realizar con un bucle for
	
	Definir num1 Como Entero
	Escribir 1
	Para num1<-10 hasta 100 con paso 10 Hacer
		Escribir num1
	FinPara
	
	//2.Diseñar un algoritmo, que pide constantemente números por pantalla, mientras que sea
	//mayor que cero, para mostrar el doble de su valor.(mientras)
		
	Definir num2 Como Entero
	num2<-1
	Mientras num2 > 0 Hacer
		Escribir "Dime un número"
		Leer num2
		Escribir "El doble de su valor es: ", num2*2
	FinMientras
	
	//3.Diseñar un algoritmo que pregunta cuantos números se van a introducir, posteriormente
	//se piden esos números. Debe de aparecer cuantos números negativos se han tecleado y 
	//cuantos positivos.
	
	Definir num3, num4, pos, neg Como Entero
	Escribir "¿Cuantos números vas a introducir?"
	leer num3
	pos = 0
	neg = 0
	mientras num3>0 Hacer
		Escribir "Dime un número"
		leer num4
		
		si pos>=0 Entonces
			pos = pos+1
			Escribir "Has escrito ", pos "números mayores o iguales a 0"
		SiNo
			neg = neg+1
			Escribir "Has escrito ", neg "números menores o iguales a 0"
 		FinSi
		num3<-num3-1
	FinMientras
	
	
FinAlgoritmo
