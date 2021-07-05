package pe.edu.upeu.dao;

import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.modelo.ProductoTO;
import pe.edu.upeu.modelo.VentaDetalleTO;
import pe.edu.upeu.modelo.VentaTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.TecladoRead;
import pe.edu.upeu.util.UtilsX;

public class VentaDAO extends AppCrud{
    LeerArchivo lar;
    TecladoRead tre=new TecladoRead();
    UtilsX ut=new UtilsX();
    ProductoTO prodTO;
    VentaTO ventTO;
    VentaDetalleTO vdTO;

    public void registroVentaGeneral() {
        
    }

    public VentaTO crearVenta() {
        
        return null;
    }

    public VentaDetalleTO carritoVenta(VentaTO vTO) {
        
        return null;
    }

    
}
