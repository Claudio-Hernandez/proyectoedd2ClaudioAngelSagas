/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoedd2_claudioangesagas;

/**
 *
 * @author Usuario
 */
public class Llave {
    private String llave;
    private long byteoffset=0;
    private int tamanio;
    
    public Llave(){}

    public long getByteoffset() {
        return byteoffset;
    }

    public void setByteoffset(long byteoffset) {
        this.byteoffset = byteoffset;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
       public String getLlave() {
        return llave;
    }

    public void setLlave(String llave) {
        this.llave = llave;
    }
    
    
    
}
