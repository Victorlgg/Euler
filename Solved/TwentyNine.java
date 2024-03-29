package Solved;


/**
Consider all integer combinations of ab for 2 ≤ a ≤ 5 and 2 ≤ b ≤ 5:

2^2=4, 2^3=8, 2^4=16, 2^5=32
3^2=9, 3^3=27, 3^4=81, 3^5=243
4^2=16, 4^3=64, 4^4=256, 4^5=1024
5^2=25, 5^3=125, 5^4=625, 5^5=3125
If they are then placed in numerical order, with any repeats removed, we get the following sequence of 15 distinct terms:

4, 8, 9, 16, 25, 27, 32, 64, 81, 125, 243, 256, 625, 1024, 3125

How many distinct terms are in the sequence generated by a^b for 2 ≤ a ≤ 100 and 2 ≤ b ≤ 100?
 */
import java.math.BigInteger;
public class TwentyNine
{
    public static void main(String[] args){
        BigInteger[] vector = new BigInteger[10000];

        //vector[0] = vector[0].add(new BigInteger();
        BigInteger valor;
        int contador=0;
        boolean encontrado;
        int limite=100;
        for(int a=2;a<=limite;a++){
            for(int b=2;b<=limite;b++){
                encontrado=false;
                valor = new BigInteger(String.valueOf(a));
                valor = valor.pow(b);
                for(int i=0;i<vector.length;i++){
                    if(vector[i]==null){
                        continue;
                    }
                    if(vector[i].compareTo(valor)==0){
                        encontrado=true;
                        System.out.println(vector[i]+" repetido");
                        break;
                    }
                }
                if(!encontrado){
                    for(int i=0;i<vector.length;i++){
                        if(vector[i]==null){
                            vector[i] = valor;
                            //System.out.println(vector[i]+" insertado");
                            contador++;
                            break;
                        }
                        
                    }
                    
                }
                
            }
        }
        
        System.out.println(contador);
    }
}
