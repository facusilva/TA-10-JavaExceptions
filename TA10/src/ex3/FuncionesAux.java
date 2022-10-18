package ex3;

import java.util.Scanner;

import excepciones.Ex3;

public class FuncionesAux {

	//esta función recoge el número aleatorio generado y lo pasa a la excepción para que determine si es par o impar y lo muestre por pantalla
	public void customException(int num) {
		try {
			//lanzo la excepción
			throw new Ex3(num);
		}catch(Ex3 ex) {//capturo la excepción
			System.out.println("Generando número aleatorio...");
			System.out.println("El número aleatorio generado és: "+num);
			//la muestro por pantalla con el método getMessage()
			System.out.println(ex.getMessage());
		}
	}
}
