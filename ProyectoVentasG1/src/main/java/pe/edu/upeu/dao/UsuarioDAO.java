package pe.edu.upeu.dao;

import java.io.Console;

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
    
    public void registrarUsuario() {
        usuTO=new UsuarioTO();
        String usuario=tre.read("", "Ingrese un Usuario:");
        usuTO.setUsuario(usuario);
        usuTO.setPerfil(tre.read("", "Ingrese el perfil (ADMIN, VENDEDOR, CAJERO):"));
        lar=new LeerArchivo("Usuario.txt");
        usuTO.setIdUsuario(generarId(lar, 0, "U", 1));
        Console cons=System.console();
        System.out.println("Ingrese su clave:");
        char[] clave=cons.readPassword();
        usuTO.setClave(String.valueOf(clave));
        lar=new LeerArchivo("Usuario.txt");
        agregarContenido(lar, usuTO);
    }
}
