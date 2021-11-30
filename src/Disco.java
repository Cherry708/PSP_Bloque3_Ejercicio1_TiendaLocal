public class Disco {
    private int codigo;
    private String titulo;
    private String autor;
    private double  precio;
    private int cantidadEjemplares;

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
        return "PruebaTiendaLocal{" +
                "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", precio=" + precio +
                ", cantidadEjemplares=" + cantidadEjemplares +
                '}';
    }

    public void escribeEnFichero(){
        //TODO implemetar logica
    }

    public void leeDeFichero(){
        //TODO implementar logica
    }
}
