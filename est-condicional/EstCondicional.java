import java.util.Scanner;
class EstCondicional{
  static Scanner teclado=new Scanner(System.in);
  static void ejercicio01(){
    //Definir variables y otros
    System.out.println("Ejemplo estructura Condicional en Java");
    int cantidadX=0;
    double montoP=0;
    //Datos de Entrada
    System.out.println("Ingrese la cantidad de lapices:");
    cantidadX=teclado.nextInt();
    //Proceso
    if(cantidadX>=1000){
    montoP=cantidadX*0.80;
    }else{
    montoP=cantidadX*0.90;
    }
    //Datos de salida
    System.out.println("El monto a pagar es:"+montoP);
  }

  static void bonoDocente(){
    //Definir Variables y otros
    double salarioMinimo, puntuacionObtenida, bonoObtenido=0.0;
    //Datos de Entrada
    System.out.println("Ingrese el salario minimo:");
    salarioMinimo=teclado.nextDouble();
    System.out.println("Ingrese la puntuacion obtenida:");
    puntuacionObtenida=teclado.nextDouble();
    //Proceso
  if (puntuacionObtenida<=100 && puntuacionObtenida>=0){
    bonoObtenido=salarioMinimo;
  }else if(puntuacionObtenida >=101 && puntuacionObtenida<=150){
        bonoObtenido=salarioMinimo*2;
  }else if(puntuacionObtenida>150){
      bonoObtenido=salarioMinimo*3;    
  }
  //Datos de salida
  System.out.println("El docente obtendra un bono de:"+bonoObtenido );  
  }


  public static void main(String[] arg){
    //ejercicio01();
    bonoDocente();
  }
}