package controlador;

import modelo.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Controlador {
   
  public static ArrayList<Producto> listaProductos= new ArrayList<>();
      
  
      //metodo para agregar producto
  public static void agregarProducto(Scanner scanner) {

        
        System.out.print("Ingrese el nombre del producto: ");
            String nombre = scanner.nextLine();
        System.out.print("Ingrese el codigo del producto: ");
            int codigo = scanner.nextInt();
        System.out.print("Ingrese la fecha de vencimiento ");
            String fecha=gestorFecha.obtenerFechaVencimiento();
        
        Producto producto = new Producto(nombre,codigo,fecha);
        listaProductos.add(producto);
        
        System.out.println("Producto agregado correctamente.");
    }
  
        //metodo para iniciar el programa
    public static void iniciar() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            Menu.mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    agregarProducto(scanner);//ingreso de producto
                    break;
                    
                case 2:
                    Menu.mostrarInventario(listaProductos);//display inventario
                    break;
                    
                case 3:
                    System.out.println("Adios");//salir del programa
                    break;
                default:
                    System.out.println("****Opcion invalida.Intente de nuevo****");
            }
        } while (opcion != 3);
    }
    



}