
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
        int nuevoNumero=0;
        int valorMayor=1;
        int totalCadena=0;
        for(int numero=1;numero<=200000;numero++){
            System.gc();
            cadena=0;
            nuevoNumero=numero;
            //System.out.println(numero%10000==0 ? "\nN:"+numero :"");
            while(nuevoNumero!=1  && nuevoNumero>0){
                if(nuevoNumero%2==0){
                    nuevoNumero=nuevoNumero/2;
                    cadena++;
                }else{
                    nuevoNumero=(nuevoNumero*3)+1;
                    cadena++;
                }
                
                //System.out.print((cadena)%100==0 ? nuevoNumero+" -> ": "");
                //System.out.print((numero)%100==0 ? numero+" \n": "");
                
                //System.out.println("nn:"+nuevoNumero+" c:"+cadena);
                
            }
            if(cadena>totalCadena){
                totalCadena=cadena;
                valorMayor=numero;
            }
            System.out.print(numero%1000==0 ?"\n"+numero+" vm: "+valorMayor+", lc: "+totalCadena:"");
        }
        //0-100k 77031 350
        //106239, 353
        //156159 382
        //216367 385
        //230631 442
        //410011 448
        //511935 469 .... 
        //767903 467
        //910107 475
    }
}
