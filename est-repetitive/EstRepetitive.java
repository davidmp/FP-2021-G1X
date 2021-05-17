import java.util.Scanner;

/**
 * EstRepetitive hace comentario un bloque de codigo
 */
//comenta una sola linea
public class EstRepetitive {
    //objTeclado es un objeto
    static Scanner objTeclado=new Scanner(System.in);//Permite leer valores por teclado
    /* Inicio a, b son atributos o Variables, pero variables globales*/
    static int a=10;
    double b=5;
    /* Fin a, b son atributos o Variables, pero variables globales*/

    /* Estos son metodos */
    public static void saludo() {
        System.out.print("Ingrese su nombre:"); 
        String nombre=objTeclado.next();//Leer nombre
        System.out.println("Hola: "+nombre+" Como estas?");         
        System.out.println("Suma:"+ (a) );
    }

    public void saludo2() {
        System.out.print("Ingrese su nombre:"); 
        String nombre=objTeclado.next();//Leer nombre        
        System.out.println("Hola: "+nombre+" Como estas?");  
        System.out.println("Suma:"+ (a+b) );       
    }    

    public static void suma10NumerosMientras() {
        //Declarar Variables
        double numeros, sumaNumeros=0;
        int contador=1;
        //Datos de entrada y Proceso
        while(contador<=10){
            System.out.println("Ingrese el valor de la posicion "+contador+":");
            numeros=objTeclado.nextDouble();
            sumaNumeros=sumaNumeros+numeros;
            contador++; //contador=contador+1;
        }
        System.out.println("La suma de los 10 numeros es:"+sumaNumeros);
    }

    public static void suma10NumerosHacerMientras() {
        //Declarar Variables
        double numeros, sumaNumeros=0;
        int contador=1;
        //Datos de entrada y Proceso
        do{        
            System.out.println("Ingrese el valor de la posicion "+contador+":");
            numeros=objTeclado.nextDouble();
            sumaNumeros=sumaNumeros+numeros;//29
            contador++;    //contador=contador+1                    
        }
        while(contador<=10);
        System.out.println("La suma de los 10 numeros es:"+sumaNumeros);
    }


    public static void suma10NumerosPara() {
        //Declarar Variables
        double numeros, sumaNumeros=0;        
        //Datos de entrada y Proceso
        for(int contador=1;contador<=10;contador++){        
            System.out.println("Ingrese el valor de la posicion "+contador+":");
            numeros=objTeclado.nextDouble();
            sumaNumeros=sumaNumeros+numeros;                                    
        }
        System.out.println("La suma de los 10 numeros es:"+sumaNumeros);
    }    

    public static void menuMain() {
        String mensaje="Seleccion el algoritmo que desea probar:"+
        "\n1=suma10NumerosMientras"+
        "\n2=suma10NumerosHacerMientras"+
        "\n3=suma10NumerosPara"+
        "\n0=Salir del sistema"
        ;
        System.out.println(mensaje);
        int opciones=objTeclado.nextInt();         
        do {
            switch (opciones) {
                case 1: suma10NumerosMientras(); break;
                case 2: suma10NumerosHacerMientras(); break;
                case 3: suma10NumerosPara(); break;        
                default:System.out.println("Opcion no existe");   break;
            }            
            if (opciones!=0){ 
            System.out.println("Desea probar otraves? "+mensaje);
            opciones=objTeclado.nextInt(); 
            }            
        }while (opciones!=0);
    }

    public static void main(String[] args) { 
        menuMain();
    }
      
}