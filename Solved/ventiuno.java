package Solved;

/**Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.

For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. 
The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.

Evaluate the sum of all the amicable numbers under 10000.**/
public class ventiuno
{
    public static void main(String [] args){
        //Numeros amistosos
        int sumaAmistosos=0;
        for(int numero=5;numero<=10000;numero++){
            System.out.print(numero%100==0 ? numero+"\n": numero+" ");
            int sumaDivisores=0;
            int sumaDivAux=0;
            for(int divisor=1; divisor<=(numero/2)+1;divisor++){
                if(numero%divisor==0){
                    sumaDivisores+=divisor;
                }
            }
            if(sumaDivisores != numero){
                for(int divisor=1; divisor<=(sumaDivisores/2)+1;divisor++){
                    if(sumaDivisores%divisor==0){
                        sumaDivAux+=divisor;
                    }
                }
            }
            if(sumaDivAux==numero){
                sumaAmistosos+=numero;
                System.out.println("Numero amistoso: "+numero);
            }
        }
        System.out.println("Suma: "+sumaAmistosos);
    }
}
