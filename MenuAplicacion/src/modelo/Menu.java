package modelo;
import java.util.ArrayList;

public class Menu {
    //metodo para mostrar el menu de inicio
    public static void mostrarMenu() {
        System.out.println("===== Menu =====");
        System.out.println("1. Agregar un producto");
        System.out.println("2. Mostrar lista de productos");
        System.out.println("3. Salir");
        System.out.println("=================");
        System.out.print("Ingrese su opcion: ");
    }
    //metodo para mostrar el inventario
    public static void mostrarInventario(ArrayList<Producto> productosList) {//ArrayList es parete de la libreria java.util
        System.out.println("\n===== Lista de Productos ============");
        System.out.println("Nombre\t\tcodigo\t\tfecha de vencimiento");
        System.out.println("=====================================");
        
        //bucle para mostrar los productos existentes separados por nombre,codigo y fecha de vencimiento
        for (Producto producto : productosList) {
            System.out.println(producto.getNombre()+"\t\t"+producto.getCodigo()+"\t\t"+producto.getFecha());
        }
       
        System.out.println("=====================================\n");
    }
}