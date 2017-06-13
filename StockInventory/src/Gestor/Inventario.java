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
public class Inventario {
    private ArrayList<Producto> productos;
    
    
    public Inventario(){
        
        this.productos=new ArrayList<Producto>();
    }
    public void agregarProducto(String marca,String descripcion,int cantidad){
        Producto producto=new Producto(marca,descripcion,cantidad);
        productos.add(producto);
    }
    public void eliminarProducto(int index){
        productos.remove(index);
    }
    
    public Producto getProducto(int index){
        return(Producto)productos.get(index);
    }
    public int retDimension(){
        return productos.size();
    }
    
}
