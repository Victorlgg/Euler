
/**
 *You are given the following information, but you may prefer to do some research for yourself.
 *
 * 1 Jan 1900 was a Monday.
 * Thirty days has September,
 * April, June and November.
 * All the rest have thirty-one,
 * Saving February alone,
 * Which has twenty-eight, rain or shine.
 * And on leap years, twenty-nine.
 * A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
 * How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
 *
 * 
 */
public class nineteen
{
    public static void main(String [] args){
        //Primero algoritmo para saber si un año es bisiesto
        int fechaMax=2000;
        boolean bisiesto=false;
        int days=0;
        for(int year=1901;year<=fechaMax;year++){
            if(year%400==0){
                bisiesto=true;
            }else{
                if(year%4==0 && year%100!=0){
                    bisiesto=true;
                    days+=366;
                    //System.out.println(year+" es bisiesto");
                }
                days+=365;
            }
            bisiesto=false;
        }
        System.out.println((Math.floor(days/7/100)));

        
    }
}
