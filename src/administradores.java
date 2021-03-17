
public class administradores extends Usuarios{

	private int mensajes;
	private int npostdel;
	private int ban;
	
	public administradores(int mensajescont, String correo, String nick, int mensajes, int npostdel, int ban) {
		super(mensajescont, correo, nick);
		this.mensajes=mensajes;
		this.npostdel=npostdel;
		this.ban=ban;
	}
	
	public void CambiarNombre(String nombre) {
		this.setnick(nombre);
		System.out.println("Nombre cambiado a: "+nombre);
	}
	
	public void del() {
		this.npostdel=this.npostdel+1;
		System.out.println("Se tiro otro mensaje a la papelera");
	}
	
	public void banadd() {
		this.ban=this.ban+1;
		System.out.println("Se baneo a otro usuario");
	}
}
