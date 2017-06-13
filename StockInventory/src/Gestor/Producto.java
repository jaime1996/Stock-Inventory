package Gestor;

public class Producto {
    private String marca;
    private String descripcion;
    private int cantidad;
    //private Alerta alerta1;

    

    public Producto(String marca,String descripcion,int cantidad){
        this.marca=marca;
        this.descripcion=descripcion;
        this.cantidad=cantidad;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    /*public void agregarCantidad(int cantidad) {
        this.cantidad = this.cantidad+cantidad;
    }*/
    public void restarCantidad(int cantidad,int ejecucion){
        if(ejecucion==0)
        {
            this.cantidad=this.cantidad-cantidad;
        }
        
        
    }
    public String toString() {
        return marca+" "+descripcion;
    }


    public int getCantidad() {
        return this.cantidad;
    }
    /*public String mensaje(){
        alerta1=new Alerta();
        alerta1.definirMensaje(this.cantidad);
        return alerta1.getMensaje();
    
    }
    
    public void getMensaje(){
        System.out.println(mensaje());
    }*/
    
    
    
    
    
}
