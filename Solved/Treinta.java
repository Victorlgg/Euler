package Solved;


/**
Surprisingly there are only three numbers that can be written as the sum of fourth powers of their digits:

1634 = 14 + 64 + 34 + 44
8208 = 84 + 24 + 04 + 84
9474 = 94 + 44 + 74 + 44
As 1 = 1^4 is not a sum it is not included.

The sum of these numbers is 1634 + 8208 + 9474 = 19316.

Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.
 */
public class Treinta
{
    public static void main(String [] args){
        System.out.println();
        int valor=10;
        int suma=0;
        int sumatoria=0;
        while(true){
            String numero = Integer.toString(valor);
            for(int i=0;i<numero.length();i++){
                switch(numero.charAt(i)){
                    case 0:
                    break;
                    case 1:
                    suma+=1;
                    break;
                    default: suma+= Math.pow(Integer.parseInt(""+numero.charAt(i)),5);

                }
               
            }
            if(suma==valor){
                System.out.println("\nNUMERO:"+valor+"\n");
                sumatoria+=valor;
            }

            if(valor>300000){
                break;
            }
            //System.out.print(valor%10000==0? " valor:"+valor+",suma: "+suma:"");
            //System.out.print(valor%100000==0? "\n":"");
            valor++;
            suma=0;
        }
        System.out.println("Sumatoria: "+sumatoria);
    }
}
