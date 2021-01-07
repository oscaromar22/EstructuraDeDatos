/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PilasYColas;

import java.util.Scanner;

/**
 *
 * @author Olivera Gutierrez Oscar Omar.
 */
public class Nodos {

    Scanner sc = new Scanner(System.in);

    static class Nodo {

        String Dato;
        Nodo sig;
    }

    Nodo fin = null;

    public void Agregar() {
        Nodo temp;
        String msg;
        System.out.println("\nIngresa el dato ");
        if (fin == null) {
            fin = new Nodo();
            fin.Dato = sc.nextLine();
            fin.sig = null;
        } else {
            temp = new Nodo();
            temp.Dato = sc.nextLine();
            temp.sig = fin;
            fin = temp;
        }
    }

    public void Mostrar() {
        Nodo actual = new Nodo();
        actual = fin;
        if (fin != null) {
            while (actual != null) {
                System.out.print("\nDato " + "[" + actual.Dato + "]");
                actual = actual.sig;
            }
        } else {
            System.out.println("\nLa lista se encuentra vacia\n");
        }
    }

    public void Eliminar() {
        Nodo eliminar = new Nodo();
        eliminar = fin.sig;
        fin = eliminar;
        System.out.println("\nDato eliminado ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt = 0;
        String Dato;
        Nodos n = new Nodos();
        do {
            System.out.println("\n1 Agregar \n"
                    + "2 Mostrar \n"
                    + "3 Eliminar \n"
                    + "4 Salir");
            switch (opt = sc.nextInt()) {
                case 1:
                    n.Agregar();
                    break;

                case 2:
                    n.Mostrar();
                    break;
 
                case 3:
                    n.Eliminar();
                    break;
            }
        } while (opt != 4);
    }

}
