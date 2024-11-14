package com.persistence2.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;

@Entity
@Table(name = "PAQUETES")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class,
property="@paquetesId", scope = Paquetes.class)
public class Paquetes implements Serializable {

	/**
	   * 
	   */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pq_id")
	@SequenceGenerator(name = "pq_id", sequenceName = "PAQUETES_SEQ", allocationSize = 1)

	@Column(name = "ID_PAQUETE", columnDefinition = "NUMBER")
	private int id_paquete;

	@Column(name = "ID_PRODUCTO_FK", columnDefinition = "NUMBER")
	private String id_producto_fk;

	@Column(name = "ID_SUCURSAL_FK", columnDefinition = "NUMBER")
	private String id_suscursal_fk;

	@Column(name = "FECHA_ALTA", columnDefinition = "DATE")
	private double fecha_alta;

	@Column(name = "FECHA_RECEPCION", columnDefinition = "DATE")
	private int fecha_recepcion;

	public int getId_Paquete() {
		return id_paquete;
	}

	public void setId_Paquete(int id_paquete) {
		this.id_paquete = id_paquete;
	}

	public int getId_Producto_Fk() {
		return id_producto_fk;
	}

	public void setId_Producto_Fk(int id_producto_fk) {
		this.id_producto_fk = id_producto_fk;
	}

	public int getId_Sucursal_Fk() {
		return id_suscursal_fk;
	}

	public void setId_Sucursal_Fk(int id_suscursal_fk) {
		this.id_suscursal_fk = id_suscursal_fk;
	}

	public LocalDateTime getFecha_Alta() {
		return fecha_alta;
	}

	public void setFecha_Alta(LocalDateTime fecha_alta) {
		this.fecha_alta = fecha_alta;
	}

	public LocalDateTime getFecha_Recepcion() {
		return fecha_recepcion;
	}

	public void setFecha_Recepcion(LocalDateTime fecha_recepcion) {
		this.fecha_recepcion = fecha_recepcion;
	}

}
