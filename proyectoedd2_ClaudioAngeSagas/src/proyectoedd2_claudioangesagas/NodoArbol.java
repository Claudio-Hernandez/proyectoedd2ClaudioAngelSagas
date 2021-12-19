/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoedd2_claudioangesagas;

import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class NodoArbol {

     private int nLlaves;
    private Llave[] llaves;
    private boolean esHoja;
    private NodoArbol[] hijos;
    private int t;

    private static final long SerialVersionUID = 1008l;

    public NodoArbol(int orden, boolean leaf) {
        this.esHoja = leaf;
        this.t = orden;
        this.llaves = new Llave[t - 1];
        llenarArreglo();
        this.hijos = new NodoArbol[t];
        this.nLlaves = 0;
    }

    private void llenarArreglo() {
        for (int i = 0; i < t - 1; i++) {
            llaves[i] = new Llave();
        }
    }

    public int getnLlaves() {
        return nLlaves;
    }

    public void setnLlaves(int nLlaves) {
        this.nLlaves = nLlaves;
    }

    public boolean isEsHoja() {
        return esHoja;
    }

    public void setEsHoja(boolean esHoja) {
        this.esHoja = esHoja;
    }

    public Llave[] getLlaves() {
        return llaves;
    }

    public void setLlaves(Llave[] llaves) {
        this.llaves = llaves;
    }

    public NodoArbol[] getHijos() {
        return hijos;
    }

    public void setHijos(NodoArbol[] hijos) {
        this.hijos = hijos;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
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

    private int encontrarLlave(Llave k) {
        int index = 0;
        while (index < nLlaves && compararLlaves(llaves[index].getLlave(), k.getLlave()).equals("Menor")) {
            index++;
        }
        return index;
    }

    public void remove(Llave k) {
        int index = encontrarLlave(k);

        if (index < nLlaves && llaves[index].getLlave().equals(k.getLlave())) {

            if (esHoja) {
                removerDeHoja(index);
            } else {
                removerDeUnaHoja(index);
            }
        } else {

            if (!esHoja) {
                boolean flag = false;
                if (index == nLlaves) {
                    flag = true;
                }

                if (hijos[index].getnLlaves() < (t / 2)) {
                    llenar(index);
                }

                if (flag && index > nLlaves) {
                    hijos[index - 1].remove(k);
                } else {
                    hijos[index].remove(k);
                }
            }
        }
    }

    private void removerDeHoja(int index) {
        for (int i = index + 1; i < nLlaves; i++) {
            llaves[i - 1] = llaves[i];
        }
        nLlaves--;
    }

    private void removerDeUnaHoja(int index) {
        Llave k = llaves[index];

        if (hijos[index].getnLlaves() >= (t / 2)) {
            Llave pred = llaveAnterior(index);
            llaves[index] = pred;
            hijos[index].remove(pred);
        } else {
            if (hijos[index + 1].getnLlaves() >= (t / 2)) {
                Llave succ = llaveSiguiente(index);
                llaves[index] = succ;
                hijos[index + 1].remove(succ);
            } else {

                hacerMerge(index);
                hijos[index].remove(k);
            }
        }
    }

    private Llave llaveAnterior(int index) {
        NodoArbol cur = hijos[index];
        while (!cur.isEsHoja()) {
            cur = cur.getHijos()[cur.getnLlaves()];
        }
        return cur.getLlaves()[cur.getnLlaves() - 1];
    }

    private Llave llaveSiguiente(int index) {
        NodoArbol cur = hijos[index + 1];
        while (!cur.isEsHoja()) {
            cur = cur.getHijos()[0];
        }
        return cur.getLlaves()[0];
    }

    private void llenar(int index) {
        if (index != 0 && hijos[index - 1].getnLlaves() >= (t / 2)) {
            borrowFromPrev(index);
        } else {
            if (index != nLlaves && hijos[index + 1].getnLlaves() >= (t / 2)) {
                tomarDeSiguiente(index);
            } else {
                if (index != nLlaves) {
                    hacerMerge(index);
                } else {
                    hacerMerge(index - 1);
                }
            }
        }
    }

    private void borrowFromPrev(int index) {
        NodoArbol child = hijos[index];
        NodoArbol sibling = hijos[index - 1];

        for (int i = child.getnLlaves() - 1; i >= 0; i--) {
            child.getLlaves()[i + 1] = child.getLlaves()[i];
        }

        if (!child.isEsHoja()) {
            for (int i = child.getnLlaves(); i >= 0; i--) {
                child.getHijos()[i + 1] = child.getHijos()[i];
            }
        }

        child.getLlaves()[0] = llaves[index - 1];

        if (!child.isEsHoja()) {
            child.getHijos()[0] = sibling.getHijos()[sibling.getnLlaves()];
        }

        llaves[index - 1] = sibling.getLlaves()[sibling.getnLlaves() - 1];

        child.setnLlaves(child.getnLlaves() + 1);
        sibling.setnLlaves(sibling.getnLlaves() - 1);
    }

    private void tomarDeSiguiente(int index) {
        NodoArbol hijo = hijos[index];
        NodoArbol hermanos = hijos[index + 1];

        hijo.getLlaves()[hijo.getnLlaves()] = llaves[index];

        if (!hijo.isEsHoja()) {
            hijo.getHijos()[hijo.getnLlaves() + 1] = hermanos.getHijos()[0];
        }

        llaves[index] = hermanos.getLlaves()[0];

        for (int i = 1; i < hermanos.getnLlaves(); i++) {
            hermanos.getLlaves()[i - 1] = hermanos.getLlaves()[i];
        }

        if (!hermanos.isEsHoja()) {
            for (int i = 1; i <= hermanos.getnLlaves(); i++) {
                hermanos.getHijos()[i - 1] = hermanos.getHijos()[i];
            }
        }

        hijo.setnLlaves(hijo.getnLlaves() + 1);
        hermanos.setnLlaves(hermanos.getnLlaves() - 1);
    }

    private void hacerMerge(int index) {
        NodoArbol hijo = hijos[index];
        NodoArbol hermanos = hijos[index + 1];

        hijo.getLlaves()[t / 2 - 1] = llaves[index];

        for (int i = 0; i < hermanos.getnLlaves(); i++) {
            hijo.getLlaves()[i + t / 2] = hermanos.getLlaves()[i];
        }

        if (!hijo.isEsHoja()) {
            for (int i = 0; i <= hermanos.getnLlaves(); i++) {
                hijo.getHijos()[i + t / 2] = hermanos.getHijos()[i];
            }
        }

        for (int i = index + 1; i < nLlaves; i++) {
            llaves[i - 1] = llaves[i];
        }

        for (int i = index + 2; i <= nLlaves; i++) {
            hijos[i - 1] = hijos[i];
        }

        hijo.setnLlaves(hijo.getnLlaves() + hermanos.getnLlaves() + 1);
        nLlaves--;
    }

    public void insertNonFull(Llave k) {
        int i = nLlaves - 1;
        if (esHoja) {
            while (i >= 0 && compararLlaves(llaves[i].getLlave(), k.getLlave()).equals("Mayor")) {
                llaves[i + 1] = llaves[i];
                i--;
            }
            llaves[i + 1] = k;
            nLlaves++;
        } else {
            while (i >= 0 && compararLlaves(llaves[i].getLlave(), k.getLlave()).equals("Mayor")) {
                i--;
            }

            if (hijos[i + 1].getnLlaves() == (t - 1)) {

                splitHijo(i + 1, hijos[i + 1]);
                if (compararLlaves(llaves[i + 1].getLlave(), k.getLlave()).equals("Menor")) {
                    i++;
                }
            }
            hijos[i + 1].insertNonFull(k);
        }
    }

    public void splitHijo(int i, NodoArbol y) {
        NodoArbol z = new NodoArbol(y.getT(), y.isEsHoja());
        z.setnLlaves((t - 1) / 2);

        for (int j = 0; j < (t - 1) / 2; j++) {
            z.getLlaves()[j] = y.getLlaves()[j + t / 2];
        }

        if (!y.isEsHoja()) {
            for (int j = 0; j < (t / 2); j++) {
                z.getHijos()[j] = y.getHijos()[j + t / 2];
            }
        }

        y.setnLlaves(((t - 1) / 2));

        for (int j = nLlaves; j >= i + 1; j--) {
            hijos[j + 1] = hijos[j];
        }

        hijos[i + 1] = z;

        for (int j = nLlaves - 1; j >= i; j--) {
            llaves[j + 1] = llaves[j];
        }

        llaves[i] = y.getLlaves()[(t - 1) / 2];

        nLlaves++;
    }

    public NodoArbol buscar(Llave k) {
        int i = 0;
        while (i < nLlaves && compararLlaves(k.getLlave(), llaves[i].getLlave()).equals("Mayor")) {
            i++;
        }
        if (llaves[i].getLlave().equals(k.getLlave())) {
            return this;
        }
        if (esHoja) {
            return null;
        }
        return hijos[i].buscar(k);
    }

    public Llave[] traverse() {
        int i;
        int pos = 0;
        Llave[] llaves = new Llave[10];
        for (i = 0; i < nLlaves; i++) {
            if (!esHoja) {
                hijos[i].traverse();
            }
            if (pos <= 9) {
                llaves[pos] = this.llaves[i];
                pos++;
            }

            if (pos > 9 || i == nLlaves - 1) {
                return llaves;
            }
        }
        if (!esHoja) {
            hijos[i].traverse();
        }
        return llaves;
    }

    @Override
    public String toString() {
        return "{keys=" + Arrays.toString(llaves) + ", children=" + Arrays.toString(hijos) + '}';
    }

}
