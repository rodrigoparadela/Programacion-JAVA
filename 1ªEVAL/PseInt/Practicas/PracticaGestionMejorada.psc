Algoritmo PracticaGestionMejorada
	
	
	//Dise�a un programa de gesti�n:
	
	//1. Aparece el mensaje:
	//Programa de gesti�n, �Deseas continuar? si/no
	//si se teclea si:
	//Se pide: "Teclea el precio unitario del art�culo"
	//"Introduce unidades"
	//Aparece directamente el subtotal: Unidades*precio
	//si se teclea no: "La aplicaci�n ha finalizado"
	
	//se pregunta �Qu� deseas calcular: iva, descuento?
	//Si se teclea iva. Se debe calcular el iva del 21% del subtotal.
	//si se teclea descuento. Se calcula el 10%de descuento del subtotal.
	//si se teclea no, muestra el mensaje "La aplicaci�n ha finalizado"
	
	//Se pregunta "�Quieres ver el precio total?"
	//si se teclea si, precio total=subtotal-descuento+iva
	//si se teclea no, "La aplicaci�n ha finalizado"
	
	//Declaramos las variables necesarias
	definir res1, res2, res3, N Como Caracter
	definir iva, descuento, precioUnitario, unidades, subtotal, precio como  real
	
	Escribir "�Deseas continuar?"
	leer res1 
	
	si res1="si" Entonces
		Escribir "Teclea el precio unitario del art�culo"
		leer precioUnitario
		Escribir "Teclea las unidades"
		leer unidades
		subtotal = precioUnitario*unidades
		Escribir "El subtotal es igual a ", subtotal
		Escribir "�Qu� deseas calcular: IVA, descuento, iva y descuento?"
		leer res2
		iva= subtotal*0.21
		descuento=subtotal*0.1
		segun res2 hacer
			'iva':
				Escribir "El IVA es igual a ", iva
				N = "si"
			'descuento':
				Escribir "El descuento es igual a ", descuento
				N = "si"
			'iva y descuento':
				Escribir "El IVA es igual a ", iva ", el descuento es igual a ", descuento
				N = "si"
			'no':
				Escribir "La aplicaci�n ha finalizado" 
				N = "no"
			De Otro Modo:
				Escribir "Ha pulsado una opci�n incorrecta."
		FinSegun
		si N = "si" Entonces
			Escribir "�Quieres ver el precio total?"
			leer res3
			si res3 = "si" Entonces
				precio = subtotal-descuento+iva
				Escribir "El precio total es igual a ", precio
				Escribir "La aplicaci�n ha finalizado"
			SiNo
				si res3 = "no" entonces 
					Escribir "La aplicaci�n ha finalizado"
				sino
					Escribir "Ha pulsado una opci�n incorrecta"
				finsi
			FinSi
		
		FinSi
		
	SiNo
		si res1 = "no" Entonces
			Escribir "La aplicaci�n ha finalizado"
		sino 
			Escribir "ha pulsado un opci�n incorrecta"
		FinSi
	FinSi
	
	
	
FinAlgoritmo
