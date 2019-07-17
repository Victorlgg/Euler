/**The product of these numbers is 26 × 63 × 78 × 14 = 1788696.

What is the greatest product of four adjacent numbers in the same direction (up, down, left, right, or diagonally) in the 20×20 grid?**/
package Solved;

public class once
{
    public static void main(String[] args){
        int matriz[][]={
                { 8, 2,22,97,38,15,00,40,00,75,04,05,07,78,52,12,50,77,91, 8},
                {49,49,99,40,17,81,18,57,60,87,17,40,98,43,69,48,04,56,62,00},
                {81,49,31,73,55,79,14,29,93,71,40,67,53,88,30,03,49,13,36,65},
                {52,70,95,23,04,60,11,42,69,24,68,56,01,32,56,71,37,02,36,91},
                {22,31,16,71,51,67,63,89,41,92,36,54,22,40,40,28,66,33,13,80},
                {24,47,32,60,99,03,45,02,44,75,33,53,78,36,84,20,35,17,12,50},
                {32,98,81,28,64,23,67,10,26,38,40,67,59,54,70,66,18,38,64,70},
                {67,26,20,68,02,62,12,20,95,63,94,39,63, 8,40,91,66,49,94,21},
                {24,55,58,05,66,73,99,26,97,17,78,78,96,83,14,88,34,89,63,72},
                {21,36,23, 9,75,00,76,44,20,45,35,14,00,61,33,97,34,31,33,95},
                {78,17,53,28,22,75,31,67,15,94,03,80,04,62,16,14, 9,53,56,92},
                {16,39,05,42,96,35,31,47,55,58,88,24,00,17,54,24,36,29,85,57},
                {86,56,00,48,35,71,89,07,05,44,44,37,44,60,21,58,51,54,17,58},
                {19,80,81,68,05,94,47,69,28,73,92,13,86,52,17,77,04,89,55,40},
                {04,52, 8,83,97,35,99,16,07,97,57,32,16,26,26,79,33,27,98,66},
                {88,36,68,87,57,62,20,72,03,46,33,67,46,55,12,32,63,93,53,69},
                {04,42,16,73,38,25,39,11,24,94,72,18, 8,46,29,32,40,62,76,36},
                {20,69,36,41,72,30,23,88,34,62,99,69,82,67,59,85,74,04,36,16},
                {20,73,35,29,78,31,90,01,74,31,49,71,48,86,81,16,23,57,05,54},  
                {01,70,54,71,83,51,54,69,16,92,33,48,61,43,52,01,89,19,67,48}};
        System.out.println("");
        int coordenadas[]=new int[2];
        int prodHoriz=1;
        int prodVert=1;
        int prodDiag=1;
        int prodDiagSec=1;
        for(int columna=0;columna<matriz.length;columna++){
            //System.out.print(matriz[0][columna]+" ");

            for(int fila=0;fila<matriz[columna].length;fila++){
                //System.out.println(matriz[fila][columna]+" ");
                /**HALLAR MAYOR VERTICAL**/
                int vAux=1;
                for(int contador=fila;contador<(fila+4) && fila+3<matriz[columna].length;contador++){
                    vAux*=matriz[contador][columna];
                    //System.out.print(contador!=(fila+3)? matriz[contador][columna]+" x ":matriz[contador][columna]+" = "+vAux+"\n");
                }
                if(vAux>prodVert){
                    prodVert=vAux;
                    //coordenadas[0]=fila;
                    //coordenadas[1]=columna;
                    if(prodVert>prodDiagSec && prodVert>prodHoriz && prodDiag<prodVert){
                        coordenadas[0]=fila;
                        coordenadas[1]=columna;
                    }
                }
                vAux=1;
                /**HALLAR MAYOR HORIZONTAL**/
                int hAux=1;
                for(int contador=columna;contador<(columna+4) && columna+3<matriz.length;contador++){
                    hAux*=matriz[fila][contador];
                    //System.out.print(contador!=(columna+3) && (columna+3)<matriz.length? matriz[fila][contador]+" x ":matriz[fila][contador]+" = "+hAux+"\n"); 
                }
                if(hAux>prodHoriz){
                    prodHoriz=hAux;
                    if(prodHoriz>prodDiagSec && prodVert<prodHoriz && prodDiag<prodHoriz){
                        coordenadas[0]=fila;
                        coordenadas[1]=columna;
                    }
                }
                hAux=1;
                /**HAYAR MAYOR DIAGONAL PRINCIPAL**/
                int dAux=1;
                for(int contador=0;contador<4 && fila+3<matriz[columna].length && columna+3<matriz.length;contador++){
                    dAux*=matriz[fila+contador][columna+contador];
                    //System.out.print(contador!=3  ? matriz[fila+contador][columna+contador]+" x ":matriz[fila+contador][columna+contador]+" = "+dAux+"\n");
                    //System.out.print(matriz[fila][columna]==matriz[16][16]? "LLEGÓ ("+fila+")("+columna+") "+matriz[16][16]:"");
                }

                if(dAux>prodDiag){
                    prodDiag=dAux;
                    if(prodDiag>prodDiagSec && prodDiag>prodHoriz && prodDiag>prodVert){
                        coordenadas[0]=fila;
                        coordenadas[1]=columna;
                    }
                }
                dAux=1;
                /**HAYAR MAYOR DIAGONAL SECUNDARIA**/
                int dsAux=1;
                for(int contador=0;contador<4 && fila+3<matriz[columna].length && columna<matriz.length && columna>=4;contador++){
                    dsAux*=matriz[fila+contador][columna-contador];
                    //System.out.print("("+fila+")("+columna+")");
                    //System.out.print(contador!=3  ? matriz[fila+contador][columna-contador]+" x ":matriz[fila+contador][columna-contador]+" = "+dsAux+"\n");
                    //System.out.print(matriz[fila][columna]==matriz[16][16]? "LLEGÓ ("+fila+")("+columna+") "+matriz[16][16]:"");
                }

                if(dsAux>prodDiagSec){
                    prodDiagSec=dsAux;
                    if(prodDiagSec>prodDiag && prodDiagSec>prodHoriz && prodDiagSec>prodVert){
                        coordenadas[0]=fila;
                        coordenadas[1]=columna;
                    }
                }
                dsAux=1;
            }

            //System.out.print(columna==matriz.length-1?"Si llego al final":"");
        }   
        System.out.println(" Coordenadas: ("+(coordenadas[0]+1)+")("+(coordenadas[1]+1)+")");
        System.out.println(" Valor: ("+matriz[coordenadas[0]][coordenadas[1]]+")");
        System.out.println("Mayor v: "+prodVert);
        System.out.println("Mayor h: "+prodHoriz);
        System.out.println("Mayor DP: "+prodDiag);
        System.out.println("Mayor DS: "+prodDiagSec);

    }
}
