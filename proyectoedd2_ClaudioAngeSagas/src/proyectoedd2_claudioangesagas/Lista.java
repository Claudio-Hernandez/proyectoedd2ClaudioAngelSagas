/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoedd2_claudioangesagas;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Lista {

    int tamanio = 0;
    nodo cabeza = null;

    Lista() {

    }

    public nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(nodo cabeza) {
        this.cabeza = cabeza;
    }

    public nodo recupera(int pos) {
        nodo temp = cabeza;
        for (int i = 0; i < pos; i++) {
            if (temp.siguiente != null) {
                temp = temp.getSiguiente();
            }
        }
        return temp;

    }
    public void suprimir(int pos){
        if (pos==1) {
            cabeza = cabeza.getSiguiente();  
        }else if(pos >=finL()){
            JOptionPane.showMessageDialog(null, "No se pudo eliminar el elemento del availist");
        }else{
            nodo temp =  cabeza;
            for (int i = 0; i <= pos-2; i++) {
                temp =  temp.getSiguiente();
            }
            temp.getAnterior().setSiguiente(temp.getSiguiente());
          //  System.out.println(temp.getAnterior().dato+"    -----");
            
            temp.getSiguiente().setAnterior(temp.getAnterior());
            tamanio--;
        
        }
    
    }

    public void inserta(Llave dato, int posicion) {
        nodo temporal = cabeza;
        nodo nuevoAcrear = new nodo();
        nuevoAcrear.setDato(dato);
        if (cabeza == null) {
            cabeza = nuevoAcrear;
            tamanio++;

        } else if (posicion == 1) {
            temporal.setAnterior(nuevoAcrear);
            nuevoAcrear.setSiguiente(temporal);
            tamanio++;

        } else if (posicion == finL()) {
            int aux = 0;
            while (temporal != null) {
                if (temporal.getSiguiente() == null) {
                    temporal.setSiguiente(nuevoAcrear);
                    nuevoAcrear.setAnterior(temporal);
                    tamanio++;
                    aux = 1;

                }
                if (aux == 1) {
                    break;
                }
                temporal = temporal.getSiguiente();

            }

        } else {
            for (int i = 0; i < posicion - 2; i++) {
                temporal = temporal.getSiguiente();
            }
            nuevoAcrear.setSiguiente(temporal.getSiguiente());
            temporal.getSiguiente().setAnterior(nuevoAcrear);
            nuevoAcrear.setAnterior(temporal);
            temporal.setSiguiente(nuevoAcrear);
            tamanio++;

        }

    }

    int finL() {
        return tamanio + 1;
    }

    boolean estaVacia() {
        if (cabeza == null) {
            return true;
        } else {
            return false;
        }
    }

}
