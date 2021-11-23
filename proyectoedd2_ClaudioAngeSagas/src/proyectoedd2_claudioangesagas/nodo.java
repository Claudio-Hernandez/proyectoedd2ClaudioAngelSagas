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
public class nodo {
    nodo anterior =null;
    nodo siguiente = null;
    Llave dato;

    public Llave getDato() {
        return dato;
    }

    public void setDato(Llave dato) {
        this.dato = dato;
    }

   
    nodo (){
    
    }

    public nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(nodo anterior) {
        this.anterior = anterior;
    }

    public nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodo siguiente) {
        this.siguiente = siguiente;
    }
    
}
