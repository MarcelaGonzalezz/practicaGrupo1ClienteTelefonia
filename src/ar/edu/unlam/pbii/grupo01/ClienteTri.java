package ar.edu.unlam.pbii.grupo01;

public class ClienteTri extends Cliente{

	private String codigoDeArea;
	private String CodigoDecodificador;
	private String email;
	private String telefono;
	
	public ClienteTri(Integer in, String nombre, String codigoDeArea, String telefono, String CodigoDecodificador, String email) {
		super(in, nombre);
		// TODO Auto-generated constructor stub
		this.setCodigoDeArea(codigoDeArea);
		this.setTelefono(telefono);
		this.setCodigoDecodificador(CodigoDecodificador);
		this.setEmail(email);
	}

	public String getCodigoDeArea() {
		return codigoDeArea;
	}

	public void setCodigoDeArea(String codigoDeArea) {
		this.codigoDeArea = codigoDeArea;
	}

	public String getCodigoDecodificador() {
		return CodigoDecodificador;
	}

	public void setCodigoDecodificador(String codigoDecodificador) {
		CodigoDecodificador = codigoDecodificador;
	}

	public String getEMail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}
