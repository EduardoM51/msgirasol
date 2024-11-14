package com.persistence2.request;

import java.time.LocalDateTime;

public class PerfilRequest {
  


private int id_perfil;

private int id_empleado_fk;

private int descripcion;  // confirmar el tipo de dato en todos los casos donde se invoque


public PerfilRequest() {
  
}


public PerfilRequest(int id_perfil, int id_empleado_fk, int descripcion) {

  this.id_perfil = id_perfil;
  this.id_empleado_fk = id_empleado_fk;
  this.descripcion = descripcion;
}

public int getId_Perfil() {
  return id_perfil;
}

public void setId_Perfil(int id_perfil) {
  this.id_perfil = id_perfil;
}

public int getId_Empleado_Fk() {
  return id_empleado_fk;
}

public void setId_Empleado_Fk(int id_empleado_fk) {
  this.id_empleado_fk = id_empleado_fk;
}

public int getDescripcion() {
  return descripcion;
}

public void setDescripcion(int descripcion) {
  this.descripcion = descripcion;
}

}
