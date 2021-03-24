package Eje3;

public class revistas extends libro{

	int num;
	public revistas(String titulo, int codigo, int ano_pu, int num) {
		super(titulo, codigo, ano_pu);
		this.num=num;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "revistas [num=" + num + ", titulo=" + titulo + ", codigo=" + codigo + ", ano_pu=" + ano_pu + "]";
	}
	
}
