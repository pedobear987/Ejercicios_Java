
public class Usuarios {

	private int mensajescont;
	private String correo;
	private String nick;
	
	public Usuarios(int mensajescont, String correo, String nick) {
		this.mensajescont=mensajescont;
		this.correo=correo;
		this.nick=nick;
	}
	
	public void setnick(String nick) {
		
		this.nick=nick;
	}
	public void Incr1() {
		this.mensajescont=this.mensajescont+1;
		System.out.println("Se incremento una vez los mensajes");
	}
	
	public void Decre1() {
		this.mensajescont=this.mensajescont-1;
		System.out.println("Se decremento una vez los mensajes");
	}
	
	public void CambiaCorreo(String correo) {
		this.correo=correo;
		System.out.print("Correo cambiado");
	}
}
