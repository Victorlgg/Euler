package Solved;


/**
The following iterative sequence is defined for the set of positive integers:

n ->→ n/2 (n is even)
n ->→ 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:

13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.
 */
public class catorce
{
    public static void main(String [] args){
        int cadena=0;
        long nuevoNumero=0;//Si es entero, se produce un error en 113383 que da lugar a un numero negativo y una cadena infinita
        int valorMayor=1;
        int totalCadena=0;
        for(int numero=113383;numero<=1000001;numero++){
            cadena=1;
            nuevoNumero=numero;
            //System.out.println(numero%10000==0 ? "\nN:"+numero :"");
            while(nuevoNumero!=1 ){
                if(nuevoNumero%2==0){
                    nuevoNumero=nuevoNumero/2;
                }else{
                    nuevoNumero=(nuevoNumero*3)+1;
                }
                cadena++;
                
                //System.out.print((cadena)%100==0 ? nuevoNumero+" -> ": "");
                //System.out.print((numero)%100==0 ? numero+" \n": "");

                //System.out.println(numero+" nn:"+nuevoNumero+" c:"+cadena);

            }
            if(cadena>=totalCadena){
                totalCadena=cadena;
                valorMayor=numero;
            }
            System.out.print(numero%1000==0 ?"\n"+numero+" vm: "+valorMayor+", lc: "+totalCadena:"");
        }
        
    }
}
