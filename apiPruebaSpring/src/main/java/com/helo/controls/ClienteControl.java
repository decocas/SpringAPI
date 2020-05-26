package com.helo.controls;

import java.util.List;
 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.helo.modelos.Cliente;
import com.helo.modelos.Servicios.IClienteService;

//@CrossOrigin para comartir recursos en otra dirección
@RestController
@RequestMapping("/API")
public class ClienteControl {
	@Autowired
	private IClienteService cliente;
	
	@GetMapping("/clientes")
	public List<Cliente> index(){
		return this.cliente.findAll();
		
	}
	
	 
	
}
