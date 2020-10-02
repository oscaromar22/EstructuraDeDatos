/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EjercicioPilas;
import java.util.Scanner;

/**
 *
 * @author Olivera Gutierrez Oscar Omar
 */
public class PilaTres {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("          Suma De Pilas");

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
                    + "6.- salir\n");

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
        } while (menu != 6);

    }

}
