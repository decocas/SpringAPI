package com.helo.modelos.DAO;

import org.springframework.data.repository.CrudRepository;

import com.helo.modelos.Cliente;

public interface IClienteDAO  extends CrudRepository <Cliente, Long>{

}
