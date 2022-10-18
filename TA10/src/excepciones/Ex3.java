package excepciones;

public class Ex3 extends Exception{

	private int valor;
	
	public Ex3(int num) {
		this.valor = num;
	}
	
	@Override
	public String getMessage() {
		if(this.valor%2==0) {
			return "Es par";
		}else {
			return "Es impar";
		}
		
	}
}
