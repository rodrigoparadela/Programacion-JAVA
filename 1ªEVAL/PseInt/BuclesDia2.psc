Algoritmo BuclesDia2
	
	//PARA, se ejecuta un determinado n�mero de veces
	
	Para contador<-0 Hasta 4 con paso	1 Hacer
		Escribir "Dentro del bucle, contador vale: ", contador
	FinPara
	
	//Mientras, se ejecutar�n las instrucciones si se cumple la condici�n 
	Definir num1 Como entero
	num1<-20
	
	Mientras num1<>0 Hacer
		Escribir "El n�mero es distinto de cero"
		num1<-num1-10
	FinMientras
	
	
	//Repetir hasta, por lo menos se entra al bucle una vez, y volvemos a entrar si la condici�n 
	//se cumple
	Definir num2 Como Entero
	num2<-20
	Repetir
		Escribir "El n�mero es mayor que cero"
		num2<- num2-10
	Hasta Que num2>0
	
FinAlgoritmo
