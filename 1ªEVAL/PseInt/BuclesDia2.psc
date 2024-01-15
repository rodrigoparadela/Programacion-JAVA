Algoritmo BuclesDia2
	
	//PARA, se ejecuta un determinado número de veces
	
	Para contador<-0 Hasta 4 con paso	1 Hacer
		Escribir "Dentro del bucle, contador vale: ", contador
	FinPara
	
	//Mientras, se ejecutarán las instrucciones si se cumple la condición 
	Definir num1 Como entero
	num1<-20
	
	Mientras num1<>0 Hacer
		Escribir "El número es distinto de cero"
		num1<-num1-10
	FinMientras
	
	
	//Repetir hasta, por lo menos se entra al bucle una vez, y volvemos a entrar si la condición 
	//se cumple
	Definir num2 Como Entero
	num2<-20
	Repetir
		Escribir "El número es mayor que cero"
		num2<- num2-10
	Hasta Que num2>0
	
FinAlgoritmo
