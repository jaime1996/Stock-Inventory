package Gestor;

public class Alerta {
    private String mensaje;
    
    public void definirMensaje(int cantidad){
        if(cantidad>20){
            this.mensaje="alta disponiblidad";
        }
        if(cantidad<=20 && cantidad>=10){
            this.mensaje="disponiblidad media";
        }
        if(cantidad<10){
            this.mensaje="baja disponiblidad";
        }
    }
    
    public String getMensaje(){
        return mensaje;
    }
    
}
