package modelo;

//aqui va la clase producto que tiene Nombre,Codigo y FechaVencimiento
public class Producto {
    
    private String nombre;
    private int codigo;
    private String fecha;

    public Producto(String nombre,int codigo,String fecha) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.fecha = fecha;
    }

   // se establecen los gets y sets para que las variables se puedan leer y escribir
    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getCodigo() {
        return codigo;
    }


    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    public String getFecha() {
        return fecha;
    }


    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    
}