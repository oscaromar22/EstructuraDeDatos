/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EjercicioPilas;
import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class PilaCuatro {
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
                    + "5.- Ordenar\n"
                    + "6.- Llenado aleatorio\n"
                    + "7.- Salir\n");
            
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
                        tam[tope]=(char)('A'+i);
                        tope++;
               }}
               break;
                    
                case 5:
                    int Orden;
                    System.out.println("Pila ordenada");
                    for (int i = 0; i < 26; i++) {
                        for (int p = 0; p < i; p++) {
                            if (tam[i] < tam[p]) {
                                Orden = tam[i];
                                tam[i] = tam[p];
                                tam[p] = (char) Orden;
                }}}
                break;
                    
                case 6:
                    System.out.println("Pila llenada aleatoriamente"); 
                    for(tope = 0 ; tope<26; tope++ ){
                        tam[tope]= (char)('A'+ Math.random()*26);
                            
                    for(int i=0 ; i<tope; i++ ){
                        if (tam[tope]==tam[i]){
                        tope--;
                    }}}
                break; 
               
            }
        }while(opt !=7); 
         
    }
}

