package ex3;

import java.util.Random;

import ex3.FuncionesAux;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int num = rand.nextInt(999);
		FuncionesAux aux = new FuncionesAux();
		aux.customException(num);
	}

}
