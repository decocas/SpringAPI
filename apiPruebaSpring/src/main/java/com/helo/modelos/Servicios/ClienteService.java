package com.helo.modelos.Servicios;

import java.util.List;
 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
	
	
	

}
