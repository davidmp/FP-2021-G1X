package pe.edu.upeu.app;

import pe.edu.upeu.dao.CategoriaDAO;
import pe.edu.upeu.dao.ProductoDAO;
import pe.edu.upeu.dao.UsuarioDAO;
import pe.edu.upeu.dao.VentaDAO;
import pe.edu.upeu.gui.MainGUI;
import pe.edu.upeu.util.TecladoRead;
import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.AnsiConsole;
import static org.fusesource.jansi.Ansi.Color.*;

/**
 * Hello world!
 *
 */
public class App{
    static Ansi color=new Ansi();

    public static void menuMain() {
        String mensaje="Seleccion el algoritmo que desea probar:"+
        "\n1=Registrar Categoria"+
        "\n11=Reportar Categoria"+
        "\n2=Registrar Producto"+
        "\n3=Registrar Usuario"+
        "\n4=Registrar Venta"+
        "\n41=Reporte Ventas por fechas"+
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
                case 41: ventDao=new VentaDAO(); ventDao.reportarVentasRangoFecha(); break;   
                default:System.out.println("Opcion no existe");   break;
            }       
                 
            if (opciones!=0){ 
            System.out.println();
            String continuar=tre.read("","Desea continuar en el sistemas? SI=S/NO=N ")
            .toUpperCase();
            if(continuar.charAt(0)=='S'){
                opciones=tre.read(0, mensaje); 
            }else{ opciones=0;}            
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
        AnsiConsole.systemInstall();        
        //System.out.println( color.bgBrightGreen().fg(RED).a("Hello").fg(BLACK).a(" World").reset() );        
        System.out.println(color.render("Resumen: @|red Neto Total:S/. |@ @|green "+(Math.round(40.54411*100.0)/100.0)+
        "|@ | @|red IGV: S/.|@ @|green "+(Math.round(15.3333*100.0)/100.0)+"|@  | @|red Monto total: S/. |@ @|green "+
        (Math.round(53.4100*100.0)/100.0)+"|@"));        
        validAccessSystem();
        //new MainGUI();
    }
}
