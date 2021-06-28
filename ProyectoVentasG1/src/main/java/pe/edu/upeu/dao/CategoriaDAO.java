package pe.edu.upeu.dao;

import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.modelo.CategoriaTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.TecladoRead;
import pe.edu.upeu.util.UtilsX;

public class CategoriaDAO extends AppCrud{
   
    LeerArchivo lar;
    CategoriaTO catTO;
    
    TecladoRead tre=new TecladoRead();
    UtilsX ut=new UtilsX();

    public void registrarCategoria() {
        catTO=new CategoriaTO();
        lar=new LeerArchivo("Categoria.txt");
        catTO.setIdCateg(generarId(lar, 0, "C", 1)); 
        catTO.setNombre(tre.read("", "Ingrese nombre categoria:"));
        agregarContenido(lar, catTO);
    }

    public void reporteCategoria() {
        lar=new LeerArchivo("Categoria.txt");
        imprimirLista(listarContenido(lar));
    }

}
