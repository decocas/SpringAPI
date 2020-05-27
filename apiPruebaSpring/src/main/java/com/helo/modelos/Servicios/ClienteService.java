package com.helo.modelos.Servicios;

import java.util.List;
 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import com.helo.modelos.Cliente;
import com.helo.modelos.DAO.IClienteDAO;
@Service
public class ClienteService implements IClienteService{
		
	@Autowired // esto es injection de dependecias
	private IClienteDAO cliente;
	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return (List<Cliente>)cliente.findAll();
	}
	@Override
	@Transactional(readOnly = true)
	public Cliente show(@PathVariable long id) {
		return this.cliente.findById(id).orElse(null);
		// TODO Auto-generated method stub
		
	}
	@Override
	@Transactional
	public void delete(long id) {
		// TODO Auto-generated method stub
		this.cliente.deleteById(id);
	}
	@Override
	@Transactional
	public Cliente save(Cliente c) {
		// TODO Auto-generated method stub
		
		return this.cliente.save(c);
	}
	@Override
	@Transactional(readOnly = true)
	public Cliente name(String s) {
		// TODO Auto-generated method stub
		List<Cliente> lista=(List<Cliente>)this.cliente.findAll();
		
		 for (int i = 0; i < lista.size(); i++) {
			 if(lista.get(i).getNombre().equalsIgnoreCase(s)) {
				 return this.cliente.findById(lista.get(i).getId()).orElse(null);
			 }
		}
		return null;
		 
	}
	 
	 
	
	

}
