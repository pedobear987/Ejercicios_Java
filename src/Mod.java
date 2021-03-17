
public class Mod extends Usuarios {

	private int mensajespapelera;
	
	public Mod(int mensajescont, String correo, String nick, int mensajespapelera) {
		super(mensajescont, correo, nick);
		this.mensajespapelera=mensajespapelera;
	}

	public void del() {
		this.mensajespapelera=this.mensajespapelera+1;
		System.out.println("Se tiro otro mensaje a la papelera");
	}	
}
