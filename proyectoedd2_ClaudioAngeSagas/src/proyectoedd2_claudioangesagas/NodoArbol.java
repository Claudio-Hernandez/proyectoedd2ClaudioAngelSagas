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
             nuevo.getLlaves()[j + t / 2]=null;
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
        nuevo.getLlaves()[(t - 1) / 2]=null;

        numeroLLaves++;
    } 
    private int posKeyIndice(Llave llaveParam) {
        int index = 0;
       // System.out.println(numeroLLaves);
        while (index < numeroLLaves && comparo(llaves[index].getLlave(), llaveParam.getLlave()).equals("Menor")) {
            index++;
           
        }
        System.out.println(index);
        return index;
    }

    public void removerllave(Llave k) {
        int index = posKeyIndice(k);
       // System.out.println(index);
        if (index < numeroLLaves && llaves[index].getLlave().equals(k.getLlave())) {

            if (esHojaf()) {
                System.out.println("ccc");
                remuevodeHoja(index);
            } else {
                remuevodenoHoja(index);
            }
        } else {

            if (!esHojaf()) {
                
                System.out.println("vaaaa");
                boolean flag = false;
                if (index == numeroLLaves) {
                    flag = true;
                }

                if (hijos[index].getNumeroLlaves()< (t / 2)) {
                   // System.out.println("v");
                    llenar(index);
                }

                if (flag && index > numeroLLaves) {
                    hijos[index - 1].removerllave(k);
                } else {
                   System.out.println("c");
                    //System.out.println(index);
                    hijos[index].removerllave(k);
                }
            }
        }
    }

    private void remuevodeHoja(int index) {
        System.out.println(index);
        if ((index+1)==numeroLLaves) {
            llaves[index] =null;
        }else{
            for (int i = index + 1; i < numeroLLaves; i++) {
            System.out.println("c2");
            llaves[i - 1] = llaves[i];
        }
        }
        if (llaves[index] ==null) {
            System.out.println("se elimino");
        }
        //System.out.println(llaves[index].getLlave());
        numeroLLaves--;
    }

    private void remuevodenoHoja(int index) {
        Llave llavenueva = llaves[index];

        if (hijos[index].getNumeroLlaves()>= (t / 2)) {
            Llave llaveAnterior = get_pred_child(index);
            llaves[index] = llaveAnterior;
            hijos[index].removerllave(llaveAnterior);
        } else {
            if (hijos[index + 1].getNumeroLlaves()>= (t / 2)) {
                Llave siguiente = getsuccess_child(index);
                llaves[index] = siguiente;
                hijos[index + 1].removerllave(siguiente);
            } else {

                hacerMerge(index);
                hijos[index].removerllave(llavenueva);
            }
        }
    }

    private Llave get_pred_child(int index) {
        NodoArbol actual = hijos[index];
        while (!actual.esHojaf()) {
            actual = actual.getHijos()[actual.getNumeroLlaves()];
        }
        return actual.getLlaves()[actual.getNumeroLlaves()- 1];
    }

    private Llave getsuccess_child(int index) {
        NodoArbol actual = hijos[index + 1];
        while (!actual.esHojaf()) {
            actual = actual.getHijos()[0];
        }
        return actual.getLlaves()[0];
    }

    private void llenar(int index) {
        if (index != 0 && hijos[index - 1].getNumeroLlaves()>= (t / 2)) {
            tomardeAnterior(index);
        } else {
            if (index != numeroLLaves && hijos[index + 1].getNumeroLlaves()>= (t / 2)) {
                tomardesiguiente(index);
            } else {
                if (index != numeroLLaves) {
                    hacerMerge(index);
                } else {
                    hacerMerge(index - 1);
                }
            }
        }
    }

    private void tomardeAnterior(int index) {
        NodoArbol sibling_node = hijos[index - 1];
        NodoArbol hijo = hijos[index];
        
        for (int i = hijo.getNumeroLlaves()- 1; i >= 0; i--) {
            hijo.getLlaves()[i + 1] = hijo.getLlaves()[i];
        }

        if (!hijo.esHojaf()) {
            for (int i = hijo.getNumeroLlaves(); i >= 0; i--) {
                hijo.getHijos()[i + 1] = hijo.getHijos()[i];
            }
        }

        hijo.getLlaves()[0] = llaves[index - 1];

        if (!hijo.esHojaf()) {
            hijo.getHijos()[0] = sibling_node.getHijos()[sibling_node.getNumeroLlaves()];
        }

        llaves[index - 1] = sibling_node.getLlaves()[sibling_node.getNumeroLlaves()- 1];

        hijo.setNumeroLlaves(hijo.getNumeroLlaves()+ 1);
        sibling_node.setNumeroLlaves(sibling_node.getNumeroLlaves()- 1);
    }

    private void tomardesiguiente(int index) {
        NodoArbol hijo = hijos[index];
        NodoArbol hermano = hijos[index + 1];

        hijo.getLlaves()[hijo.getNumeroLlaves()] = llaves[index];

        if (!hijo.esHojaf()) {
            hijo.getHijos()[hijo.getNumeroLlaves()+ 1] = hermano.getHijos()[0];
        }

        llaves[index] = hermano.getLlaves()[0];

        for (int i = 1; i < hermano.getNumeroLlaves(); i++) {
            hermano.getLlaves()[i - 1] = hermano.getLlaves()[i];
           hermano.getLlaves()[i]=null;
        }

        if (!hermano.esHojaf()) {
            for (int i = 1; i <= hermano.getNumeroLlaves(); i++) {
                hermano.getHijos()[i - 1] = hermano.getHijos()[i];
            }
        }

        hijo.setNumeroLlaves(hijo.getNumeroLlaves()+ 1);
        hermano.setNumeroLlaves(hermano.getNumeroLlaves()- 1);
    }

    private void hacerMerge(int index) {
        NodoArbol hijo = hijos[index];
        NodoArbol sibling = hijos[index + 1];
              //  System.out.println( hijo.getLlaves()[t / 2 - 1].getLlave()+"fff");

        hijo.getLlaves()[t / 2 - 1] = llaves[index];

        for (int i = 0; i < sibling.getNumeroLlaves(); i++) {
            hijo.getLlaves()[i + t / 2] = sibling.getLlaves()[i];
        }

        if (!hijo.esHojaf()) {
            for (int i = 0; i <= sibling.getNumeroLlaves(); i++) {
                hijo.getHijos()[i + t / 2] = sibling.getHijos()[i];
            }
        }

        for (int i = index + 1; i < numeroLLaves; i++) {
            llaves[i - 1] = llaves[i];
           llaves[i]=null;
        }

        for (int i = index + 2; i <= numeroLLaves; i++) {
            hijos[i - 1] = hijos[i];
        }

        hijo.setNumeroLlaves(hijo.getNumeroLlaves()+ sibling.getNumeroLlaves()+ 1);
        numeroLLaves--;
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
            if (llaves[i]==null) {
                
            }else{
                //System.out.println(i);
                nodo += llaves[i].getLlave() + ",";
                //System.out.println(nodo);
            }
          
        }
        nodo += "]";
        return nodo;

    }

    public String toStrinNodo() {
        return nodoString();
    }

}
