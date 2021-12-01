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
public class NodoArbol {

    boolean esHoja;
    NodoArbol[] hijos;
    Llave[] llaves;
    int t;
    int numeroLLaves;

    public NodoArbol(boolean esHoja, int t) {
        this.esHoja = esHoja;
        this.t = t;
        llaves = new Llave[t - 1];
        llenarArreglo();
        hijos = new NodoArbol[t];
        numeroLLaves = 0;
    }

    public NodoArbol buscar(String llave) {
        int i = 0;

        while (i < numeroLLaves && comparo(llave, llaves[i].getLlave()).equals("Mayor")) {
            i++;
        }
        if (llaves[i].getLlave().equals(llave)) {
            return this;
        }
        if (esHojaf()) {
            return null;
        }
        return hijos[i].buscar(llave);

    }

    boolean esHojaf() {
        return esHoja;
    }

    public void llenarArreglo() {
        for (int i = 0; i < t - 1; i++) {
            llaves[i] = new Llave();
        }

    }

    public String comparo(String l1, String l2) {
        boolean x = true;
        int i = 0;
        if (l1.length() > l2.length()) {
            //   System.out.println("mayor");
            return "Mayor";
        } else if (l1.length() < l2.length()) {
            // System.out.println("menor2");
            return "Menor";
        }
        while (x) {
            if (l1.charAt(i) == l2.charAt(i)) {
                i++;
                if (i >= l1.length() || i >= l2.length()) {
                    //   System.out.println("iguales");
                    return "Iguales";
                }
            } else {
                if (l1.charAt(i) > l2.charAt(i)) {
                    // System.out.println("mayor");
                    return "Mayor";
                } else {
                    // System.out.println("menor2");
                    return "Menor";
                }
            }

        }
        String mensaje = "no se pudo comparar";
        //System.out.println(v);
        return mensaje;
    }

    public void insertarEnHoja(Llave nueva) {
        int i = numeroLLaves - 1;
        if (esHojaf()) {
            //System.out.println(llaves[i].getLlave() + "lol");
            String resultado = comparo(llaves[i].getLlave(), nueva.getLlave());
            //System.out.println(resultado);
            while (i >= 0 && resultado.equals("Mayor")) {

                llaves[i + 1] = llaves[i];
                i--;

            }
            llaves[i + 1] = nueva;
            numeroLLaves++;
        } else {
            while (i >= 0 && comparo(llaves[i].getLlave(), nueva.getLlave()).equals("Mayor")) {
                i--;
            }
            if (hijos[i + 1].numeroLLaves == (t - 1)) {
                hacerSplit(i + 1, hijos[i + 1], nueva);
                if (comparo(llaves[i + 1].getLlave(), nueva.getLlave()).equals("Menor")) {
                    i++;
                }
            }
            hijos[i + 1].insertarEnHoja(nueva);
        }

    }

    public void hacerSplit(int i, NodoArbol nuevo, Llave nuevallave) {
        NodoArbol nuevonodo = new NodoArbol(nuevo.esHojaf(), nuevo.getT());
        nuevonodo.setNumeroLlaves((t - 1) / 2);
        for (int j = 0; j < (t - 1) / 2; j++) {
            nuevonodo.getLlaves()[j] = nuevo.getLlaves()[j + t / 2];
        }
        if (!nuevo.esHojaf()) {
            for (int j = 0; j < (t / 2); j++) {
                nuevonodo.getHijos()[j] = nuevo.getHijos()[j + t / 2];
            }
        }
        nuevo.setNumeroLlaves(((t - 1) / 2));
        for (int j = numeroLLaves; j >= i + 1; j--) {
            hijos[j + 1] = hijos[j];
        }
        hijos[i + 1] = nuevonodo;
        for (int j = numeroLLaves - 1; j >= i; j--) {
            llaves[j + 1] = llaves[j];
        }
        llaves[i] = nuevo.getLlaves()[(t - 1) / 2];

        numeroLLaves++;
    }

    public void imprimir() {
        System.out.print("[");
        for (int i = 0; i < numeroLLaves; i++) {
            if (i < numeroLLaves - 1) {
                System.out.print(llaves[i].getLlave() + " | ");
            } else {
                System.out.print(llaves[i].getLlave());
            }
        }
        System.out.print("]");
    }

    public boolean isEsHoja() {
        return esHoja;
    }

    public void setEsHoja(boolean esHoja) {
        this.esHoja = esHoja;
    }

    public NodoArbol[] getHijos() {
        return hijos;
    }

    public void setHijos(NodoArbol[] hijos) {
        this.hijos = hijos;
    }

    public Llave[] getLlaves() {
        return llaves;
    }

    public void setLlaves(Llave[] llaves) {
        this.llaves = llaves;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    public int getNumeroLlaves() {
        return numeroLLaves;
    }

    public void setNumeroLlaves(int numerohijo) {
        this.numeroLLaves = numerohijo;
    }

    public String nodoString() {
        String nodo = "[";
        for (int i = 0; i < llaves.length; i++) {
            nodo += llaves[i].getLlave() + ",";
        }
        nodo += "]";
        return nodo;

    }

    public String toStrinNodo() {
        return nodoString();
    }

}
