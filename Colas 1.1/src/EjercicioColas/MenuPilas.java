/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EjercicioColas;
import java.util.Scanner;

/**
 *
 * @author Olivera Gutierrez Oscar Omar 
 */
public class MenuPilas {
    
    /** 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner sc = new Scanner(System.in);
    
    int Tope=0, opt;
    char tam[]=new char[26];
    
    do{
        System.out.println("             MENU");
        System.out.println("1.- Cola Manual");
        System.out.println("2.- Cola Abecedario");
        System.out.println("3.- Colas A y B");
        System.out.println("4.- Cola Abecedario Aleatorio");
        System.out.println("5.- Salir");
        System.out.println("------ Elije una opcion ------");
    switch (opt = sc.nextInt()) {
        
        
        
        case 1:
 
            do{
            System.out.println("          *Cola Manual*"
                    + "\n1.- Agregar\n"
                    + "2.- Mostrar\n"
                    + "3.- Eliminar\n"
                    + "4.- Llenar\n"
                    + "5.- Regresa al menu principal\n");
            switch(opt = sc.nextInt()){
                
                case 1:
                    if(Tope < 26){
                    System.out.println("Ingresa un letra:");
                    tam[Tope]=sc.next().charAt(0);
                    Tope++;
                    }else {System.out.println("Pila llena");}
                break;
                
                case 2:
                    if(Tope > 0){
                    for(int i= Tope - 1 ; i>=0 ; i--){
                        System.out.print(" "+tam[i]);
                    }}else {System.out.println("Pila vacia no hay datos para mostrar");}
                break;
                
                case 3:
                    if(Tope > 0){
                    System.out.println("Dato eliminado");
                    Tope--;
                    }else {System.out.println("Pila vacia no hay datos para borrar");}
                break;
                
                case 4:
                    if(Tope < 26){
                    System.out.println("Pila llenada");
                    for (int i = 0; Tope < 26 ; i++){
                        tam[Tope]=(char)('a'+i);
                        Tope++;
               }}
                   
            }
            }while(opt !=5);
            
        break;
        
//******************************************************************************
        
        case 2:
            
            do{
            System.out.println("         *Cola Abecedario*"
                    + "\n1.- Agregar\n"
                    + "2.- Mostrar\n"
                    + "3.- Eliminar\n"
                    + "4.- Llenar\n"
                    + "5.- Ordenar\n"
                    + "6.- Llenado aleatorio\n"
                    + "7.- Regresa al menu principal\n");
            
            switch(opt = sc.nextInt()){
                
                case 1:
                    if(Tope < 26){
                    System.out.println("Ingresa un letra:");
                    tam[Tope]=sc.next().charAt(0);
                    Tope++;
                    }else {System.out.println("Pila llena");}
                break;
                
                case 2:
                    if(Tope > 0){
                    for(int i= Tope - 1 ; i>=0 ; i--){
                        System.out.print(" "+tam[i]);
                    }}else {System.out.println("Pila vacia no hay datos para mostrar");}
                break;
                
                case 3:
                    if(Tope > 0){
                    System.out.println("Dato eliminado");
                    Tope--;
                    }else {System.out.println("Pila vacia no hay datos para borrar");}
                break;
                
                case 4:
                    if(Tope < 26){
                    System.out.println("Pila llenada");
                    for (int i = 0; Tope < 26 ; i++){
                        tam[Tope]=(char)('A'+i);
                        Tope++;
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
                    char Letras = 'A';
                    System.out.println("Pila llenada aleatoriamente"); 
                    for (int i = 0; i < 26; i++) {
                        if (Tope < 26) {
                            tam[Tope] = (char) (Letras + Math.random() * 26);
                            Tope++;
                }}
                break;
               
            } 
            }while(opt !=7);
            
        break;
        
//******************************************************************************
        
        case 3:
 
            System.out.println("          *Colas A y B*");

            System.out.println("ingresa el tamaño de la pila A y B");

            int Pilas = sc.nextInt();
            int[] Pila1 = new int[Pilas];
            int[] Pila2 = new int[Pilas];
            int[] Pila3 = new int[Pilas];

            int tope1 = 0;
            int tope2 = 0;
            int menu = 0;

            do {
            System.out.println("\n1 - Llenar pilas A y B\n"
                    + "2.- Mostrar pilas A y B\n"
                    + "3.- Vaciar pilas A y B \n"
                    + "4.- Unir pilas A y B \n"
                    + "5.- Mostrar pila C \n"
                    + "6.- Regresa al menu principal\n");

            switch (menu = sc.nextInt()) {
                case 1:
                    if (tope1 < Pilas) {
                        System.out.println("Las pilas A y B se han llenado");
                        for (int i = 0; tope1 < Pilas; i++) {
                            Pila1[tope1] = (int) (Math.random() * 100);
                            tope1++;
                        }}
                    if (tope2 < Pilas) {
                        for (int i = 0; tope2 < Pilas; i++) {
                            Pila2[tope2] = (int) (Math.random() * 100 + 100);
                            tope2++;
                        }}
                break;

                case 2:
                    System.out.println("\n Pila A: ");
                    for (int i = tope1 - 1; i >= 0; i--) {
                        System.out.print(" " + Pila1[i]);

                    }
                    System.out.println("\n Pila B: ");
                    for (int i = tope2 - 1; i >= 0; i--) {
                        System.out.print(" " + Pila2[i]);
                    }
                break;

                case 3:
                    System.out.println("Los datos de las pilas A y B han sido borrados");
                    for (int i = 0; i < Pilas; i++) {
                        tope1--;
                    }
                    for (int i = 0; i < Pilas; i++) {
                        tope2--;
                    }
                break;

                case 4:
                    System.out.println("Las pilas A y B se han unido\n");
                    for (int i = 0; i < Pilas; i++) {
                        int SumaPila1 = Pila1[i];
                        int SumaPila2 = Pila2[i];
                        int ResultadoSuma = SumaPila1 + SumaPila2;
                        Pila3[i] = ResultadoSuma;
                    }
                break;

                case 5:
                    System.out.println("Pila c");
                    for (int i = 0; i < Pilas; i++) {
                        System.out.print(" " + Pila3[i]);
                    }
                break;

            }
            }while (menu != 6);    
        
        break;

//******************************************************************************        
        
        case 4:
 
            do{
            System.out.println("     *Cola Abecedario Aleatorio*"
                    + "\n1.- Agregar\n"
                    + "2.- Mostrar\n"
                    + "3.- Eliminar\n"
                    + "4.- Llenar\n"
                    + "5.- Ordenar\n"
                    + "6.- Llenado aleatorio\n"
                    + "7.- Regresa al menu principal\n");
            
            switch(opt = sc.nextInt()){
                
                case 1:
                    if(Tope < 26){
                    System.out.println("Ingresa un letra:");
                    tam[Tope]=sc.next().charAt(0);
                    Tope++;
                    }else {System.out.println("Pila llena");}
                break;
                
                case 2:
                    if(Tope > 0){
                    for(int i= Tope - 1 ; i>=0 ; i--){
                        System.out.print(" "+tam[i]);
                    }}else {System.out.println("Pila vacia no hay datos para mostrar");}
                break;
                
                case 3:
                    if(Tope > 0){
                    System.out.println("Dato eliminado");
                    Tope--;
                    }else {System.out.println("Pila vacia no hay datos para borrar");}
                break;
                
                case 4:
                    if(Tope < 26){
                    System.out.println("Pila llenada");
                    for (int i = 0; Tope < 26 ; i++){
                        tam[Tope]=(char)('A'+i);
                        Tope++;
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
                    for(Tope = 0 ; Tope<26; Tope++ ){
                        tam[Tope]= (char)('A'+ Math.random()*26);
                            
                    for(int i=0 ; i<Tope; i++ ){
                        if (tam[Tope]==tam[i]){
                        Tope--;
                    }}}
                break; 
               
            }
        }while(opt !=7);
            
        break;
        
        
        
            }
        } while (opt != 5);
    }
}


