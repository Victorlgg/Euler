package Solved;


/**
Starting with the number 1 and moving to the right in a clockwise direction a 5 by 5 spiral is formed as follows:

21 22 23 24 25
20  7  8  9 10
19  6  1  2 11
18  5  4  3 12
17 16 15 14 13

It can be verified that the sum of the numbers on the diagonals is 101.

What is the sum of the numbers on the diagonals in a 1001 by 1001 spiral formed in the same way?
 */
public class ventiocho
{
    public static void main(String[] args){
        int Espiral = 1001; //tamaño de la espiral, 1001 o 5
        int numero=1;
        int sumaDiagonales=1;
        int posicion=2;
        int contador=0;
        
        
        for(int i=1;i<=Espiral*Espiral;i++){
            if(i==numero+posicion){
                sumaDiagonales+=i;
                numero=i;
                System.out.println(numero);
                contador++;
                if(contador==4){
                    contador=0;
                    posicion+=2;
                }
            }
        }
        System.out.println(sumaDiagonales);
    }
}
