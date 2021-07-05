package pe.edu.upeu.dao;

import java.text.SimpleDateFormat;
import java.util.Date;

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
    SimpleDateFormat formato=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    SimpleDateFormat formatoFecha=new SimpleDateFormat("dd-MM-yyyy");        

    public void registroVentaGeneral() {
        VentaTO vTO=crearVenta();
        String continuar="SI";
        double precioTotalX=0;
        do {
            VentaDetalleTO vdTOX=carritoVenta(vTO);
            precioTotalX=precioTotalX+vdTOX.getPrecioTotal();
            continuar=tre.read("", "Desea algun producto mas? (SI=S/NO=N):").toUpperCase();
        } while (continuar.charAt(0)=='S');
        vTO.setPrecioTotal(precioTotalX);
        vTO.setNetoTotal(precioTotalX/1.18);
        vTO.setIgv(vTO.getNetoTotal()*0.18);
        
        ut.pintarLine('H', 20);        
        System.out.println("Precio Neto S/.:"+        
        vTO.getNetoTotal()+" | IGV S/.: "+vTO.getIgv()+" | Total a pagar S/."+ 
        vTO.getPrecioTotal());        
        ut.pintarLine('H', 20);        
    
        lar=new LeerArchivo("Venta.txt");
        editarRegistro(lar, 0, vTO.getIdVenta(), vTO);
    }

    public VentaTO crearVenta() {
        lar=new LeerArchivo("Venta.txt");
        ventTO=new VentaTO();
        ventTO.setIdVenta(generarId(lar, 0, "V", 1));
        ventTO.setIdDni(tre.read("", "Ingrese el DNI del cliente:"));
        ventTO.setFechaVenta(formato.format(new Date()));
        ventTO.setIgv(0.0);
        ventTO.setNetoTotal(0.0);
        ventTO.setPrecioTotal(0.0);
        lar=new LeerArchivo("Venta.txt");
        agregarContenido(lar, ventTO);
        return ventTO;
    }

    public VentaDetalleTO carritoVenta(VentaTO vTO) {
        ut.clearConsole();
        System.out.println("*************Agregar Productos a carrito de ventas***********");
        mostrarProductos();
        vdTO=new VentaDetalleTO();
        vdTO.setIdProducto(tre.read("", "Ingrese el ID del Producto:"));
        vdTO.setIdVenta(vTO.getIdVenta());
        lar=new LeerArchivo("VentaDetalle.txt");
        vdTO.setIdVentaDetalle(generarId(lar, 0, "DV", 2));
        LeerArchivo larX=new LeerArchivo("Producto.txt");
        Object[][] dataP=buscarContenido(larX, 0,vdTO.getIdProducto());
        double porcentUt=Double.parseDouble(String.valueOf(dataP[0][5]));
        double pUnit=Double.parseDouble(String.valueOf(dataP[0][4]));
        vdTO.setPorcentUtil(porcentUt);
        vdTO.setPrecioUnit(pUnit+pUnit*porcentUt);
        vdTO.setCantiad(tre.read(0.0, "Ingrese cantidad:"));
        vdTO.setPrecioTotal(vdTO.getCantiad()*vdTO.getPrecioUnit());
        lar=new LeerArchivo("VentaDetalle.txt");
        agregarContenido(lar, vdTO);
        return vdTO;
    }

    public void mostrarProductos() {
        lar=new LeerArchivo("Producto.txt");
        Object[][] dataP=listarContenido(lar);
        for (int i = 0; i < dataP.length; i++) {            
            System.out.print(dataP[i][0]+"="+dataP[i][1]+"(P.Unit S/.:"+
            dataP[i][4]+", Stock:"+dataP[i][6]+"), ");
        }
        System.out.println("");
    }
}
