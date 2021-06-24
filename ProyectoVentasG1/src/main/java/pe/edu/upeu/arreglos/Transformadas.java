package pe.edu.upeu.arreglos;

public class Transformadas {

    public void sumaMatrices(int[][] mA, int[][] mB) {
        int[][] mR=new int[mA.length][mA[0].length];

        for (int f = 0; f < mA.length; f++) {
            for (int c = 0; c < mA[0].length; c++) {
                mR[f][c]=mA[f][c]+mB[f][c];
            }            
        } 
        imprimirMatriz(mR);
    }

    public void imprimirMatriz(int[][] matriz) {
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[f][c]+"\t");
            }
            System.out.println("");
        } 
     }   

    public static void main(String[] args) {
        Transformadas tansf=new Transformadas();
        int mA[][]={
            {7,	10,	1},
            {5,	6,	5},
            {4,	3,	7}           
            };
        int mB[][]={
            {9,	10,	7},
            {1,	1,	1},
            {6,	10,	5}           
            }; 
        
        tansf.sumaMatrices(mA, mB);    
    }
    
}
