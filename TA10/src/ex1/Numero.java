package ex1;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane; 

public class Numero {
	//declaro los atributos
	private int valor;
	private Random rand = new Random(); 

	//declaro el constructor
	public Numero() {
		this.valor = rand.nextInt(500) +1;
	}

	//getter valor
	public int getValor() {
		return valor;
	}
	
	//pide al usuario inputs numéricos para que adivine el número, si introduce algo que no es un entero lo indicará
	public void adivinarNumero() {
		boolean adivinado = false;
		int num = 0;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				System.out.println("Intenta a divinar el número "+this.valor);
				num = sc.nextInt();
				if(num > this.valor) {
					System.out.println("Prueba con un número más pequeño");
				}else if (num < this.valor) {
					System.out.println("Prueba con un número más grande");
				}else {
					System.out.println("Has acertado!, el número era "+this.valor);
					adivinado = true;
				}
			}catch(InputMismatchException e) {//capturo la excepción si el usuario introduce algo que no sea un entero
				sc.nextLine();
                System.out.println("Debes introducir un entero.");
            }
		}while(!adivinado);
	}

	
	
	
	
}
