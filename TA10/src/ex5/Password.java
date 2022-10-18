package ex5;

import java.util.Random;

public class Password {

	private int longitud;
	private String contraseña;
	
	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseña = "";
	}
	
	//recibo la longitud de la contraseña por parámetros y genero y devuelvo una contraseña aleatoria
	public String generarPassword() {
		//defino los carácteres que podrá tener la contraseña
		final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789~`!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?";
		String pwd = "";
		Random rand = new Random();
		//hago un bucle que iterará el número de veces equivalente a la longitud de la contraseña y seleccionará un carácter de una posición aleatoria
		//de la cadena de carácteres disponibles y lo concatenará a un string, el resultado de esto es la contraseña aleatoria
		for(int i = 0;i<this.longitud;i++) {
			int x = rand.nextInt(chars.length());
			pwd = pwd+chars.charAt(x);
		}
		this.contraseña = pwd;
		return pwd;
	}
	
	//comprueba si la contraseña es fuerte
	public boolean esFuerte() {
		String pwd = this.getContraseña();
		int mayusculas = 0;
		int minusculas = 0;
		int numeros = 0;
		//recorre todos los carácteres de la cadena y comprueba si es mayúscula, minúscula o número y suma 1 al contador correspondiente
		for(int i = 0; i<pwd.length(); i++) {
			char caracter = pwd.charAt(i);
			if(Character.isUpperCase(caracter)) {
				mayusculas++;
			}else if (Character.isLowerCase(caracter)) {
				minusculas++;
			}else {
				numeros++;
			}
		}
		if(mayusculas > 2 && minusculas >1 && numeros >5) {
			return true;
		}else {
			return false;
		}
		
	}
	
	//GETTERS Y SETTERS
	public String getContraseña() {
		return contraseña;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contraseña=" + contraseña + "]";
	}
	
	
	
	
}
