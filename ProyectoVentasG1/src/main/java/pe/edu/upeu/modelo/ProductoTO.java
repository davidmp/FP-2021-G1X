package pe.edu.upeu.modelo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class ProductoTO {
  //idProducto	nombre	preUnitario	porceUtil	unidadMed	idCateg	stock
  public  String idProducto, nombre, unidadMed, idCateg;
  public  double preUnitario, porcentUtil, stock;
  
}
