package Solved;


/**
The prime 41, can be written as the sum of six consecutive primes:

41 = 2 + 3 + 5 + 7 + 11 + 13
This is the longest sum of consecutive primes that adds to a prime below one-hundred.

The longest sum of consecutive primes below one-thousand that adds to a prime, contains 21 terms, and is equal to 953.

Which prime, below one-million, can be written as the sum of the most consecutive primes?
 */
public class cincuenta
{

    public static boolean esPrimo(int numero){
        if(numero<2){ return false; } 
        for(int i=2;i<=Math.sqrt(numero);i++){
            if(numero%i==0){ return false; }
        }
        return true;
    }

    public static void main(String [] args){
        int numero=2;
        int suma;
        int mayor=0;
        int mayorSuma=0;
        int millon=1000000;
        int mayorCadena=0;
        while(numero<millon/2){
            int cadena=0;
            suma=0;
            for(int n=numero;n<millon/2;n++){
                if(esPrimo(n) && suma+n<millon){
                    //System.out.println(" :"+numero);
                    cadena++;
                    //System.out.println(n);
                    suma+=n;
                    
                    if(esPrimo(suma) && cadena>mayorCadena){
                        mayor=suma;
                        mayorSuma=mayor;
                        mayorCadena=cadena;
                    }
                    
                } 
                if(suma+n>millon){
                    break;
                }
            }


            if(mayorSuma>millon){
                break;
            }
            numero++;
            System.out.print(numero%1000==0 ?"\n numero:"+numero+" suma:"+mayor:"" );
        }

        System.out.println("Mayor suma:"+mayor+ " c:"+mayorCadena);
        
    }

}

