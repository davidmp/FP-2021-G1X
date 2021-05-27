package pe.edu.upeu;

import java.math.BigInteger;

import pe.edu.upeu.util.TecladoRead;

public class SubProgramas {
    
    //Scanner teclado=new Scanner(System.in);
    TecladoRead teclado=new TecladoRead();

    //Calcula el factorial de cualquier numero
    public  int factorial(int numero) {
        int factorialResult=1;
        if(numero>1){
            for (int i = 2; i <= numero; i++) {
                factorialResult*=i;
            }
        }
        return factorialResult;        
    }
    public long factorialLong(int numero) {
        long factorialResult=1;
        if(numero>1){
            for (int i = 2; i <= numero; i++) {
                factorialResult*=i;
            }
        }
        return factorialResult;        
    }    
    //Calcula la potencia de cualquier numero
    public double potencia(int x, int i) {
        return Math.pow(x, i);
    }

    public void calcularFuncionExponecial() {
        //Declarar Variables
        int x, lfx;
        double fx=0;
        //Datos de entrada
        x=teclado.read(0, "Ingrese un numero para calcular la funcion exponencial:");
        System.out.println();
        lfx=teclado.read(0, "Ingrese el limite de la funcion exponencial:");   
        //Proceso
        if(x!=0){
            for (int i = 0; i < lfx; i++) {
                System.out.println(fx);
                //fx+=((Math.pow(x, i))/hallarFactorial(i));
                fx=fx+(potencia(x, i)/factorial(i));
            }
        }
        //Datos de salida
        System.out.println("La funcion exponencial de e^x es:"+fx);
    }
    
    //Calcula el factorial de cualquier numero
    public BigInteger factorialBig(int numero) {
        BigInteger factorialResult = new BigInteger("1");
        ;
        if(numero>1){
            for (int i = 2; i <= numero; i++) {                
                factorialResult=factorialResult.multiply(new BigInteger(String.valueOf(i)));
            }
        }
        return factorialResult;        
    }    

}
