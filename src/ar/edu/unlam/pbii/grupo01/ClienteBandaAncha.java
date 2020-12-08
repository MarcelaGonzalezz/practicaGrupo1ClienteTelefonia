package ar.edu.unlam.pbii.grupo01;

public class ClienteBandaAncha extends Cliente{

	private String email;

	public ClienteBandaAncha(Integer in, String nombre, String email) {
		super(in, nombre);
		this.setEmail(email);
	}

	public String getEMail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
