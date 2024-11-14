package com.persistence2.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;

@Entity
@Table(name = "PERFILES")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class,
property="@perfilesId", scope = Perfiles.class)
public class Perfiles implements Serializable {

	/**
	   * 
	   */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pf_id")
	@SequenceGenerator(name = "pf_id", sequenceName = "PERFILES_SEQ", allocationSize = 1)

	@Column(name = "ID_PERFIL", columnDefinition = "NUMBER")
	private int id_perfil;

	@Column(name = "ID_EMPLEADO_FK", columnDefinition = "NUMBER")
	private int id_empleado_fk;

	@Column(name = "DESCRIPCION", columnDefinition = "INT") // CONFIRMR TIPO DE DATO DE COLUMNDEF
	private String descripcion;

	public int getId_Perfil() {
		return id_perfil;
	}

	public void setId_Perfil(int id_perfil) {
		this.id_perfil = id_perfil;
	}

	public int getId_Empleado_Fk() {
		return id_empleado_fk;
	}

	public void setId_Empleado_fk(int id_empleado_fk) {
		this.id_empleado_fk = id_empleado_fk;
	}

	public int getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(int descripcion) {
		this.descripcion= descripcion;
	}
	
}
