package Solved;


/**
2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 2^1000?
 */
import java.math.*;
public class Sixteen
{
    //No borrar el ejercicio 
    public static void main(String [] args){
        int sumatoria=0;
        BigInteger big = new BigInteger("2");
        BigInteger bigp = new BigInteger(big.pow(1000).toString());

        for(int it=0;it<bigp.toString().length();it++){
            sumatoria+= Character.getNumericValue(bigp.toString().charAt(it));
        }
        System.out.println("Total: "+bigp.toString()+"\n Sumatoria: "+sumatoria+", Total caracteres: "+bigp.toString().length());
    }
}
