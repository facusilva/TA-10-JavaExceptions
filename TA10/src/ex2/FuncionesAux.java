package ex2;

import java.util.Scanner;

import excepciones.Ex2;

public class FuncionesAux {

	//esta función recoge el mensaje definido por el usuario y lanza una excepción pasándole al constructor de la misma dicho mensaje 
	//y mostrándolo por pantalla
	public void customException(String texto) {
		try {
			//lanzo la excepción
			throw new Ex2(texto);
		}catch(Ex2 ex) {//capturo la excepción
			System.out.println("Mensaje mostrado por pantalla");
			//la muestro por pantalla con el método getMessage()
			System.out.println(ex.getMessage());
			System.out.println("Fin del programa");
		}
	}
}
