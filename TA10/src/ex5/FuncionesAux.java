package ex5;

import java.util.InputMismatchException;
import java.io.IOException;
import java.lang.Math;
import java.util.Scanner;

import excepciones.Ex3;

public class FuncionesAux {

	private Scanner sc = new Scanner(System.in);
	
	//recibe el tamaño que tendrá el array de contraseñas, definido por el usuario por teclado
	public int setTamañoArray() {
		int num_contraseñas = 0;
		try {
			while(num_contraseñas <= 0) {
				System.out.println("Indica cuantas contraseñas quieres generar");
				num_contraseñas = sc.nextInt();
				if(num_contraseñas <= 0) {
					System.out.println("Debes introducir un número mayor que cero");
				}
			}
			
			
		}catch(InputMismatchException e) {//capturo la excepción si el usuario introduce algo que no sea un entero
			sc.nextLine();
			System.out.println("Debes introducir un entero");
			System.exit(0);
		}
		return num_contraseñas;
	}
	
	//recibe cuantas contraseñas tiene que generar y devuelve un array conformado por las constrañenas generadas
	public Password[] generarContraseñas(int size) {
		Password[] contraseñas = new Password[size];
		Boolean[] fuerza = new Boolean[size];
		System.out.println("Indica la longitud que tendrán las contraseñas generadas");
		int longitud = 0;
		try {
			longitud = sc.nextInt();
		}catch(InputMismatchException e) {//capturo la excepción
			sc.nextLine();
			System.out.println("Debes introducir un entero");
			System.exit(0);
		}catch(ArrayIndexOutOfBoundsException e) {
			sc.nextLine();
			System.out.println("Te has pasado del tamaño del array");
			System.exit(0);
		}
		
		//recorro el bucle contraseñas
		for(int i = 0; i<contraseñas.length; i++) {
			//genero una contraseña con la longitud definida por el usuario
			Password password = new Password(longitud);
			password.generarPassword();
			//asigno a la posición del array de contraseñas la contraseña generada
			contraseñas[i] = password;
			//compruebo si es fuerte y asigno el resultado a el array paralela de boolean fuerza
			fuerza[i] = password.esFuerte();
			//muestro la contraseña generada y si es fuerte o no
			System.out.print("Contraseña "+(i+1)+" : "+password.getContraseña());
			if(fuerza[i]) {
				System.out.println(" FUERTE");
			}else {
				System.out.println(" NO ES FUERTE");
			}
		}
		return contraseñas;
	}

}
