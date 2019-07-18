package Solved;


/**
 * The number 3797 has an interesting property. Being prime itself, it is possible to continuously remove digits from left to right, 
 * and remain prime at each stage: 3797, 797, 97, and 7. Similarly we can work from right to left: 3797, 379, 37, and 3.
 * Find the sum of the only eleven primes that are both truncatable from left to right and right to left.
 * NOTE: 2, 3, 5, and 7 are not considered to be truncatable primes.
 */
public class treintaysiete
{

    public static boolean esPrimo(int numero){
        if(numero<2){ return false; } ///this only line was the thing i needed to fix it all
        for(int i=2;i<=Math.sqrt(numero);i++){
            if(numero%i==0){ return false; }
        }
        return true;
    }

    public static void main(String [] args){
        int numero=9;
        int suma=0;
        int nTruncables=0;
        System.out.println();
        while(nTruncables<=10 && numero>0 && numero<1000000){
            if(esPrimo(numero)){
                int total=1;
                int valor= String.valueOf(numero).length();
                int potencia;

                for(potencia=(int)Math.pow(10,(valor-1));potencia>0;potencia=potencia/10){
                    int LtR = numero%potencia;
                     int RtL = numero/potencia;
                    if(numero%potencia!=0 ){
                        if(esPrimo(LtR) && esPrimo(RtL)){
                            total++;
                        }else{
                            break;
                        }
                    }else{
                        break;
                    }
                }

                if(total==valor){
                    suma+=numero;
                    nTruncables++;
                    System.out.println("n: "+numero+" : "+ nTruncables);
                }
            }

            numero+=2;
        }
        System.out.println("suma "+suma);

    } 
}