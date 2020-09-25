/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EjercicioPilas;
import java.util.Scanner;

/**
 *
 * @author Olivera Gutierrez Oscar Omar. 
 */
public class PilaUno {
    public static void main (String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        int opt, tope=0;
        char tam[]=new char[26];
        
        System.out.println("     Pila Abecedario");
        
        do{
            System.out.println("\n1.- Agregar\n"
                    + "2.- Mostrar\n"
                    + "3.- Eliminar\n"
                    + "4.- Llenar\n"
                    + "5.- Salir\n");
            switch(opt = sc.nextInt()){
                
                case 1:
                    if(tope < 26){
                    System.out.println("Ingresa un letra:");
                    tam[tope]=sc.next().charAt(0);
                    tope++;
                    }else {System.out.println("Pila llena");}
                break;
                
                case 2:
                    if(tope > 0){
                    for(int i= tope - 1 ; i>=0 ; i--){
                        System.out.print(" "+tam[i]);
                    }}else {System.out.println("Pila vacia no hay datos para mostrar");}
                break;
                
                case 3:
                    if(tope > 0){
                    System.out.println("Dato eliminado");
                    tope--;
                    }else {System.out.println("Pila vacia no hay datos para borrar");}
                break;
                
                case 4:
                    if(tope < 26){
                    System.out.println("Pila llenada");
                    for (int i = 0; tope < 26 ; i++){
                        tam[tope]=(char)('a'+i);
                        tope++;
               }}
                   
            }
        }while(opt !=5); 
        
    }
}
