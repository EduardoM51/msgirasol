package com.persistence2.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;

@Entity
@Table(name = "PEDIDOS_PROVEEDOR")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class,
property="@pedidos_proveedorId", scope = PEDIDOS_PROVEEDOR.class)
public class PEDIDOS_PROVEEDOR implements Serializable {

	/**
	   * 
	   */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prv_id")
	@SequenceGenerator(name = "prv_id", sequenceName = "PEDIDOS_PROVEEDOR_SEQ", allocationSize = 1)

	@Column(name = "ID_PEDIDO", columnDefinition = "NUMBER")
	private int id_pedido;

	@Column(name = "ID_PROVEEDOR_FK", columnDefinition = "NUMBER")
	private String id_proveedor_fk;

	@Column(name = "STATUS_PEDIDO", columnDefinition = "NUMBER")
	private String status_pedido;

	@Column(name = "FECHA_ALTA", columnDefinition = "DATE")
	private double fecha_alta;

	@Column(name = "FECHA_RECEPCION", columnDefinition = "DATE")
	private int fecha_recepcion;

	public int getId_Pedido() {
		return id_pedido;
	}

	public void setId_Pedido(int id_pedido) {
		this.id_pedido = id_pedido;
	}

	public int getId_Proveedor_Fk() {
		return id_proveedor_fk;
	}

	public void setId_Proveedor_Fk(int id_proveedor_fk) {
		this.id_proveedor_fk = id_proveedor_fk;
	}

	public int getStatus_Pedido() {
		return status_pedido;
	}

	public void setStatus_Pedido(int status_pedido) {
		this.status_pedido = status_pedido;
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
