package vista;
import java.util.ArrayList;
import modelo.Producto;

public class Menu {
    
    
    //metodo que retorna el texto del menu
    public String menuTexto() {
        String menuInicio="""
                     Menu 
        ----------------------------------------------
        1. Agregar un producto
        2. Mostrar lista de productos
        3. Salir
        ----------------------------------------------
                          
                          """;

        return menuInicio;
    }
    

    //metodo para mostrar el inventario
    public String mostrarInventario(ArrayList<Producto> productosList) {//ArrayList es parete de la libreria java.util
        StringBuilder texto = new StringBuilder();//se crea un string builder
       
        
        String inventarioSuperior="""                         
        ============= Lista de Productos ===================
        Nombre\t\tcodigo\t\tfecha de vencimiento
        ====================================================
                                """;

        texto.append(inventarioSuperior);//se guarda al StringBuilder


        //bucle para mostrar los productos existentes separados por nombre,codigo y fecha de vencimiento
        for (Producto producto : productosList) {
            
            texto.append(producto.getNombre()+"\t\t"+producto.getCodigo()+"\t\t"+producto.getFecha()+"\n");
            //se guarda dentro del stringBuilder
        }
        String inventarioInferior="""
        ====================================================                          
                                  """;
        
        texto.append(inventarioInferior);//se guarda al StringBuilder
        
        return texto.toString();
    }
    
 
}