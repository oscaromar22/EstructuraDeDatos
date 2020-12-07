/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodos;

import java.util.Scanner;

/**
 *
 * @author Olivera Gutierrez Oscar Omar
 */
public class NodoDos {
    
 Scanner sc = new Scanner(System.in);
    
    static class Nodo {
        String dato;
        Nodo sig;
    }
    
    Nodo fin = null;

    
    public void Agregar() {
        Nodo temp;
        String msg;
        System.out.println("Ingresa el dato ");
        if (fin == null) {
            fin = new Nodo();
            fin.dato = sc.nextLine();
            fin.sig = null;
        } else {
            temp = new Nodo();
            temp.dato = sc.nextLine();
            temp.sig = fin;
            fin = temp;
        }
    }

    
    public void Mostrar() {
        Nodo actual = new Nodo();
        actual = fin;
        if (fin != null) {
            while (actual != null) {
                System.out.print(" DATO " + "[" + actual.dato + "]");
                actual = actual.sig;
            }
        } else {
            System.out.println("\n La lista se encuentra vacia\n");
        }
    }

    public void EliminarUltimoDato(){
        if(fin!=null){
            System.out.println(" Dato eliminado ");
            fin=(Nodo) fin.sig;
       }else{
            System.out.println(" No hay datos para eliminar ");
       }}
 
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt = 0;
        String dato;
        NodoDos n = new NodoDos();
        do {
            System.out.println("1 Agregar Dato \n"
                    + "2 Mostrar \n"
                    + "3 Eliminar ultimo dato \n"
                    + "4 salir");
            switch (opt = sc.nextInt()) {
                case 1:
                    n.Agregar();
                    break;

                case 2:
                    n.Mostrar();
                    break;
                    
                case 3:
                    n.EliminarUltimoDato();
                    break;
                     
            }
        } while (opt != 4);
    }
}
