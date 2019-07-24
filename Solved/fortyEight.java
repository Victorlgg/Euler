package Solved;


/**
The series, 11 + 22 + 33 + ... + 1010 = 10405071317.

Find the last ten digits of the series, 11 + 22 + 33 + ... + 10001000.
 */
import java.math.BigInteger;
public class fortyEight
{
    public static void main(String [] args){
        BigInteger Suma =  new BigInteger("0");
        BigInteger Potencia;
        for(int i=1;i<1000;i++){
            Potencia = new BigInteger(String.valueOf(i));
            Potencia = Potencia.pow(i);
            
            System.out.println(Potencia);
            Suma = Suma.add(Potencia);
            
        }
        //System.out.println(Suma);
        System.out.println(Suma.toString().substring(Suma.toString().length()-10 ,Suma.toString().length()));
    }
    
}
