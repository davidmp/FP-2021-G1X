package pe.edu.upeu.dao;

import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.modelo.CategoriaTO;
import pe.edu.upeu.modelo.ProductoTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.TecladoRead;
import pe.edu.upeu.util.UtilsX;

public class ProductoDAO extends AppCrud{
    LeerArchivo  lar;
    CategoriaTO catTO;
    ProductoTO proTO;
    
    TecladoRead tre=new TecladoRead();
    UtilsX ut=new UtilsX();
    
    public void registrarProducto() {
        System.out.println("******Regisrto de Productos*******");
        mostrarCategoria();
        proTO=new ProductoTO();
        proTO.setIdCateg(tre.read("", "Seleccion el ID categoria:"));        
        lar=new LeerArchivo("Producto.txt");
        
    }

    public void mostrarCategoria() {
        lar=new LeerArchivo("Categoria.txt");
        Object[][] data=listarContenido(lar);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i][0]+"="+data[i][1]+", ");
        }
        System.out.println("");
    }
    
}
