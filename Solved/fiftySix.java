package Solved;


/**
A googol (10^100) is a massive number: one followed by one-hundred zeros; 100100 is almost unimaginably large: one followed by two-hundred zeros. Despite their size, the sum of the digits in each number is only 1.

Considering natural numbers of the form, ab, where a, b < 100, what is the maximum digital sum?
 */
import java.math.BigInteger;
public class fiftySix
{
    public static void main(String [] args){
        BigInteger Numero;
        int limite=100;
        int MayorSuma=0;
        for(int a=2;a<limite;a++){
            int suma=0;
            for(int b=1;b<limite;b++){
                suma=0;
                Numero = new BigInteger(String.valueOf(a));
                Numero = Numero.pow(b);
                String cadena= Numero.toString();
                for(int i=0;i<cadena.length();i++){
                    suma+=Character.getNumericValue(cadena.charAt(i));
                }
                if(suma>MayorSuma){
                    MayorSuma=suma; 
                    System.out.println("a: "+a+" b: "+b+" Suma:"+MayorSuma +" cadena: "+cadena);
                }
                
            }
        }
        System.out.println(MayorSuma);
    }
}
