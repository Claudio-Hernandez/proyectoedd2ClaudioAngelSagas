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
public class Arbol {
    NodoArbol raiz;
    int grado = 4;

    public Arbol() {
    }

    public Arbol(NodoArbol raiz, int grado) {
        this.raiz = raiz;
        this.grado = grado;
    }
    public void intertar(Llave nueva){
        if (raiz==null) {
            raiz = new NodoArbol(true,grado);
            raiz.getLlaves()[0] =  nueva;
            raiz.setNumeroLlaves(1);
            
        }else if(raiz.getNumeroLlaves()==(grado-1)){
            NodoArbol asubir = new NodoArbol(false,grado);
                asubir.getHijos()[0] = raiz;
                asubir.hacerSplit(0, raiz,nueva);
                int i = 0;
                if (comparoLLave(asubir.getLlaves()[0].getLlave(), nueva.getLlave()).equals("Menor")) {
                    i++;
                }
                asubir.getHijos()[i].insertarEnHoja(nueva);
                raiz = asubir;
        
        }else{
          raiz.insertarEnHoja(nueva);
        
        }
    
    }
    public NodoArbol buscar(String llave){
        if (raiz ==null) {
            return null;
        }else{
        
        return raiz.buscar(llave);
        }
    
    }
   public String comparoLLave(String llave1, String llave2) {
        boolean sigue = true;
        int i = 0;
        if (llave1.length() > llave2.length()) {
            return "Mayor";
        }
        if (llave1.length() < llave2.length()) {
            return "Menor";
        }
        while (sigue) {
            if (llave1.charAt(i) == llave2.charAt(i)) {
                i++;
                if (i >= llave1.length() || i >= llave2.length()) {
                    return "Iguales";
                }
            } else {
                if (llave1.charAt(i) > llave2.charAt(i)) {
                    return "Mayor";
                } else {
                    return "Menor";
                }
            }

        }
        return "No se pudo procesar";
    }
    public void imprimir(){    
        for (int i = 0; i < raiz.getLlaves().length; i++) {
            System.out.print(raiz.getLlaves()[i].getLlave()+"|");   
        }
    }
     public void imprimirB(NodoArbol nodoImprimir) {
         if (!nodoImprimir.esHojaf()) {
             System.out.print("      ");
         }
        nodoImprimir.imprimir();
         if (!nodoImprimir.esHojaf()) {
             System.out.println("");
         }

        //miro si no es hoja para recorrer sus hijos, de lo contrario no tiene sentido entrar
        if (!nodoImprimir.esHojaf()) {
            //recorre los nodos para saber si tiene hijos
            for (int j = 0; j <= nodoImprimir.numeroLLaves; j++) {
                if(nodoImprimir.getHijos()[j] != null) {                  
                    imprimirB(nodoImprimir.getHijos()[j]);//vuelvo a imprimir pero ahora en el contexto de su hijo en la posicion del bucle
                }
            }
        }
    }
    
    
}
