package ar.edu.unlam.pbii.grupo01;

import java.util.HashSet;
import java.util.Set;

public class Empresa {

	private String nombre;
	private Set <Cliente> clientes;

	public Empresa(String nombre) {
		this.setNombre(nombre);
		this.clientes= new HashSet <Cliente>();
	}

	public Boolean habilitarPremium(Premium tipo, Cliente cliente) throws NoEsClienteConCableException{
		for (Cliente e: clientes) {
			if (e instanceof ClienteCable) {
				if (e.getId().equals(cliente.getId()))
					return true;
			}
		}
		
		throw new NoEsClienteConCableException("no es un cliente con cable");
	}
	
	public Integer getCantidadAbonados() {
		return clientes.size()-1;
	}

	public void agregarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		clientes.add(cliente);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
