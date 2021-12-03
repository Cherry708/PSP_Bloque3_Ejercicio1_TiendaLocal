import java.io.RandomAccessFile;

public class Disco {
    private int codigo;
    private String titulo;
    private String autor;
    private double  precio;
    private int cantidadEjemplares;

    public Disco() {

    }

    public Disco(int codigo, String titulo, String autor, double precio, int cantidadEjemplares){
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.cantidadEjemplares = cantidadEjemplares;
    }



    public void leeDeTeclado(){
        //TODO implementar logica
    }

    @Override
    public String toString() {
        return "TITULO: " + this.titulo + ". CODIGO: " + this.codigo + "\n"
                + "AUTOR: " + this.autor + "\n"
                + "PRECIO: " + this.precio + "CANTIDAD: " + this.cantidadEjemplares;
    }

    public void escribeEnFichero(RandomAccessFile stream){
        //TODO implemetar logica
    }

    public void leeDeFichero(RandomAccessFile stream){
        //TODO implementar logica
    }

    public int getCantidadEjemplares() {
        return cantidadEjemplares;
    }

    public void setCantidadEjemplares(int cantidadEjemplares) {
        this.cantidadEjemplares = cantidadEjemplares;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getAutor() {
        return this.autor;
    }

    public int getCantidad() {
        return this.cantidadEjemplares;
    }
}
