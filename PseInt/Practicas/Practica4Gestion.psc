Algoritmo Practica4
	
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
	
	
	//Declaramos las variables 
	Definir res1 Como Caracter //primera pregunta si/no
	Definir subtotal Como Real // subtotal 
	Definir res2 Como Caracter //segunda pregunta iva/descuento
	Definir iva, descuento Como Real
	Definir res3 Como Caracter//tercera respuesta si/no
	Definir precio Como Real 
	
	//Primera pregunta
	
	Escribir "�Deseas continuar?"
	leer res1 
	
	si res1="si" Entonces
		Escribir "Teclea el precio unitario del art�culo"
		leer subtotal
		Escribir "El subtotal son ", subtotal " euros."
	SiNo
		Escribir "La aplicaci�n ha finalizado."
	FinSi
	descuento = subtotal *0.1
	iva = subtotal *0.21
	//Segunda pregunta
	Escribir "Qu� deseas calcular: IVA, descuento?"
	leer res2
	si res2 = "iva" Entonces
		Escribir "El valor del IVA es: ", iva
	SiNo
		si res2 = "descuento" Entonces
			
			Escribir "El descuento del 10% es igual a: ", descuento
		sino 
			Escribir "La aplicaci�n a finalizado."
		FinSi
		
	FinSi
	
	//Tercera pregunta
	precio = subtotal - descuento + iva	
	Escribir "�Quieres ver el precio total?"
	leer res3
	si res3 = "si" Entonces
		Escribir "El precio total es: ", precio
	sino 
		Escribir "La aplicaci�n ha finalizado."
	FinSi
	
	
FinAlgoritmo
