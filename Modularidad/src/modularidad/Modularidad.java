/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modularidad;
import java.util.Scanner;


/**
 *
 * @author Olivera Gutierrez Oscar Omar
 */

public class Modularidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in); //Utilizamos scanner para leer las variables//

        double Lado1, Lado2, Lado3; //Declaramos nuestras variables//

        
        System.out.print("      **Identificador de triangulos** \n\n"); //Titulo para el programa//
        
        System.out.print("Valor del primer lado:"); //Imprime y lee la variable "Lado1"//
        Lado1 = leer.nextDouble();

        System.out.print("Valor del sgundo lado:"); //Imprime y lee la variable "Lado2"//
        Lado2 = leer.nextDouble();

        System.out.print("Valor del tercer lado:"); //Imprime y lee la variable "Lado3"//
        Lado3 = leer.nextDouble();
        
        
        if (Lado1 == Lado2 && Lado1 == Lado3) { //Primera condicion//
            ResultadoTrianguloEquilatero();
        } 
        
        if (Lado1 == Lado2 && Lado1 != Lado3) { //Segunda Condicion//
            ResultadoTrianguloIsoceles(); 
        }
        
        if (Lado1 != Lado2 && Lado1 != Lado3) { //Tercera Condicion//
            ResultadoTrianguloEscaleno(); 
        }  
    }

    
    public static void ResultadoTrianguloEquilatero() {     //Imprime el mensaje en caso de cumplir 
        System.out.print("\nEl triangulo es Equilatero\n");}  //con la primera condicion
    

    public static void ResultadoTrianguloIsoceles() {       //Imprime el mensaje en caso de cumplir
        System.out.print("\nEl triangulo es Isoceles\n");}    //con la segunda condicion
    

    public static void ResultadoTrianguloEscaleno() {       //Imprime el mensaje en caso de cumplir
        System.out.print("\nEl triangulo es Escaleno\n");}    //con la tercera condicion

}
