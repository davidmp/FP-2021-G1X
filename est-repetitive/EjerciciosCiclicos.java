import java.util.Scanner;

public class EjerciciosCiclicos {
    static Scanner teclado=new Scanner(System.in);


    public static int hallarFactorial(int numero) {
        int factorialResult=1;
        if(numero>1){
            for (int i = 2; i <= numero; i++) {
                factorialResult*=i;
            }
        }
        return factorialResult;        
    }

    public static void calcularFuncionExponecial() {
        //Declarar Variables
        int x, lfx;
        double fx=0;
        //Datos de entrada
        System.out.println("Ingrese un numero para calcular la funcion exponencial:");
        x=teclado.nextInt();
        System.out.println("Ingrese el limite de la funcion exponencial:");
        lfx=teclado.nextInt();    
        //Proceso
        if(x!=0){
            for (int i = 0; i < lfx; i++) {
                System.out.println(fx);
                //fx+=((Math.pow(x, i))/hallarFactorial(i));
                fx=fx+((Math.pow(x, i))/hallarFactorial(i));
            }
        }
        //Datos de salida
        System.out.println("La funcion exponencial de e^x es:"+fx);
    }


    public static void hallarSenoX() {
        //Declarar Variables
        int senx, lfunSenx;        
        //Datos de entrada
        System.out.println("Ingrese un numero X:");
        senx=teclado.nextInt();
        System.out.println("Ingrese el limite de la funcion x:");
        lfunSenx=teclado.nextInt();     
        double fresulSenX=0;
        //proceso        
        int contSigno=0;
        if(senx!=0){
            for (int i = 1; i < lfunSenx; i+=2) {                
                //fx+=((Math.pow(x, i))/hallarFactorial(i));
                System.out.println("i="+i);
                if (contSigno%2==0) {
                    System.out.println("signo +");
                    fresulSenX=fresulSenX+((Math.pow(senx, i))/hallarFactorial(i));
                } else {
                    fresulSenX=fresulSenX-((Math.pow(senx, i))/hallarFactorial(i));
                    System.out.println("signo -");
                }
                //System.out.println(fresulSenX);
                contSigno++;
            }
        }         
        //Datos de de salida
        System.out.println("Sen x es:"+fresulSenX);
        
    }


    
    public static void main(String[] args) {
        /*System.out.println("Ingrese un numero para calcular su factorial:");
        int numerox=teclado.nextInt();
        System.out.println("Factoria de "+numerox+" es:"+ hallarFactorial(numerox));*/
        //calcularFuncionExponecial();

        hallarSenoX();
    }


}
