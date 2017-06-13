package archivo;

import java.io.*;

public class GestorArchivo {

     RandomAccessFile arch;

    public GestorArchivo() throws Exception {
        arch = new RandomAccessFile("archivo.txt", "rw");
    }
    
    public void escribir(String nombre, String rut) throws Exception {
        arch.seek(arch.length());
        arch.writeBytes(""+nombre+" "+rut+"\r\n");

        arch.close();
    }

    public String leer() throws Exception {
        int cont = 0;
        String Leer;
        String ret="";

        while ((Leer = arch.readLine()) != null) {
            cont++;
            ret=Leer+ret;
        }
        arch.close();
        return ret;    
    }

}

