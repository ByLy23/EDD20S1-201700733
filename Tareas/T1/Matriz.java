/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete;

/**
 *
 * @author byron
 */
public class Matriz {
    public Matriz(){
    }
    public void hacerMatriz( int fila, int columna){
        String[][] numero;
        numero= new String[fila][columna];
        int pivoteFila=0;
        int pivoteColumna=0;
        numero= ColocarCero(fila,columna);
        for (int i = 0; i < fila; i++) {
            pivoteFila=i;
            numero[pivoteFila][pivoteColumna]="  1  ";
        }
        for (int i = 0; i < columna; i++) {
            pivoteColumna=i;
            numero[pivoteFila][pivoteColumna]="  1  ";
        }
        for (int i = pivoteFila; i >= 0; i--) {
            pivoteFila=i;
            numero[pivoteFila][pivoteColumna]="  1  ";
        }
        for (int i = pivoteColumna; i >= 0; i--) {
            pivoteColumna=i;
            numero[pivoteFila][pivoteColumna]="  1  ";
        }
        imprimir(numero,fila,columna);
    }
    private void imprimir(String[][] num, int fila, int columna){
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print(num[i][j]);
            }
            System.out.println("");
        }
    }
    private String[][] ColocarCero(int fila, int columna){
       String[][] num= new String[fila][columna];
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                num[i][j]= "  0  ";
            }
        }
       return num;
    }
}
