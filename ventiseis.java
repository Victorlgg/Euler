
/**
 * A unit fraction contains 1 in the numerator. The decimal representation of the unit fractions with denominators 2 to 10 are given:

1/2 =   0.5
1/3 =   0.(3)
1/4 =   0.25
1/5 =   0.2
1/6 =   0.1(6)
1/7 =   0.(142857)
1/8 =   0.125
1/9 =   0.(1)
1/10    =   0.1
Where 0.1(6) means 0.166666..., and has a 1-digit recurring cycle. It can be seen that 1/7 has a 6-digit recurring cycle.

Find the value of d < 1000 for which 1/d contains the longest recurring cycle in its decimal fraction part.
 */

import java.math.BigInteger;

public class ventiseis
{
    public static void main(String [] args){
        float numero= 1;
        float division=0;
        float auxiliar= 0;
        double mayor=0;
        int contador=0;
        int actual=0;
        for(int i=1000;i>0;i--){
            System.out.println();
            auxiliar= (float)numero/i;
            String elNumero = Float.toString(auxiliar);
            for(int j=1; j<elNumero.length()-1;j++){
                System.out.print(elNumero.substring(j));
                if(elNumero.charAt(j)==elNumero.charAt(j+1)){
                    contador++;
                }
            }
            if(contador>actual){
                division= auxiliar;              
                mayor=i;
                actual=contador;
            }
            contador=0;
            //if( Float.toString(auxiliar).length()>Float.toString(division).length()){}
        }
        System.out.println("El mayor es "+mayor +" con "+division);
    }

}
