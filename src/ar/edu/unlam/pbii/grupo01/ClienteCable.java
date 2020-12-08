package ar.edu.unlam.pbii.grupo01;

public class ClienteCable extends Cliente{

	private String codigoDecodificador;

	public ClienteCable(Integer in, String nombre, String codigoDecodificador) {
		super(in, nombre);
		this.setCodigoDecodificador(codigoDecodificador);
	}

	public String getCodigoDecodificador() {
		return codigoDecodificador;
	}

	public void setCodigoDecodificador(String codigoDecodificador) {
		this.codigoDecodificador = codigoDecodificador;
	}

}
