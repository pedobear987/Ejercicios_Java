package Eje2;

public class direccion {

	String calle;
	String ciudad;
	String codigo_postal;
	String pais;
	
	public direccion(String calle, String ciudad, String codigo_Postal, String pais) {
		
		this.calle=calle;
		this.ciudad=ciudad;
		this.codigo_postal=codigo_Postal;
		this.pais=pais;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getCodigo_postal() {
		return codigo_postal;
	}

	public void setCodigo_postal(String codigo_postal) {
		this.codigo_postal = codigo_postal;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	
}
