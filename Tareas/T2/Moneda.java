/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete;

import java.util.LinkedList;

/**
 *
 * @author byron
 */
public class Moneda {
    String duenio;
    int cantidad;
    String nombreMoneda;
    LinkedList<Moneda> monedas= new LinkedList<Moneda>();
    public Moneda(){
        duenio="";
        cantidad=0;
        nombreMoneda="Astros";
    }
    public Moneda(int cantidad, String duenio){
        this.cantidad=cantidad;
        this.duenio=duenio;
        nombreMoneda="Astros";
    }
    public void agregarDuenio(String duenio, int cantidad){
        monedas.add(new Moneda(cantidad,duenio));
    }
    public void transferenciaCaja(String comprador, String vendedor, int cantidad){
       for(Moneda vari: monedas){
           if(vari.duenio.equals(comprador)){
               vari.cantidad= vari.cantidad+cantidad;
           }
           if(vari.duenio.equals(vendedor)){
               vari.cantidad= vari.cantidad-cantidad;
           }
       }
    }
    public void imprimir(){
        for(Moneda ar: monedas){
            System.out.println(ar.duenio+" Tiene "+ar.cantidad+" "+ar.nombreMoneda);
        }
    }
    public void transferenciaFrom(String vendedor, String comprador){
        int resto=0;
       for( Moneda ari: monedas){
           if (ari.duenio.equals(vendedor)) {
               resto=ari.cantidad;
               ari.cantidad=0;
           }
           if(ari.duenio.equals(comprador)){
               ari.cantidad= ari.cantidad+resto;
           }
       }        
       
    }
    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombreMoneda() {
        return nombreMoneda;
    }

    public void setNombreMoneda(String nombreMoneda) {
        this.nombreMoneda = nombreMoneda;
    }
    
    
}
