package ar.edu.unlam.pbii.grupo01;

public class Cliente {

	private String nombre;
	private Integer id;

	public Cliente (Integer id, String nombre) {
		this.nombre= nombre;
		this.setId(id);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
