package pe.edu.upeu.app;

import pe.edu.upeu.dao.CategoriaDAO;
import pe.edu.upeu.dao.ProductoDAO;
import pe.edu.upeu.dao.UsuarioDAO;
import pe.edu.upeu.dao.VentaDAO;
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
        ProductoDAO proDao;
        VentaDAO ventDao;
        TecladoRead tre=new TecladoRead();
        int opciones=tre.read(0, mensaje);         
        do {
            switch (opciones) {
                case 1: daoCat=new CategoriaDAO(); daoCat.registrarCategoria(); break;
                case 11: daoCat=new CategoriaDAO(); daoCat.reporteCategoria(); break;
                case 2: proDao=new ProductoDAO(); proDao.registrarProducto(); break;
                case 3: daoUso=new UsuarioDAO(); daoUso.registrarUsuario();  break;     
                case 4: ventDao=new VentaDAO(); ventDao.registroVentaGeneral(); break;   
                default:System.out.println("Opcion no existe");   break;
            }            
            if (opciones!=0){ 
            System.out.println("Desea probar otraves? ");
            opciones=tre.read(0, mensaje);
            }            
        }while (opciones!=0);
    }

    public static void validAccessSystem() {
        System.out.println("******************* Sistema de Ventas ******************");
        TecladoRead tr=new TecladoRead();
        UsuarioDAO uDao=new UsuarioDAO();
        String usuario=tr.read("", "Ingrese su Usuario:");
        System.out.println("Ingres su clave:");
        char[] clave=System.console().readPassword();
        if (uDao.login(usuario,clave)) {
            menuMain();
        } else {
            System.out.println("Error de autentifiacion.......Intetente nuevamente!!");
            validAccessSystem();
        }
    }


    public static void main( String[] args ){
        //menuMain();
        validAccessSystem();
        //new MainGUI();
    }
}
