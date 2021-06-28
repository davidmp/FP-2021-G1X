package pe.edu.upeu.app;

import pe.edu.upeu.dao.CategoriaDAO;
import pe.edu.upeu.gui.MainGUI;

/**
 * Hello world!
 *
 */
public class App{
    public static void main( String[] args ){
        System.out.println( "Hello World!" );
        CategoriaDAO daoCat=new CategoriaDAO();
        
        daoCat.registrarCategoria();
        daoCat.reporteCategoria();

        //new MainGUI();
    }
}
