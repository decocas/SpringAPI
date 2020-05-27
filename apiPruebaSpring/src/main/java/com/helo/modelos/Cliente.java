package com.helo.modelos;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table (name="clients")
public class Cliente  implements Serializable  {

	/**
	 * 
	 */

	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;//el id debe ser siempre un dato primitivo
	@Column(name="nombre") //@column (name) 
	private String nombre;
	@Column(name="edad")
	private int edad;
	
	@Column(name="fecha")	
	@Temporal(TemporalType.DATE)
	private Date fecha;
	
	private static final long serialVersionUID = 1L;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
}
