package excepciones;

public class Ex2 extends Exception{
	//recoge el mensaje que mostrará la excepción
	private String mensaje;
	//declaro el constructor
	public Ex2(String texto) {
		this.mensaje = texto;
	}
	@Override
	public String getMessage() {
		return "Excepción capturada con mensaje: "+this.mensaje;
	}
	
		
	
}
