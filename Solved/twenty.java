package Solved;


/**
n! means n × (n − 1) × ... × 3 × 2 × 1

For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

Find the sum of the digits in the number 100!
 **/
import java.math.*;
public class twenty
{
    public static void main(String []args){
        //factorial
        BigInteger bigFactorial = new BigInteger("100");
        BigInteger bigFactor = new BigInteger("99");
        BigInteger uno = new BigInteger("1");
        int numero=100;
        long resultado=1;
        long auxiliar=numero;
        int sumatoria=0;
        for(int i = numero; i>2;i--){
            bigFactorial = bigFactorial.multiply(bigFactor);
            bigFactor = bigFactor.subtract(uno);
            //auxiliar*=i-1;
            //resultado=auxiliar;
            //System.out.println("r:"+resultado);
            System.out.println("r:"+bigFactorial.toString());
        }
        String valores = bigFactorial.toString();
        for(int it=0;it<bigFactorial.toString().length();it++){
            long val= Long.valueOf(it);

            sumatoria+= Character.getNumericValue(valores.charAt(it));
            //System.out.println(numeroString.charAt(i)+", ="+sumatoria);
        }
        System.out.println("Total: "+valores+"\n Sumatoria: "+sumatoria+", Total caracteres: "+valores.length());
        //System.out.println("r:"+valores);
    }
}
