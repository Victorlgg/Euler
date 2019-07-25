package Solved;


/**
The decimal number, 585 = 1001001001 (binary), is palindromic in both bases.

Find the sum of all numbers, less than one million, which are palindromic in base 10 and base 2.

(Please note that the palindromic number, in either base, may not include leading zeros.)
 */
public class thirtySix
{
    public static void main(String [] args){
        int millon=1000000;
        int suma=0;
        for(int i=1;i<millon;i++){
            String numero = ""+i;
            boolean EsPalindromo10=true;
            boolean EsPalindromo2=true;
            
            for(int a=0, b=numero.length()-1; a<numero.length();a++, b--){
                if(Character.getNumericValue(numero.charAt(a)) == Character.getNumericValue(numero.charAt(b))){
                    if(a==b){
                        break;
                    }
                    continue;
                }else{
                    EsPalindromo10=false;
                    break;
                }
            }
            if(EsPalindromo10){
                String binario = Integer.toBinaryString(i);
                for(int a=0, b=binario.length()-1; a<binario.length();a++, b--){
                    if(binario.charAt(a) == binario.charAt(b)){ 
                        if(a==b){
                            break;
                        }
                        continue;
                    }else{
                        EsPalindromo2=false;
                        break;
                    }
                }
                if(EsPalindromo2){
                    
                    System.out.println("Si es Binario 10:"+i+" 2:"+binario);
                    suma+=i;
                }else{
                    //System.out.println("No es binario 10:"+i+" 2:"+binario);
                }
            }
            
        }
        System.out.println(suma);
    }
}
