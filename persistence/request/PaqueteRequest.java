package com.persistence2.request;

import java.time.LocalDateTime;

public class PaqueteRequest {
  


private int id_paquete;

private int id_producto_fk;

private int id_suscursal_fk;

private LocalDateTime fecha_alta;

private LocalDateTime fecha_recepcion;


public PaqueteRequest() {
  
}




public PaqueteRequest(int id_paquete, int id_producto_fk, int id_suscursal_fk, LocalDateTime fecha_alta, LocalDateTime fecha_recepcion) {

  this.id_paquete = id_paquete;
  this.id_producto_fk = id_producto_fk;
  this.id_suscursal_fk = id_suscursal_fk;
  this.fecha_alta = fecha_alta;
  this.fecha_recepcion = fecha_recepcion;
}

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
