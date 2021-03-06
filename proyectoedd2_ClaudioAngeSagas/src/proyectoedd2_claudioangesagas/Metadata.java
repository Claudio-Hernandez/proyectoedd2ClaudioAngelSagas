package proyectoedd2_claudioangesagas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Metadata {

    private ArrayList<Campos> campos = new ArrayList<>();
    private Lista avaiList = new Lista();
    private int posAvailList = 0;

    public void escribirCampos(File file) throws IOException {
        FileWriter fw = new FileWriter(file, false);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);

        //Escribir primero la llave Primaria
        for (Campos temp : campos) {
            if (temp.isLlavePrimaria() == true) {
                int llave = 0;
                if (temp.isLlavePrimaria() == true) {
                    llave = 1;
                }
                pw.print(temp.getNombre() + ":" + temp.getTipo() + "[" + temp.getByteoffset() + "]" + llave + ";");
            }
        }

        for (Campos temp : campos) {
            if (temp.isLlavePrimaria() == false) {
                int llave = 0;
                pw.print(temp.getNombre() + ":" + temp.getTipo() + "[" + temp.getByteoffset() + "]" + llave + ";");
            }
        }

        pw.println();
        pw.print("@@@");
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

    public Lista getAvaiList() {
        return avaiList;
    }

    public void setAvaiList(Lista avaiList) {
        this.avaiList = avaiList;
    }

    public int getPosAvailList() {
        return posAvailList;
    }

    public void setPosAvailList(int posAvailList) {
        this.posAvailList = posAvailList;
    }

}
