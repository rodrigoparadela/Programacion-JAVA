Algoritmo TarifasTelefónicas
	//Se desea calcular el coste de una llamada telefónica. La tarifa es 
	//por minutos, cada minuto tiene un coste de 0.34. El usuario teclea
	//los minutos y automáticamente se muestra el importe
	
	//definimos las variables necesarias
	Definir minutos Como Entero
	Definir importe Como Real
	
	//pedimos los minutos y los añadimos a su variable correspondiente
	Escribir "Dime los minutos que ha durado la llamada"
	Leer minutos
	
	//calculamos el importe y lo mostramos por pantalla
	importe<-minutos*0.34
	Escribir "El importe total de la llamada es: ", importe
	
FinAlgoritmo
