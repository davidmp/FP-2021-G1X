package pe.edu.upeu.dao;

import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.modelo.UsuarioTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.TecladoRead;
import pe.edu.upeu.util.UtilsX;

public class UsuarioDAO extends AppCrud{
    LeerArchivo lar;
    UsuarioTO usuTO;
    
    TecladoRead  tre=new TecladoRead();
    UtilsX ut=new UtilsX();    
}
