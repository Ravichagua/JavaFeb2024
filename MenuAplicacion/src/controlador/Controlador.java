package controlador;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import vista.Menu;
import modelo.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Controlador {
    Menu instanciaMenu =new Menu();
    gestorNumero instanciaGestorNumero= new gestorNumero();
    gestorFecha instanciaFecha=new gestorFecha();
    public  ArrayList<Producto> listaProductos= new ArrayList<>();
  
      //metodo para agregar producto
    public void agregarProducto() {
         
        //JoptionPage ingreso de nombre
        String nombreIngreso = JOptionPane.showInputDialog(null, "Ingresa nombre del producto:", "Nombre", JOptionPane.QUESTION_MESSAGE);
        if(nombreIngreso==null){           
            iniciar();//volver al menu si se pulsa cancelar
        }
        String nombre=nombreIngreso;
        
        //se llama al metodo obtener codigo con manejo de excepciones
        int codigo=instanciaGestorNumero.obtenerCodigo();
        
        //se llama al metodo obtenerFechaVencimiento con manejo de excepciones
        String fecha=instanciaFecha.obtenerFechaVencimiento();
        
        
        Producto instanciaProducto = new Producto(nombre,codigo,fecha);
        listaProductos.add(instanciaProducto);//se guarda el arreglo 
        
        JOptionPane.showMessageDialog(null, "Producto agregado correctamente.");
    }
    
    
    public void mostrarInventario(){
          
        JOptionPane.showMessageDialog(null, new JTextArea(instanciaMenu.mostrarInventario(listaProductos)), "Inventario", JOptionPane.PLAIN_MESSAGE);
                    
                    
        //Mensaje sobre guardar inventario en un archivo de texto           
        String[] opciones = {"Si", "No"};
        int seleccion = JOptionPane.showOptionDialog(null, "Desea  guardarlo dentro de un archivo de texto?", "Mensaje",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
        if (seleccion == 0) {
            crearArchivo();
        } 
    }
    
    public  void crearArchivo() {       
        File ArchivoDeTexto = new File("Inventario.txt");
        
        //se crea el archivo junto con el manejo de excepciones
        try {
            
        if (ArchivoDeTexto.createNewFile()) {
                JOptionPane.showMessageDialog(null, "Archivo guardado correctamente");  
        } else {
                JOptionPane.showMessageDialog(null, "Archivo guardado correctamente");   
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al crear el archivo");   
        }

        
        //se escribe el archivo junto con el manejo de excepciones
         try {
            FileWriter escritor = new FileWriter("Inventario.txt");
                      
           escritor.write(instanciaMenu.mostrarInventario(listaProductos));
           escritor.close();
            
            //System.out.println("Escritura de archivo completa");            
          } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al crear el archivo"); 
        }      
    }
    
     //metodo para iniciar el programa
    public void iniciar() {    
        int opcion;
        
        do {
            
            instanciaMenu.menuTexto();

            opcion=instanciaGestorNumero.ObtenerOpcion();

            switch (opcion) {
                case 1:
                    agregarProducto();//ingreso de producto
                    break;
                    
                case 2:
                    mostrarInventario();//display inventario
                    break;
                    
                case 3:
                    JOptionPane.showMessageDialog(null, "Hasta luego");//salida
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese un numero del 1 al 3.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (opcion != 3);
    }
}