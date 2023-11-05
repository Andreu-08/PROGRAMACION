Algoritmo JuegoFuerza
	
	Escribir "Introduce la fuerza del personaje y del enemigo"
	Leer fuerzaP, fuerzaE
	Si (fuerzaE >= 10) Entonces
		fuerzaP <- fuerzaP -6
	SiNo
		fuerzaP <- fuerzaP -2
	Fin Si
	Escribir "Te queda", fuerzaP, "vida"
	
FinAlgoritmo
