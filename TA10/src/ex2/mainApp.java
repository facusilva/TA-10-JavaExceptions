package ex2;
import java.util.Scanner;

import excepciones.Ex2;

public class mainApp {

	public static void main(String[] args) {
		//Instancio los objetos necesarios
		FuncionesAux aux = new FuncionesAux();
		Scanner sc = new Scanner(System.in);
		//pido al usuario que introduzca el mensaje y se lo paso a la función auxiliar
		System.out.println("Introduce un mensaje para que sea mostrado en la excepción");
		String mensaje = sc.nextLine();
		aux.customException(mensaje);
		
	}

}
