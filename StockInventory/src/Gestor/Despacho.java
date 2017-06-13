package Gestor;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jaime
 */
public class Despacho {
    private char estadodespacho;
    private int ejecucion;
    
    public Despacho(char estadodespacho) {
        this.estadodespacho = estadodespacho;
    }
    
    public void efectuarDespacho(){
        if(estadodespacho=='d'){
            this.ejecucion=0;
        }
        if(estadodespacho=='n'){
            this.ejecucion=1;
        }
    } 
    public int getEjecucion(){
        return this.ejecucion;
    }
    
    
    
    
    
}
