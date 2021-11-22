package proyectoedd2_claudioangesagas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Metadata {

    private ArrayList<Campos> campos = new ArrayList<>();
    private Lista avaiList = new Lista();

    public void escribirCampos(File file) throws IOException {
        FileWriter fw = new FileWriter(file, false);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        
        for (Campos temp : campos) {
            int llave = 0;
            if (temp.isLlavePrimaria()==true) {
                llave = 1;
            }
            pw.print(temp.getNombre() + ":" + temp.getTipo() + "[" + temp.getByteoffset() + "]"+llave + ";");
        }
        pw.println();
        pw.flush();
        pw.close();
    }

    public ArrayList<Campos> getCampos() {
        return campos;
    }

    public void setCampos(ArrayList<Campos> campos) {
        this.campos = campos;
    }

    public void addCampo(Campos pCampo) {
        this.campos.add(pCampo);
    }

}
