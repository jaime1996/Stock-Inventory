package Gestor;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jaime
 */
public class Proveedor {

    private String nombreProveedor;
    private String rutProveedor;
    //private int cantidad;
    //private char miretiro;
    //private Despacho despacho;

    private Producto miproducto;

    public Proveedor(String nombreProveedor, String rutProveedor) {
        this.nombreProveedor = nombreProveedor;
        this.rutProveedor = rutProveedor;

        //this.cantidad=cantidad;
    }

    /*public Proveedor(String Nombrecliente, double rutcliente,int cantidad,char miretiro){
        this.Nombrecliente = Nombrecliente;
        this.rutcliente = rutcliente;
        this.cantidad=cantidad;
        this.miretiro=miretiro;
    }
    public int getCantidad(){
        return cantidad;
    }*/
    public void asociarProducto(Producto miprod) {

        this.miproducto = miprod;
    }

    public Producto getProducto() {
        return miproducto;
    }
    public String toString(){
        return nombreProveedor+" "+rutProveedor;
    }
    /*public int retiro(){
        despacho=new Despacho(this.miretiro);
        return despacho.getEjecucion();
        
    }*/
}
