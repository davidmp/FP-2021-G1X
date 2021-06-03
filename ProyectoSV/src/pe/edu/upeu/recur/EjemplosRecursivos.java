package pe.edu.upeu.recur;

import java.math.BigInteger;

public class EjemplosRecursivos {
   
    public  long factorial(int numero) {
        long factorialResult=1;
        if(numero>1){
            for (int i = 2; i <= numero; i++) {
                factorialResult*=i;
            }
        }
        return factorialResult;        
    }

    public  long factorialRecur(int numero) {
        long factorialResult=1;
        if(numero>1){
           return factorialRecur(numero-1)*numero;
        }
        return factorialResult;        
    }    

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
    public BigInteger factorialBigRecur(int numero) {
        BigInteger factorialResult = new BigInteger("1");
        ;
        if(numero>1){
            return factorialBigRecur(numero-1)
            .multiply(new BigInteger(String.valueOf(numero)));
        }
        return factorialResult;        
    }     


    public long fibonaci(int numero) {
        long num1=0, num2=1, temp=0, result=0;
        int contador=0;
        if(numero>1){
            while (contador < numero-1) {                
                temp=num2;
                result=num1+num2;
                num1=temp;
                num2=result;                
                contador++;
            } 
            return result;           
        }else{
            return numero;
        }      
    }


    public long fibonaciRecur(int numero) {
        if(numero>1){            
            return fibonaciRecur(numero-1)+fibonaciRecur(numero-2);           
        }else{
            return numero;
        }      
    }


}
