package modelo;
import vista.Menu;
import javax.swing.JOptionPane;
import controlador.Controlador;


public class gestorNumero {
    Menu menuInstancia=new Menu();
    
    
    //metodo que comprueba si el valor ingresado es un numero entero
    public int obtenerCodigo(){
        Controlador instanciaControlador =new Controlador();
        
        do{
        String codigoIngreso = JOptionPane.showInputDialog(null,"Ingresa el codigo del producto:","Codigo", JOptionPane.QUESTION_MESSAGE);
        
        if(codigoIngreso==null){           
            instanciaControlador.iniciar();//volver al menu si se pulsa cancelar
        }
        
        // Convertir la entrada a un número entero
        try {
            int numero = Integer.parseInt(codigoIngreso);
            // El número se ha ingresado correctamente
            return numero;
            
        } catch (NumberFormatException e) {
            // Si la entrada no es un número válido
            JOptionPane.showMessageDialog(null, "Por favor, ingresa un numero valido", "Error", JOptionPane.ERROR_MESSAGE);
        }
        }while(true);
}
    
    
    
    //metodo que comprueba si el valor ingresado es un numero entero
    public int ObtenerOpcion(){
               
        do{
        
        String opcionIngreso = JOptionPane.showInputDialog(null, menuInstancia.menuTexto(), "Menu", JOptionPane.QUESTION_MESSAGE);
        
        if(opcionIngreso==null){
            System.exit(0);//terminar el programa si se presiona Cancelar
        }
        
        try {
            
            int numero = Integer.parseInt(opcionIngreso);// Convertir la entrada a un número entero
            
            return numero;
            
        } catch (NumberFormatException e) {
            // Si la entrada no es un número válido

            JOptionPane.showMessageDialog(null, "Por favor, ingrese un numero del 1 al 3.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }while(true);
        
        
        
}
}   

