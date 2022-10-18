package ex5;

import java.util.Random;

import ex5.FuncionesAux;

public class mainApp {

	public static void main(String[] args) {
		//instancio los objetos necesarios
		FuncionesAux aux = new FuncionesAux();
		int tamaño_array = aux.setTamañoArray();
		//lamo a la función generarContraseñas con el número de contraseñas que quiero que me genere, me las irá mostrando por pantalla
		Password[] contraseñas = aux.generarContraseñas(tamaño_array);
	}

}
