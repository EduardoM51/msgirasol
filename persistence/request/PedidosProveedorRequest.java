package com.persistence2.request;

import java.time.LocalDateTime;

public class Pedidos_ProveedorRequest {
  


private int id_pedido;

private int id_proveedor_fk;

private int status_pedido;

private LocalDateTime fecha_alta;

private LocalDateTime fecha_recepcion;


public Pedidos_ProveedorRequest() {
  
}




public Pedidos_ProveedorRequest(int id_pedido, int id_proveedor_fk, int status_pedido, LocalDateTime fecha_alta, LocalDateTime fecha_recepcion) {

  this.id_pedido        = id_pedido;
  this.id_proveedor_fk  = id_proveedor_fk;
  this.status_pedido    = status_pedido;
  this.fecha_alta      = fecha_alta;
  this.fecha_recepcion = fecha_recepcion;
}

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
