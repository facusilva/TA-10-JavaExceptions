package ex4;

import java.util.InputMismatchException;
import java.lang.Math;
import java.util.Scanner;

import excepciones.Ex3;

public class FuncionesAux {

	private Scanner sc = new Scanner(System.in);
	//esta función recoge el número aleatorio generado y lo pasa a la excepción para que determine si es par o impar y lo muestre por pantalla
	public void suma() {
		try {
			//capturo los datos del usuario e intento realizar el cálculo
			System.out.println("----SUMA");
			System.out.println("Introduzca un entero");
			int a = sc.nextInt();
			System.out.println("Introduzca otro entero");
			int b = sc.nextInt();
			int resultado = a + b;
			System.out.println("El resultado de la suma entre "+a+" y "+b+" és: "+resultado);
		}catch(InputMismatchException e) {//capturo la excepción
			sc.nextLine();
            System.out.println("Debes introducir un entero.");
		}
	}
	
	public void resta() {
		try {
			//capturo los datos del usuario e intento realizar el cálculo
			System.out.println("----RESTA");
			System.out.println("Introduzca un entero");
			int a = sc.nextInt();
			System.out.println("Introduzca otro entero");
			int b = sc.nextInt();
			int resultado = a - b;
			System.out.println("El resultado de la resta "+a+" - "+b+" és: "+resultado);
		}catch(InputMismatchException e) {//capturo la excepción
			sc.nextLine();
            System.out.println("Debes introducir un entero.");
		}
	}
	
	
	public void multiplicacion() {
		try {
			//capturo los datos del usuario e intento realizar el cálculo
			System.out.println("----MULTIPLICACIÓN");
			System.out.println("Introduzca un entero");
			int a = sc.nextInt();
			System.out.println("Introduzca otro entero");
			int b = sc.nextInt();
			int resultado = a * b;
			System.out.println("El resultado de la multiplicación entre "+a+" y "+b+" és: "+resultado);
		}catch(InputMismatchException e) {//capturo la excepción
			sc.nextLine();
            System.out.println("Debes introducir un entero.");
		}
	}
	
	public void division() {
		try {
			//capturo los datos del usuario e intento realizar el cálculo
			System.out.println("----DIVISIÓN");
			System.out.println("Introduzca un entero");
			int a = sc.nextInt();
			System.out.println("Introduzca otro entero");
			int b = sc.nextInt();
			int resultado = a / b;
			System.out.println("El resultado de la división "+a+" / "+b+" és: "+resultado);
		}catch(InputMismatchException e) {//capturo la excepción
			sc.nextLine();
            System.out.println("Debes introducir un entero.");
		}catch(ArithmeticException e) {
			sc.nextLine();
			System.out.println("No se puede dividir entre 0");
		}
	}
	
	public void potencia() {
		try {
			//capturo los datos del usuario e intento realizar el cálculo
			System.out.println("----POTENCIA");
			System.out.println("Introduzca un entero");
			double a = sc.nextInt();
			System.out.println("Introduzca otro entero");
			double b = sc.nextInt();
			double resultado = Math.pow(a, b);
			System.out.println("El resultado de la potencia "+a+" a la "+b+" és: "+resultado);
		}catch(InputMismatchException e) {//capturo la excepción
			sc.nextLine();
            System.out.println("Debes introducir un entero.");
		}
	}

	public void raizCuadrada() {
		try {
			//capturo los datos del usuario e intento calcular la raíz cuadrada
			System.out.println("----POTENCIA");
			System.out.println("Introduzca un entero");
			double a = sc.nextInt();
			double resultado = Math.sqrt(a);
			System.out.println("La raíz cuadrada de "+a+" és: "+resultado);
		}catch(InputMismatchException e) {//capturo la excepción
			sc.nextLine();
            System.out.println("Debes introducir un entero.");
		}
	}
	
	public void raizCubica() {
		try {
			//capturo los datos del usuario e intento calcular la raíz cuadrada
			System.out.println("----POTENCIA");
			System.out.println("Introduzca un entero");
			double a = sc.nextInt();
			double resultado =  Math.pow (a,1.0/3.0);;
			System.out.println("La raíz cúbica de "+a+" és: "+resultado);
		}catch(InputMismatchException e) {//capturo la excepción
			sc.nextLine();
            System.out.println("Debes introducir un entero.");
		}
	}
	
	
	
	
}
