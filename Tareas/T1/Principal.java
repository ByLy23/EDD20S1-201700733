/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete;

import java.util.Scanner;

/**
 *
 * @author byron
 */
public class Principal {
    public static void main(String[] args){
        Matriz matriz= new Matriz();
        int salir=0;
        do{
        Scanner filas= new Scanner(System.in);
        System.out.println("Ingrese Tamanio de la fila");
        int fila= filas.nextInt();
        System.out.println("Ingrese Tamanio de la columna");
        int columna= filas.nextInt();
        matriz.hacerMatriz(fila,columna);
            System.out.println("Presione 2 para salir");
         salir= filas.nextInt();
        }while(salir!=2);
        
    }
}
