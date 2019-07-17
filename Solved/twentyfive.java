/**The 12th term, F12, is the first term to contain three digits.

What is the index of the first term in the Fibonacci sequence to contain 1000 digits?**/

package Solved;

import java.math.*;
public class twentyfive
{
    public static void main(String [] args){
        int fib=1;
        int result=1;
        int aux=0;
        int contador=0;
        BigInteger bigFibonacci = new BigInteger("1");
        BigInteger bigResultado = new BigInteger("1");
        BigInteger bigAuxiliar = new BigInteger("0");

        while(true){
            contador++;
            result=fib+aux;
            aux=fib;
            fib=result;
            //System.out.println((iterador+1)+": "+result);
            bigResultado = bigFibonacci.add(bigAuxiliar);
            bigAuxiliar = bigFibonacci;
            bigFibonacci = bigResultado;
            if(bigResultado.toString().length()==1000){
                break;
            }
        }
        System.out.println((contador+1)+"\n numero:"+bigResultado.toString());
    }
    //xD son Mil Digitos, no 4
}
