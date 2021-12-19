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
public class Arbol {
   private NodoArbol raiz;
    private int grado;
  

    public Arbol(int orden) {
        this.raiz = null;
        this.grado = orden;
    }

    public NodoArbol getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoArbol raiz) {
        this.raiz = raiz;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public void traverse() {
        if (raiz != null) {
            raiz.traverse();
        }
    }

    public NodoArbol buscar(Llave k) {
        if (raiz == null) {
            return null;
        } else {
            return raiz.buscar(k);
        }
    }

    public void insertar(Llave k) {
        if (raiz == null) {
            raiz = new NodoArbol(grado, true);
            raiz.getLlaves()[0] = k;
            raiz.setnLlaves(1);
        } else {
            if (raiz.getnLlaves() == (grado - 1)) {
                NodoArbol s = new NodoArbol(grado, false);
                s.getHijos()[0] = raiz;
                s.splitHijo(0, raiz);
                int i = 0;
                if (compararLlaves(s.getLlaves()[0].getLlave(), k.getLlave()).equals("Menor")) {
                    i++;
                }
                s.getHijos()[i].insertNonFull(k);
                raiz = s;
            } else {
                raiz.insertNonFull(k);
            }
        }
    }

    public void remover(Llave k) {
        if (raiz == null) {
            JOptionPane.showMessageDialog(null, "No hay registros", "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            raiz.remove(k);
            if (raiz.getnLlaves() == 0) {
                if (raiz.isEsHoja()) {
                    raiz = null;
                } else {
                    raiz = raiz.getHijos()[0];
                }
            }
        }
    }

    public String compararLlaves(String dato1, String dato2) {
        boolean sigue = true;
        int i = 0;
        if (dato1.length() > dato2.length()) {
            return "Mayor";
        }
        if (dato1.length() < dato2.length()) {
            return "Menor";
        }
        while (sigue) {
            if (dato1.charAt(i) == dato2.charAt(i)) {
                i++;
                if (i >= dato1.length() || i >= dato2.length()) {
                    return "Iguales";
                }
            } else {
                if (dato1.charAt(i) > dato2.charAt(i)) {
                    return "Mayor";
                } else {
                    return "Menor";
                }
            }

        }
        return "";
    }

    @Override
    public String toString() {
        return "BTree[" + "\nraiz=" + raiz + "\n]";
    }
    
}
