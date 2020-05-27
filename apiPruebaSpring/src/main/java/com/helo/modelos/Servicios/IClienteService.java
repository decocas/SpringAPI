package com.helo.modelos.Servicios;

import java.util.List;


import com.helo.modelos.Cliente;

public interface IClienteService {
	
	public List<Cliente> findAll();
	
	public Cliente show(long id);
	
	public void delete(long id);
	
	public Cliente save(Cliente c);
	
	public Cliente name(String s);
	
 
	
}
