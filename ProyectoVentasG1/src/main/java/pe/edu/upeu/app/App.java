package pe.edu.upeu.app;

import pe.edu.upeu.dao.CategoriaDAO;
import pe.edu.upeu.dao.UsuarioDAO;
import pe.edu.upeu.gui.MainGUI;
import pe.edu.upeu.util.TecladoRead;

/**
 * Hello world!
 *
 */
public class App{

    public static void menuMain() {
        String mensaje="Seleccion el algoritmo que desea probar:"+
        "\n1=Registrar Categoria"+
        "\n11=Reportar Categoria"+
        "\n2=Registrar Producto"+
        "\n3=Registrar Usuario"+
        "\n4=Registrar Venta"+
        "\n0=Salir del sistema"
        ;     
        CategoriaDAO daoCat;   
        UsuarioDAO daoUso;
        TecladoRead tre=new TecladoRead();
        int opciones=tre.read(0, mensaje);         
        do {
            switch (opciones) {
                case 1: daoCat=new CategoriaDAO(); daoCat.registrarCategoria(); break;
                case 11: daoCat=new CategoriaDAO(); daoCat.reporteCategoria(); break;
                case 2:  break;
                case 3: daoUso=new UsuarioDAO(); daoUso.registrarUsuario();  break;        
                default:System.out.println("Opcion no existe");   break;
            }            
            if (opciones!=0){ 
            System.out.println("Desea probar otraves? ");
            opciones=tre.read(0, mensaje);
            }            
        }while (opciones!=0);
    }

    public static void main( String[] args ){
        menuMain();
        //new MainGUI();
    }
}
