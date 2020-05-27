package com.helo.controls;


import java.util.Date;
import java.util.List;
 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.helo.modelos.Cliente;
import com.helo.modelos.Servicios.IClienteService;

//@CrossOrigin para compartir recursos en otra dirección
@RestController
@RequestMapping("/API")
public class ClienteControl {
	@Autowired
	private IClienteService cliente;
	
	@GetMapping("/clientes")
	@ResponseStatus(HttpStatus.FOUND)
	public List<Cliente> index(){
		return this.cliente.findAll();
		
	}
	
	@GetMapping("/clientes/{id}")	
	public Cliente find(@PathVariable long id) {
		return this.cliente.show(id);
	}
	
	@GetMapping("/cliente/{id}")
	public Cliente findNme(@PathVariable String id) {
		return this.cliente.name(id.toString());
	}
	
	@PostMapping("/clientes")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente store(@RequestBody Cliente c) {
	c.setFecha(new Date());
		
		return this.cliente.save(c);
	}
	
	@DeleteMapping("/clientes/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void destroy(@PathVariable long id) {
		this.cliente.delete(id);
	}
	
	
	@PutMapping("/clientes/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente update(@RequestBody Cliente c, @PathVariable long id) {
		Cliente n=this.cliente.show(id);
		n.setEdad(c.getEdad());
		n.setNombre(c.getNombre());
		return this.cliente.save(n);
	}
	
	
	
	
	 
	
}
