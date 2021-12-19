package proyectoedd2_claudioangesagas;

public class Campos {
    private String nombre;
    private String tipo;
    private int byteoffset;
    private boolean llavePrimaria;

    public Campos(String nombre, String tipo, int byteoffset, boolean llavePrimaria) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.byteoffset = byteoffset;
        this.llavePrimaria = llavePrimaria;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getByteoffset() {
        return byteoffset;
    }

    public void setByteoffset(int byteoffset) {
        this.byteoffset = byteoffset;
    }

    public boolean isLlavePrimaria() {
        return llavePrimaria;
    }

    public void setLlavePrimaria(boolean llavePrimaria) {
        this.llavePrimaria = llavePrimaria;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", tipo=" + tipo + ", byteoffset=" + byteoffset + ", llavePrimaria=" + llavePrimaria + '}';
    }
    
    
}
